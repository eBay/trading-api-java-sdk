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
package com.ebay.sdk.handler;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.xml.namespace.QName;

/**
 * Util for handlers
 * @author boyang
 * @version 1.0
 *
 */
public class HandlerUtil {

	/**
	 * convert a map (key, value) into a string
	 * @param map
	 * @return String
	 */
    public static String outputMap(Map map){
    	StringBuffer output = new StringBuffer(" ");
    	Set entries = map.entrySet();
    	Iterator it = entries.iterator();
    	while (it.hasNext()){
    		Entry entry = (Entry) it.next();
    		Object key = entry.getKey();
    		Object value = entry.getValue();
    		output.append(((key==null)?"null":key.toString()) + " : " + ((value==null)?"null":value.toString()) + "\n");
    	}
    	return output.toString();    	
    }

    /**
     * convert a QName into a string
     * @param name
     * @return String
     */
    public static String outputQName(QName name){
    	StringBuffer output = new StringBuffer(" ");
    	output.append("{" + name.getNamespaceURI()+ "} ");
    	if (name.getPrefix()!= null) output.append(name.getPrefix() + ":");
    	output.append(name.getLocalPart()); 
    	return output.toString();    	
    }
}
