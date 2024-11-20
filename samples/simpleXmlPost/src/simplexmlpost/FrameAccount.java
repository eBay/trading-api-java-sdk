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

package simplexmlpost;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.ebay.sdk.ApiContext;

/**
 * <p>Title: </p>
 * <p>Description: </p>

 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class FrameAccount extends JFrame {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel3 = new JPanel();
  GridLayout gridLayout1 = new GridLayout();
  JLabel jLabel6 = new JLabel();
  JTextField txtApiUrl = new JTextField();
  JPanel jPanel1 = new JPanel();
  JButton jButtonCancel = new JButton();
  JButton jButtonOK = new JButton();

  //Construct the frame
  public FrameAccount(JFrame parentFrame) {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {

      this.parentFrame = parentFrame;
      jbInit();

      FrameXmlPost xp = (FrameXmlPost)parentFrame;
      this.apiContext = xp.getApiContext();

      this.txtApiUrl.setText(this.apiContext.getApiServerUrl());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  private JFrame parentFrame = null;
  private ApiContext apiContext = null;

  //Component initialization
  private void jbInit() throws Exception  {
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    this.setResizable(false);
    this.setSize(new Dimension(383, 88));
    this.setState(Frame.NORMAL);
    this.setTitle("Server");
    this.addWindowListener(new FrameAccount_this_windowAdapter(this));
    contentPane.setAlignmentY((float) 0.5);
    contentPane.setDebugGraphicsOptions(0);
    contentPane.setDoubleBuffered(true);
    contentPane.setMinimumSize(new Dimension(161, 80));
    contentPane.setOpaque(true);
    contentPane.setPreferredSize(new Dimension(161, 80));
    contentPane.setRequestFocusEnabled(true);
    contentPane.setToolTipText("");
    jPanel3.setLayout(gridLayout1);
    jLabel6.setToolTipText("");
    jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel6.setText("API Server Url");
    txtApiUrl.setText("");

    gridLayout1.setColumns(2);
    gridLayout1.setHgap(0);
    gridLayout1.setRows(1);
    gridLayout1.setVgap(2);
    jButtonCancel.setText("Cancel");
    jButtonCancel.addActionListener(new FrameAccount_jButtonCancel_actionAdapter(this));
    jButtonOK.setText("OK");
    jButtonOK.addActionListener(new FrameAccount_jButtonOK_actionAdapter(this));
    contentPane.add(jPanel3,  BorderLayout.NORTH);
    jPanel3.add(jLabel6, null);
    jPanel3.add(txtApiUrl, null);
    contentPane.add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(jButtonOK, null);
    jPanel1.add(jButtonCancel, null);
}
  //Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }

  void jButtonCancel_actionPerformed(ActionEvent e) {
    this.dispose();
  }

  void this_windowClosed(WindowEvent e) {
    if( this.parentFrame != null )
    {
      this.parentFrame.setEnabled(true);
      this.parentFrame.setVisible(true);
    }
  }

  void jButtonOK_actionPerformed(ActionEvent e) {

    this.apiContext.setApiServerUrl(this.txtApiUrl.getText());

    this.dispose();
  }

}

class FrameAccount_jButtonCancel_actionAdapter implements java.awt.event.ActionListener {
  FrameAccount adaptee;

  FrameAccount_jButtonCancel_actionAdapter(FrameAccount adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonCancel_actionPerformed(e);
  }
}

class FrameAccount_this_windowAdapter extends java.awt.event.WindowAdapter {
  FrameAccount adaptee;

  FrameAccount_this_windowAdapter(FrameAccount adaptee) {
    this.adaptee = adaptee;
  }
  public void windowClosed(WindowEvent e) {
    adaptee.this_windowClosed(e);
  }
}

class FrameAccount_jButtonOK_actionAdapter implements java.awt.event.ActionListener {
  FrameAccount adaptee;

  FrameAccount_jButtonOK_actionAdapter(FrameAccount adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonOK_actionPerformed(e);
  }
}
