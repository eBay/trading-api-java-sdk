/*
 * Copyright (c) 2024 eBay Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.ebay.sdk.helper.cache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ebay.sdk.ApiContext;

/**
 * Base class for meta-data cache
 *
 * @author Conan & William
 */
public abstract class BaseDownloader {

    protected ApiContext apiContext;
    protected String FILE_NAME_PATTERN = "{0}_{1}"; // pattern: site_lastUpdateTime
    protected String FILE_EXTENSION = "null"; // specified by subclass
    protected String FILE_PREFIX = ""; // specified by subclass
    protected String ROOT_DIR; //root directory for meta-data cache
    protected String lastUpdateTime; //the latest update time of the meta-data

    public BaseDownloader(ApiContext apiContext) {
        this.apiContext = apiContext;
    }

    //initialize ROOT_DIR and lastUpdateTime
    private void init() throws Exception {
        ROOT_DIR = new File(".").getCanonicalPath();
        this.lastUpdateTime = getLastUpdateTime();
    }

    //search latest file in the root directory
    private String searchFile() throws Exception {
        File dir = new File(ROOT_DIR);
        String[] dataFiles = getDataFiles(dir);
        return foundLatest(dataFiles);
    }

    //find the latest cached file
    private String foundLatest(String[] dataFiles) {
        String name = java.text.MessageFormat.format(
            FILE_PREFIX + "_" + FILE_NAME_PATTERN,
            new Object[] { apiContext.getSite().toString(), lastUpdateTime });
        for (int i = 0; i < dataFiles.length; i++) {
            if (dataFiles[i].startsWith(name)) {
                return dataFiles[i];
            }
        }
        return null;
    }

    //find all data files with specified prefix and extension in the root directory
    private String[] getDataFiles(File dir) {
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                String site = apiContext.getSite().toString();
                return name.startsWith(FILE_PREFIX + "_" + site)
                    && name.endsWith(FILE_EXTENSION);
            }
        };
        String[] files = dir.list(filter);
        return files;
    }

    //get object from xml data
    protected Object getObject() throws Exception {
        init();
        String fileName = searchFile();
        Object obj;
        //if the file is not cached, get live data from ebay site
        if (fileName == null) {
            obj = getFromSite();
        } else {
            //if the file is cached, get cached data
            obj = getFromFile(fileName);
        }
        return obj;
    }

    //get object from cached data file
    private Object getFromFile(String fileName) throws Exception {
        String path = ROOT_DIR + "/" + fileName;
        FileInputStream f_in = new FileInputStream(path);
        ObjectInputStream obj_in = new ObjectInputStream(f_in);
        return obj_in.readObject();

    }

    //get object from ebay site
    private Object getFromSite() throws Exception {
        //call eBay API to get corresponding object
        Object obj = individualCall();
        //cache the object
        saveToDisk(obj);
        return obj;
    }

    //cache object as disk file
    private void saveToDisk(Object obj) throws Exception {
        String name = java.text.MessageFormat.format(
            FILE_PREFIX + "_" + FILE_NAME_PATTERN,
            new Object[] { apiContext.getSite().toString(), lastUpdateTime });
        String path = ROOT_DIR + "/" + name + "." + FILE_EXTENSION;
        FileOutputStream f_out = new FileOutputStream(path);
        ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
        obj_out.writeObject(obj);
    }

    //subclass should implement specific API call
    protected abstract Object individualCall() throws Exception;

    //subclass should implement specific API call to get last update time
    protected abstract String getLastUpdateTime() throws Exception;
}
