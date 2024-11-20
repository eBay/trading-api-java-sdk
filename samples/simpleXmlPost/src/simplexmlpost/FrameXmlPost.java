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
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiSchemaBasedXmlPoster;
import com.ebay.sdk.SiteIDUtil;
import com.ebay.sdk.util.XmlUtil;

/**
 * <p>Title: </p>
 * <p>Description: </p>

 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class FrameXmlPost extends JFrame {
  private ApiContext apiContext = new ApiContext();
  private final String TITLE = "SimpleXmlPost";

  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JLabel jLabel1 = new JLabel();
  BorderLayout borderLayout2 = new BorderLayout();
  JPanel jPanel3 = new JPanel();
  BorderLayout borderLayout3 = new BorderLayout();
  JButton btnPostToEBay = new JButton();
  JLabel jLabel2 = new JLabel();
  FlowLayout flowLayout1 = new FlowLayout();
  JButton jButtonServer = new JButton();
  JMenuBar jMenuBarMain = new JMenuBar();
  JMenu jMenu1 = new JMenu();
  JMenuItem jMenuItemExit = new JMenuItem();
  JMenu jMenu2 = new JMenu();
  JMenuItem jMenuItemAbout = new JMenuItem();
  JScrollPane jScrollPane1 = new JScrollPane();
  JTextPane txtRequestXml = new JTextPane();
  JScrollPane jScrollPane2 = new JScrollPane();
  JTextPane txtResponseXml = new JTextPane();
  JMenuItem jMenuItemServer = new JMenuItem();

  //Construct the frame
  public FrameXmlPost() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();

      this.txtRequestXml.setText(
          "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
          "<GeteBayOfficialTimeRequest xmlns=\"urn:ebay:apis:eBLBaseComponents\">\n" +
          "<RequesterCredentials>\n" +
          "<eBayAuthToken>put your token here, remove any carriage return or space before/after the token" +
          "</eBayAuthToken>\n" +
          "</RequesterCredentials>\n" +
          " <DetailLevel>ReturnAll</DetailLevel>\n" +
          "<Version>"+this.apiContext.getWSDLVersion()+"</Version>\n" +
          "</GeteBayOfficialTimeRequest>\n"
      );

      this.apiContext.setApiServerUrl("https://api.ebay.com/ws/api.dll");
      //
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  //Component initialization
  private void jbInit() throws Exception  {
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    this.setJMenuBar(jMenuBarMain);
    this.setSize(new Dimension(538, 418));
    this.setState(Frame.NORMAL);
    this.setTitle("eBay Simple Xml Poster");
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setText("Request Xml to eBay:");
    jPanel1.setLayout(borderLayout2);
    jPanel2.setLayout(borderLayout3);
    jPanel2.setMinimumSize(new Dimension(70, 60));
    jPanel2.setOpaque(true);
    jPanel2.setPreferredSize(new Dimension(70, 60));
    btnPostToEBay.setText("Post To eBay");
    btnPostToEBay.addActionListener(new FrameXmlPost_btnPostToEBay_actionAdapter(this));
    jLabel2.setToolTipText("");
    jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel2.setText("Response Xml from eBay");
    contentPane.setAlignmentY((float) 0.5);
    contentPane.setDoubleBuffered(true);
    contentPane.setMinimumSize(new Dimension(109, 272));
    jPanel3.setLayout(flowLayout1);
    jButtonServer.setText("Server");
    jButtonServer.addActionListener(new FrameXmlPost_jButtonAcount_actionAdapter(this));
    jMenu1.setText("File");
    jMenuItemExit.setText("Exit");
    jMenuItemExit.addActionListener(new FrameXmlPost_jMenuItemExit_actionAdapter(this));
    jMenu2.setText("Help");
    jMenuItemAbout.setText("About");
    jMenuItemAbout.addActionListener(new FrameXmlPost_jMenuItemAbout_actionAdapter(this));
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane1.setToolTipText("");
    jScrollPane1.setVerifyInputWhenFocusTarget(true);
    jPanel1.setMaximumSize(new Dimension(2147483647, 2147483647));
    jPanel1.setMinimumSize(new Dimension(303, 160));
    jPanel1.setOpaque(true);
    jPanel1.setPreferredSize(new Dimension(303, 160));
    jPanel1.setRequestFocusEnabled(true);
    txtResponseXml.setEditable(false);
    txtResponseXml.setText("");
    jMenuItemServer.setText("Server");
    jMenuItemServer.addActionListener(new FrameXmlPost_jMenuItemServer_actionAdapter(this));
    contentPane.add(jPanel1,  BorderLayout.NORTH);
    contentPane.add(jPanel2,  BorderLayout.CENTER);
    contentPane.add(jPanel3,  BorderLayout.SOUTH);
    jPanel3.add(btnPostToEBay, null);
    jPanel3.add(jButtonServer, null);
    jMenuBarMain.add(jMenu1);
    jMenuBarMain.add(jMenu2);
    jMenu1.add(jMenuItemServer);
    jMenu1.add(jMenuItemExit);
    jMenu2.add(jMenuItemAbout);
    jPanel1.add(jScrollPane1, BorderLayout.CENTER);
    jPanel1.add(jLabel1, BorderLayout.NORTH);
    jScrollPane1.getViewport().add(txtRequestXml, null);
    jPanel2.add(jScrollPane2, BorderLayout.CENTER);
    jPanel2.add(jLabel2, BorderLayout.NORTH);
    jScrollPane2.getViewport().add(txtResponseXml, null);
  }

  public ApiContext getApiContext() {
    return this.apiContext;
  }

  public void setApiContext(ApiContext apiContext) {
    this.apiContext = apiContext;
  }

  //Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }

  private void ShowAccountDialog() {
    FrameAccount frame = new FrameAccount(this);
    this.setEnabled(false);
    SimpleXmlPost.CenterFrame(frame);
  }

  void jButtonAcount_actionPerformed(ActionEvent e)
  {
    ShowAccountDialog();
  }

  void jMenuItemExit_actionPerformed(ActionEvent e) {
    this.dispose();
  }

  void jMenuItemAbout_actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(this, "Simple Xml Poster\neBay SDK for Java");
  }

  void btnPostToEBay_actionPerformed(ActionEvent e) {

    try
    {

    	String serverUrl = this.apiContext.getApiServerUrl();
    	if (serverUrl == null || serverUrl.length() == 0) {
          showInfoMessage("Please fill in the API server address first.");
          return;		
    	}
    	
      ApiSchemaBasedXmlPoster axp = new ApiSchemaBasedXmlPoster();
      axp.setApiContext(this.apiContext);

      String resp = axp.postXmlText(SiteIDUtil.toNumericalID(this.apiContext.getSite()),this.txtRequestXml.getText());
      this.txtResponseXml.setText( XmlUtil.getXmlStringFromDom(XmlUtil.createDom(resp)));
    }
    catch (Exception ex)
    {
      String msg = "";
      if( ex instanceof java.lang.NumberFormatException )
        msg = "Please enter a valid number (e.g., 305) as compatibility level.";
      else
        msg = ex.getClass().getName() + ": " + ex.getMessage();

      showErrorMessage(msg);
    }
  }

  void jMenuItemServer_actionPerformed(ActionEvent e) {
    ShowAccountDialog();
  }

  public void showErrorMessage(String error) {
    JOptionPane.showMessageDialog(this, error, TITLE, JOptionPane.ERROR_MESSAGE);
  }

  public void showInfoMessage(String error) {
    JOptionPane.showMessageDialog(this, error, TITLE, JOptionPane.INFORMATION_MESSAGE);
  }
}

class FrameXmlPost_jButtonAcount_actionAdapter implements java.awt.event.ActionListener {
  FrameXmlPost adaptee;

  FrameXmlPost_jButtonAcount_actionAdapter(FrameXmlPost adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonAcount_actionPerformed(e);
  }
}

class FrameXmlPost_jMenuItemExit_actionAdapter implements java.awt.event.ActionListener {
  FrameXmlPost adaptee;

  FrameXmlPost_jMenuItemExit_actionAdapter(FrameXmlPost adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItemExit_actionPerformed(e);
  }
}

class FrameXmlPost_jMenuItemAbout_actionAdapter implements java.awt.event.ActionListener {
  FrameXmlPost adaptee;

  FrameXmlPost_jMenuItemAbout_actionAdapter(FrameXmlPost adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItemAbout_actionPerformed(e);
  }
}

class FrameXmlPost_btnPostToEBay_actionAdapter implements java.awt.event.ActionListener {
  FrameXmlPost adaptee;

  FrameXmlPost_btnPostToEBay_actionAdapter(FrameXmlPost adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.btnPostToEBay_actionPerformed(e);
  }
}

class FrameXmlPost_jMenuItemServer_actionAdapter implements java.awt.event.ActionListener {
  FrameXmlPost adaptee;

  FrameXmlPost_jMenuItemServer_actionAdapter(FrameXmlPost adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItemServer_actionPerformed(e);
  }
}
