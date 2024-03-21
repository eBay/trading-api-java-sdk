<%@ page import="com.ebay.sdk.*" %>
<%@ page import="com.ebay.sdk.call.*" %>
<%@ page import="org.apache.commons.text.StringEscapeUtils" %>

<%@ page errorPage="errorPage.jsp" %>

<%

	String username =request.getParameter("username");
	String ruparams = request.getParameter("params");

	if (username != null) {
        username = StringEscapeUtils.escapeHtml4(username);
    }
	
	ApiContext apiContext = (ApiContext) session.getAttribute( "apicontext" );
	String sessionID = (String) session.getAttribute("sessionID");
	
	FetchTokenCall api = new FetchTokenCall(apiContext);
	api.setSessionID(sessionID);
	
	String eBayToken = api.fetchToken();
	String tokenExp = api.getHardExpirationTime().getTime().toString();

%>

<HTML>
	<HEAD>
		<title>Credentials</title>
	</HEAD>
	<BODY text="#333333" bgColor="#ffffff"> <!-- eBay Logo and Developer Program identity -->
		<form id="Credentials" method="post" action="">
			&nbsp;
			<br>
			<table width="600" align="center">
				<tr>
					<td colSpan="4"><font face="arial" size="4" Color="#ec870e"><b>Auth &amp; Auth Token 
								Generator</b></font></td>
				</tr>
				<tr>
					<td colspan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colspan="4">
						<SPAN class="711530421-01042004"><FONT face="arial" size="2">You've successfully 
								generated your token for your application. Please retrieve it below. For more 
								information on Auth &amp; Auth (including new token fetch flow), please refer to the </FONT>
							<a class="link_nav" href="#" onClick="javascript:window.open('https://developer.ebay.com/DevZone/XML/docs/WebHelp/index.htm?context=eBay_XML_API&topic=AuthNAuth');" target="_top">
								<font face="arial" color="#ec870e" size="2">API Documentation.</font></a> </SPAN>
					</td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="4"><font face="arial" size="2" color="#6666cc"><b>Retrieve your token</b></font></td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="4"><font face="arial" size="2"><b>Copy and Paste</b> this token 
							into&nbsp;your application for use when making API requests to eBay.</font></td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colspan="2"><font face="arial" size="2"><b>User:</b></font></td>
					<td colspan="2"><font face="arial" size="2"><i><%=username%></i></font></td>
				</tr>
				<tr>
					<td nowrap valign="top"><font face="arial" size="2"><b>Token:</b></font></td>
					<td>&nbsp;</td>
					<td rowspan="3" colspan="2">
						<textarea id="tokenArea" name="tokenArea" rows="16" cols="60" readonly><%=eBayToken%></textarea></td>
				</tr>
				<tr>
					<td colspan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colspan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colspan="2"><font face="arial" size="2"><b>Expiration:</b></font></td>
					<td colspan="2"><font face="arial" size="2"><i><%=tokenExp%></i></font></td>
				</tr>
				<tr>
					<td colspan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colspan="4">
						<table width="100%">
							<tr>
								<td align="right"><a href="credentials.jsp" class="link_nav"><font color="#ec870e" face="Arial" size="2"><b>Generate 
												another token</b></font></a>&nbsp;<a href="Credentials.jsp" class="link_nav"><img border="0" src="images/link_arrow_orange.gif"></a></td>
								<td>&nbsp;&nbsp;&nbsp;</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td colSpan="2">&nbsp;</td>
					<td noWrap align="right">
					</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
				<tr>
					<td colSpan="4">&nbsp;</td>
				</tr>
			</table>
			</form>
	</BODY>
</HTML>
