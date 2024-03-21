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

package com.ebay.sdk.sanitytest;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.ebay.sdk.ApiAccount;
import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.ApiLogging;
import com.ebay.sdk.util.XmlUtil;
import com.ebay.sdk.util.eBayUtil;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class TestContext {

    static final String CONFIG_XML_NAME = "SanityTestConfig.xml";
    static TestContext globalContext = null;
    private ApiContext apiContext = null;

    public static TestContext getTestContext() throws Exception {
        if (globalContext == null) {
            globalContext = new TestContext();
            globalContext.loadConfiguration();
        }
        return globalContext;
    }

    static String getConfigXmlText() throws java.io.IOException {
        java.io.InputStream strm = SanityTestGUIRunner.class.getResourceAsStream(
            CONFIG_XML_NAME);
        return eBayUtil.convertInputStreamToString(strm);
    }

    private boolean initializeLogger() throws Exception {
        // set logging in jsdk
        ApiLogging logging = this.apiContext.getApiLogging();
        logging.setLogSOAPMessages(true);
        logging.setLogExceptions(true);

        return false;
    }

    public ApiContext getApiContext() {
        return this.apiContext;
    }

    public void loadConfiguration() throws Exception {
        String xmlPath = this.getConfigXmlPath();
        Document doc = XmlUtil.createDomByPathname(xmlPath);//getConfigXmlText()

        Node testConfig = XmlUtil.getChildByName(doc, "TestConfiguration");
        if (testConfig == null)
            throw new Exception("<TestConfiguration> was not found.");

        String s;

        this.apiContext = new ApiContext();

        s = XmlUtil.getChildString(testConfig, "ServerUrl").trim();
        this.apiContext.setApiServerUrl(s);

        s = XmlUtil.getChildString(testConfig, "EpsServerUrl").trim();
        this.apiContext.setEpsServerUrl(s);

        this.initializeLogger();

        //
        ApiCredential apiCred = new ApiCredential();
        this.apiContext.setApiCredential(apiCred);

        ApiAccount ac = new ApiAccount();
        apiCred.setApiAccount(ac);

        //
        Node apiCredential = XmlUtil.getChildByName(testConfig,
            "ApiCredential");
        s = XmlUtil.getChildString(apiCredential, "Developer");
        ac.setDeveloper(s);
        s = XmlUtil.getChildString(apiCredential, "Application");
        ac.setApplication(s);
        s = XmlUtil.getChildString(apiCredential, "Certificate");
        ac.setCertificate(s);

        Node eBayCredential = XmlUtil.getChildByName(testConfig,
            "eBayCredential");

        s = XmlUtil.getChildString(eBayCredential, "Token");
        apiCred.seteBayToken(s);

        s = XmlUtil.getChildString(testConfig, "RuName");
        if (s.length() > 0) {
            this.apiContext.setRuName(s);
        }

        s = XmlUtil.getChildString(testConfig, "Timeout");
        if (s.length() > 0) {
            int timeout = Integer.parseInt(s);
            this.apiContext.setTimeout(timeout);
        }
    }

    private String getConfigXmlPath() {
        return CONFIG_XML_NAME;
    }

    public void saveConfiguration() throws Exception {
        if (true) {
            return;
        }
        //String dir = eBayUtil.getFullPathOfClass(TestContext.class);
        //String xmlPath = dir + CONFIG_XML_NAME;
        String xmlPath = this.getConfigXmlPath();

        Document doc = XmlUtil.createDomByPathname(xmlPath);

        Node testConfig = XmlUtil.getChildByName(doc, "TestConfiguration");

        XmlUtil.setChildValue(doc, testConfig, "ServerUrl",
            this.apiContext.getApiServerUrl());
        XmlUtil.setChildValue(doc, testConfig, "EpsServerUrl",
            this.apiContext.getEpsServerUrl());

        //XmlUtil.setChildValue(doc, testConfig, "LogFilePath", ?);

        //
        ApiCredential apiCred = this.apiContext.getApiCredential();

        ApiAccount ac = apiCred.getApiAccount();

        //
        Node apiCredential = XmlUtil.getChildByName(testConfig,
            "ApiCredential");

        XmlUtil.setChildValue(doc, apiCredential, "Developer",
            ac.getDeveloper());
        XmlUtil.setChildValue(doc, apiCredential, "Application",
            ac.getApplication());
        XmlUtil.setChildValue(doc, apiCredential, "Certificate",
            ac.getCertificate());

        Node eBayCredential = XmlUtil.getChildByName(testConfig,
            "eBayCredential");
        XmlUtil.setChildValue(doc, eBayCredential, "Token",
            apiCred.geteBayToken());

        // Write the DOM to file.
        XmlUtil.saveDomToFile(doc, xmlPath);
    }
}
