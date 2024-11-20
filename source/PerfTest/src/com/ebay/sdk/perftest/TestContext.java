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

package com.ebay.sdk.perftest;

import org.w3c.dom.*;
import com.ebay.sdk.*;
import com.ebay.sdk.util.*;

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

    static final String CONFIG_XML_NAME = "PerfTestConfig.xml";
    static TestContext globalContext = null;
    private ApiContext apiContext = null;

    public static TestContext getTestContext() throws Exception {
        if (globalContext == null) {
            globalContext = new TestContext();
            globalContext.loadConfiguration();
        }
        return globalContext;
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

        //
        ApiCredential apiCred = new ApiCredential();
        this.apiContext.setApiCredential(apiCred);

        ApiAccount ac = new ApiAccount();
        apiCred.setApiAccount(ac);

        Node eBayCredential = XmlUtil.getChildByName(testConfig,
            "eBayCredential");
        s = XmlUtil.getChildString(eBayCredential, "Token");
        apiCred.seteBayToken(s);

        s = XmlUtil.getChildString(testConfig, "Timeout");
        if (s.length() > 0) {
            int timeout = Integer.parseInt(s);
            this.apiContext.setTimeout(timeout);
        }
    }

    private String getConfigXmlPath() {
        return CONFIG_XML_NAME;
    }
}
