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

import javax.swing.UIManager;

import com.ebay.sdk.helper.ui.DialogAccount;
import com.ebay.sdk.helper.ui.GuiUtil;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class SanityTestGUIRunner {

    public SanityTestGUIRunner() {
        try {
            jbInit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            TestContext context = TestContext.getTestContext();
            DialogAccount dlg = new DialogAccount(null, context.getApiContext(),
                "Config Test Context", true);
            GuiUtil.CenterComponent(dlg);
            dlg.setVisible(true);

            if (!dlg.isCancelled()) {
                context.saveConfiguration();
                junit.swingui.TestRunner runner = new junit.swingui.TestRunner();
                runner.start(new String[] { "-noloading",
                    AllSoapTestsSuite.class.getName() });
            } else
                System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
    }
}
