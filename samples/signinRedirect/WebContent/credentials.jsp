<%@ page import="com.ebay.sdk.*" %>
<%@ page import="com.ebay.sdk.call.*" %>
<%@ page import="signinredirect.Global" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="org.apache.commons.text.StringEscapeUtils" %>

<%@ page errorPage="errorPage.jsp" %>

<html>
<head>
<title>
eBay signin redirection sample with new token fetch flow
</title>
</head>
<body bgcolor="#ffffff">

<%
  String signInURL = ""; 
  String ApiServerUrl = "";
  String reqError ="";
  String devId = Global.getProperty("devId");
  String certId = Global.getProperty("certId");
  String appId = Global.getProperty("appId");
  //runame of this sample application
  String runame = Global.getProperty("runame");
  
  if (request.getParameter("goToSignin") != null ) {
		reqError="";
		
		int environment = Integer.parseInt(request.getParameter("EnvList"));
		if (environment == 1 ) {
		    // Sandbox
		 	signInURL =Global.getProperty("sandboxSignInUrl");
		 	ApiServerUrl = Global.getProperty("sandboxAPIUrl");
		 	
		} else if (environment ==2) {
		    // Production
		 	signInURL = Global.getProperty("ebaySignInUrl");
		 	ApiServerUrl = Global.getProperty("ebayAPIUrl");
		
		}
		   
		//Get the Credentials Information 
		devId = request.getParameter("DevID");
		if(devId.length() == 0) {
			throw new SdkException("Please enter developer ID.");
		} else {
			devId = StringEscapeUtils.escapeHtml4(devId);
		}

		appId  = request.getParameter("AppID");
		if(appId.length() == 0) {
			throw new SdkException("Please enter application ID.");
		} else {
			appId = StringEscapeUtils.escapeHtml4(appId);
		}

		certId = request.getParameter("CertID");
		if(certId.length() == 0) {
			throw new SdkException("Please enter certificate ID.");
		} else {
			certId = StringEscapeUtils.escapeHtml4(certId);
		}

		//Get the runame
		runame = request.getParameter("RuName");
		if(runame.length() == 0) {
			throw new SdkException("Please enter runame of the sample application");
		} else {
			runame = StringEscapeUtils.escapeHtml4(runame);
		}
		
		ApiContext apiContext = Global.createApiContext(devId, appId, certId, ApiServerUrl );
		ApiLogging apiLogging = new ApiLogging();
		apiContext.setApiLogging(apiLogging);
		session.setAttribute("apicontext", apiContext );
		
		GetSessionIDCall api = new GetSessionIDCall(apiContext);
		api.setRuName(runame);
		
		String ruParams="params="+runame +"-"+(environment==1?"Sandbox":"Production");
		
		try {
			 
			 String sessionID = api.getSessionID();
			 String encodedSesssionIDString =URLEncoder.encode(sessionID,"UTF-8");			 
			 
			 session.setAttribute("sessionID", sessionID);			 
			 response.sendRedirect(response.encodeRedirectURL(signInURL + "&RuName=" + runame + "&SessID=" + encodedSesssionIDString + "&ruparams=" + ruParams));     
		
		} catch(SdkHTTPException ex) {
			reqError = "Call failed: " + ex.getMessage();
		} catch(Exception ex) {
			reqError = ex.getMessage();
		} 
}
%>

<form name="Credentials" method="post">
			<table width="600" align="center">
				<tr>
					<td style="HEIGHT: 21px" align="middle" colSpan="4"><b><i><font face="arial" color="#ff0000"><span id="Message"></span>&nbsp;</font></i></b>
					</td>
				</tr>
				<tr>
					<td colSpan="4"><font face="arial" color="#ec870e" size="4"><b>Auth &amp; Auth Token 
								Generator</b></font></td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="4"><SPAN class="711530421-01042004"><FONT face="arial" size="2"> 
					            This sample program demonstrates use of the redirect form of eBay authentication and authorization. To 
								generate a token, the sample program will redirect you to eBay's sign-in page which will
								validate your eBay UserID &amp; Password.  The sign-in page will then transfer
								control back to this sample program.</FONT>
							<br>
							<font face="arial" size="2">This sample uses the new token fetch flow, For more information on Auth &amp; Auth (including 
								new token fetch flow), please refer to </font><a class="link_nav" href="#" onClick="javascript:window.open('https://developer.ebay.com/DevZone/XML/docs/WebHelp/index.htm?context=eBay_XML_API&topic=AuthNAuth');" target="_top">
								<font face="arial" color="#ec870e" size="2">API Documentation.</font></a> </SPAN>
					</td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="4"><font face="arial" color="#6666cc" size="2"><b>Create a token</b></font></td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td width="150"></td>
					<td noWrap><font face="arial" size="2"><b>1) Select</b> the environment:</font></td>
					<td><select name="EnvList" id="EnvList">
							<!--option value="-1">Please choose</option-->
							<option  selected="selected" value="1">Sandbox</option>
							<option value="2">Production</option>
						
						</select></td>
					<td></td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td colSpan="3"><font face="arial" size="2"><b>2) Enter</b> your security keys:</font></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td noWrap align="right"><font face="arial" size="2"><b>Dev ID:</b></font>&nbsp;&nbsp;</td>
					<td><input name="DevID" type="text" value="<%=devId%>" id="DevID" style="width:240px;" /></td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td noWrap align="right"><font face="arial" size="2"><b>App ID:</b></font>&nbsp;&nbsp;</td>
					<td><input name="AppID" type="text" value="<%=appId%>" id="AppID" style="width:240px;" /></td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td noWrap align="right"><font face="arial" size="2"><b>Cert ID:</b></font>&nbsp;&nbsp;</td>
					<td><input name="CertID" type="text" value="<%=certId%>" id="CertID" style="width:240px;" /></td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td noWrap align="right"><font face="arial" size="2"><b>runame:</b></font>&nbsp;&nbsp;</td>
					<td><input name="RuName" type="text" value="<%=runame%>" id="RuName" style="width:240px;" /></td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="2">&nbsp;</td>
    					<td><input type="submit" name="goToSignin" value="Go to signin..."/></td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td align="middle" colSpan="4"></td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;<%=reqError%></td>
				</tr>
			</table>
		</form>
</body>
</html>
