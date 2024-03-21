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

package com.ebay.sdk.helper.ui;

import javax.swing.*;

/**
 * A class to create a check box that can be identified by its id.
 */
public class JIDCheckBox extends JCheckBox {

    String id;

    /**
     * Creates an initially unselected check box button with no id, no text, no icon.
     */
    public JIDCheckBox() {
        super(null, null, false);
        this.id = "";
    }

    /**
     * Creates an initially unselected check box with an id and icon.
     *
     * @param id   String
     * @param icon Icon
     */
    public JIDCheckBox(String id, Icon icon) {
        this(id, null, icon, false);
    }

    /**
     * Creates a check box with an id, an icon and specifies whether
     * or not it is initially selected.
     *
     * @param id       String
     * @param icon     the Icon image to display
     * @param selected a boolean value indicating the initial selection
     *                 state. If <code>true</code> the check box is selected
     */
    public JIDCheckBox(String id, Icon icon, boolean selected) {
        this(id, null, icon, selected);
    }

    /**
     * Creates an initially unselected check box with an id and text.
     *
     * @param id   String
     * @param text the text of the check box.
     */
    public JIDCheckBox(String id, String text) {
        this(id, text, null, false);
    }

    /**
     * Creates a check box with an id and properties taken from the Action supplied.
     *
     * @param id String
     * @param a  Action
     */
    public JIDCheckBox(String id, Action a) {
        super(a);
        this.id = id;
    }

    /**
     * Creates a check box with an id and text, and specifies whether
     * or not it is initially selected.
     *
     * @param id       String
     * @param text     the text of the check box.
     * @param selected a boolean value indicating the initial selection
     *                 state. If <code>true</code> the check box is selected
     */
    public JIDCheckBox(String id, String text, boolean selected) {
        this(id, text, null, selected);
    }

    /**
     * Creates an initially unselected check box with an id, text and icon.
     *
     * @param id   String
     * @param text the text of the check box.
     * @param icon the Icon image to display
     */
    public JIDCheckBox(String id, String text, Icon icon) {
        this(id, text, icon, false);
    }

    /**
     * Creates a check box with id, text and icon,
     * and specifies whether or not it is initially selected.
     *
     * @param id       String
     * @param text     the text of the check box.
     * @param icon     the Icon image to display
     * @param selected a boolean value indicating the initial selection
     *                 state. If <code>true</code> the check box is selected
     */
    public JIDCheckBox(String id, String text, Icon icon, boolean selected) {
        super(text, icon, selected);
        this.id = id;
    }

    /**
     * Return the id of this check box.
     *
     * @return String
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id for this check box.
     *
     * @param id String
     */
    public void setId(String id) {
        this.id = id;
    }
}
