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

package com.ebay.sdk.pictureservice.eps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.File;
import java.io.FileInputStream;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import com.ebay.soap.eBLBaseComponents.*;
import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiLogging;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.SiteIDUtil;
import com.ebay.sdk.pictureservice.PictureInfo;
import com.ebay.sdk.pictureservice.PictureService;
import com.ebay.soap.eBLBaseComponents.UploadSiteHostedPicturesRequestType;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.ObjectFactory;
import org.apache.commons.text.StringEscapeUtils;

import com.ebay.sdk.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;


/**
 * <p>Title: eBayPictureServiceXMLCall </p>
 * <p>Description:  Defines object that uploads pictures to EPS server and get
 * the uploaded URLs back, this class use the new Schema XML call.</p>
 * EpsServerUrl:
 * for production, use: http://api.ebay.com/ws/api.dll
 * for sandbox, use: http://api.sandbox.ebay.com/ws/api.dll
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: eBay Inc.</p>
 * @author Conan Zhou
 * @version 1.0
 */
public class eBayPictureServiceXMLCall implements PictureService {

	private ApiContext apiContext;
	
	private static final Logger log = LoggerFactory.getLogger(eBayPictureServiceXMLCall.class);
	
	public eBayPictureServiceXMLCall(ApiContext apiContext){
		this.apiContext = apiContext;
	}
	
		    
	//This method supports only a URL, not a local file path.	
	public UploadSiteHostedPicturesResponseType uploadSiteHostedPictures(UploadSiteHostedPicturesRequestType request)
	{
		  //get ApiLogging
    	  ApiLogging apiLogging = apiContext.getApiLogging();
    	  
    	  UploadSiteHostedPicturesResponseType response = null;
		
    	try{
			
	        //Convert the request object into XML Document
			Document doc = this.marshal(request);
	        
	        //Add eBay API token to the document
	        addAuthToken(doc);
        	if (apiLogging != null && apiLogging.isLogSOAPMessages()) {
        		String formattedReqXmlString = XmlUtil.getXmlStringFromDom(doc);
	        	logMessage("UploadSiteHostedPicturesRequest", formattedReqXmlString);
        	}
	        
	        //Convert XML Document to XML String
	        String requestXml = xmlToString(doc);
	        
        
	        String responseXml=sendHttpRequest(requestXml);
	        
            if (apiLogging != null && apiLogging.isLogSOAPMessages()) {
                Document respDom = XmlUtil.createDom(responseXml);
                String formattedRespXmlString = XmlUtil.getXmlStringFromDom(respDom);
                logMessage("UploadSiteHostedPicturesResponse", formattedRespXmlString);
            }
            
            response=unmarshal(responseXml);
            
        } catch (Exception e) {
        //handle your exception here
        }
        return response;		

	}
	
	
	
	
	private String sendHttpRequest(String requestXml)
	{
		try
		{
		
		    URL url = new URL(apiContext.getEpsServerUrl());
	        // open SSL https connection
	        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
	        conn.setRequestMethod("POST");
	        conn.setDoInput(true);
	        conn.setDoOutput(true);
	        conn.setRequestProperty("Content-Type", "text/xml");
	        
	        // required headers
	        conn.addRequestProperty("X-EBAY-API-SITEID",
	        		String.valueOf(SiteIDUtil.toNumericalID(this.apiContext.getSite())));
	        conn.setRequestProperty("X-EBAY-API-CALL-NAME", "UploadSiteHostedPictures");
	        conn.addRequestProperty("X-EBAY-API-COMPATIBILITY-LEVEL", apiContext.getWSDLVersion());
		   
		    //set X-EBAY-API-IAF-TOKEN http request header with OAuthToken value 
		    String oAuthToken = apiContext.getApiCredential().getOAuthToken();
			String tokenString = apiContext.getApiCredential().geteBayToken();
		    if ( (oAuthToken != null || oAuthToken.trim().length() > 0) && 
		       (tokenString == null || tokenString.trim().length() == 0)) {
			  conn.addRequestProperty("X-EBAY-API-IAF-TOKEN", oAuthToken);
			
		    }
	        PrintWriter output = new PrintWriter(new OutputStreamWriter(conn.getOutputStream()));
	        
	        output.println(requestXml);
	        output.close();
	        conn.connect();
	        InputStreamReader isr = new InputStreamReader(conn.getInputStream());	        
	        
	        BufferedReader reader = new BufferedReader(isr);
			StringBuffer buf = new StringBuffer();
		    String line;

		    while ( (line = reader.readLine()) != null) {
		      buf.append(line + "\n");
		    }
		    
		    String responseXml=buf.toString();
		    
		    isr.close();
			reader.close();
		
			
			
			return responseXml;
	        	        
	        
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
	 
	}
	
	
	
	
	
	
	
	
	/**
	   * Upload one picture file to EPS server, this interface is for those
	   * who want to operate on UploadSiteHostedPicturesRequestType directly.
	   * This interface use the new Schema XML call.
       * @param picInfo Contains the local picture file path, uploading error,
       * response object and URL if the uploading succeeded.
	   * @param request, the UploadSiteHostedPicturesRequestType object.
	   * @return true means the uploading succeeded. Otherwise check picInfo
	   * for detailed error information.
	   */
	public boolean UpLoadSiteHostedPicture(PictureInfo picInfo, UploadSiteHostedPicturesRequestType request) {
		
		//get ApiLogging
    	ApiLogging apiLogging = apiContext.getApiLogging();
		
    	try{
			
	        //Serialize the request into the XML Document
			Document doc = this.marshal(request);
	        
	        //Add eBay API token to the document
	        addAuthToken(doc);
        	if (apiLogging != null && apiLogging.isLogSOAPMessages()) {
        		String formattedReqXmlString = XmlUtil.getXmlStringFromDom(doc);
	        	logMessage("UploadSiteHostedPicturesRequest", formattedReqXmlString);
        	}
	        
	        //Convert XML Document to XML String
	        String requestXmlString = xmlToString(doc);
	        
	        //Send file and get response string
	        String respString = sendFile(picInfo.getPictureFilePath(), requestXmlString);
        	if (apiLogging != null && apiLogging.isLogSOAPMessages()) {
        		Document respDom = XmlUtil.createDom(respString);
        		String formattedRespXmlString = XmlUtil.getXmlStringFromDom(respDom);
	        	logMessage("UploadSiteHostedPicturesResponse", formattedRespXmlString);
        	}
	        
	        //Deserialize the response String into UploadSiteHostedPicturesResponseType object
	        UploadSiteHostedPicturesResponseType response = unmarshal(respString);
	        
	        //Update PictureInfo object
	        picInfo.setReponse(response);
			
			//success case
	        if ( response.getErrors() == null || response.getErrors().length == 0 ) {
				picInfo.setURL(response.getSiteHostedPictureDetails().getFullURL());
				return true;
			}
			
	        //warning case
			if ( response.getErrors().length > 0 && response.getAck() == AckCodeType.WARNING) {
				picInfo.setURL(response.getSiteHostedPictureDetails().getFullURL());
				
				picInfo.setErrorType("PICTURE SERVICE RESPONSE WARNING");
				picInfo.setErrorMessage(response.getErrors()[0].getShortMessage());
				
	    		if (apiLogging != null && apiLogging.isLogExceptions()) {
	    			log.warn("PICTURE SERVICE RESPONSE WARNING");
	    			log.warn(response.getErrors()[0].getShortMessage());
	    		}
				
				return true;
			}
			
			//error case
			picInfo.setErrorType("PICTURE SERVICE RESPONSE ERROR");
			picInfo.setErrorMessage(response.getErrors()[0].getShortMessage());
			
    		if (apiLogging != null && apiLogging.isLogExceptions()) {
    			log.error("PICTURE SERVICE RESPONSE ERROR");
    			log.error(response.getErrors()[0].getShortMessage());
    		}
			
			return false;
		} catch (Exception e) {
			picInfo.setErrorType("PICTURE SERVICE UPLOAD ERROR");
			picInfo.setErrorMessage(e.getMessage());
			
    		if (apiLogging != null && apiLogging.isLogExceptions()) {
    			log.error("fail to upload picture to eBay picture server!");
    			log.error(e.getMessage());
    		}
    		
			return false;
		}
	}
	
	private void logMessage(String msgName, String msgStr) {
		String reqTime = eBayUtil.toAPITimeString(java.util.Calendar.getInstance().getTime());
        log.info(java.text.MessageFormat.format("[{0}][{1}][{2}]\n",
                new Object[] {msgName, 
        		reqTime,
                this.apiContext.getEpsServerUrl()}));
        log.info(msgStr);
	} 
	
	
	  /**
	   * Upload one picture file to EPS server.
       * @param picInfo Contains the local picture file path, uploading error,
       * response object and URL if the uploading succeeded.
	   * @return true means the uploading succeeded. Otherwise check picInfo
	   * for detailed error information.
	   */
	
	public boolean uploadPicture(PictureInfo picInfo) {

		UploadSiteHostedPicturesRequestType request = new UploadSiteHostedPicturesRequestType();
		
		return UpLoadSiteHostedPicture(picInfo, request);
	}
	
	

	  /**
	   * Upload list of picture files to EPS server.
	   * @param picInfoList List of PictureInfo objects. Each object contains
	   * the local picture file path, uploading error, response object and URI if the uploading
	   * succeeded.
	   * @return Number of pictures that have been successfully uploaded. Loop
	   * through picInfoList for individual uploading error.
	   */
	
	
	public int uploadPictures(PictureInfo[] picInfoList) {
		
    	int nSuccess = 0;
      	for(int i = 0; i < picInfoList.length; i++ )
      	{
        	if( uploadPicture( picInfoList[i]) )
          		nSuccess ++;
      	}
		
      	return nSuccess;
	}
	/**
	 * Convert an XML Document to an XML String
	 * @param doc, XML Document
	 * @return string representation of the XML document
	 * @throws TransformerException
	 */
	private String xmlToString(Document doc) throws TransformerException {
		Source source = new DOMSource(doc);
		StringWriter stringWriter = new StringWriter();
		Result result = new StreamResult(stringWriter);
		TransformerFactory factory = TransformerFactory.newInstance();
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");

		Transformer transformer = factory.newTransformer();
		transformer.transform(source, result);
		return stringWriter.getBuffer().toString();
	}
	
	/**
	 * Serialize an UploadSiteHostedPicturesRequestType object into
	 * an XML Document
	 * @param uploadSiteHostedPicturesRequest, the UploadSiteHostedPicturesRequestType object
	 * @return XML Document
	 * @throws JAXBException
	 * @throws ParserConfigurationException
	 */
	private Document marshal(UploadSiteHostedPicturesRequestType uploadSiteHostedPicturesRequest) throws JAXBException, ParserConfigurationException {
		
        JAXBContext reqContext = JAXBContext.newInstance(
        		new Class[]{com.ebay.soap.eBLBaseComponents.UploadSiteHostedPicturesRequestType.class}); 
        Marshaller marshaller = reqContext.createMarshaller();
        if(uploadSiteHostedPicturesRequest == null){
        	uploadSiteHostedPicturesRequest = new UploadSiteHostedPicturesRequestType();
        }
        JAXBElement<UploadSiteHostedPicturesRequestType> reqElement = 
        	(new ObjectFactory()).createUploadSiteHostedPicturesRequest(uploadSiteHostedPicturesRequest);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setXIncludeAware(false);
		dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);	
		dbf.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
		dbf.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");

		DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();
        marshaller.marshal(reqElement, doc);
        
        return doc;
	}
	
	/**
	 * Deserialize an XML string into an UploadSiteHostedPicturesResponseType object
	 * @param responseXmlString, response XML string
	 * @return the UploadSiteHostedPicturesResponseType object
	 * @throws JAXBException
	 */
	private UploadSiteHostedPicturesResponseType unmarshal(String responseXmlString) throws JAXBException {
		
        JAXBContext respContext = JAXBContext.newInstance(
        		new Class[]{com.ebay.soap.eBLBaseComponents.UploadSiteHostedPicturesResponseType.class}); 
        Unmarshaller unmarshaller = respContext.createUnmarshaller();

		XMLInputFactory xif = XMLInputFactory.newFactory();
    	// Disable DTDs
    	xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);

		XMLStreamReader xsr = xif.createXMLStreamReader(new StringReader(responseXmlString));
        JAXBElement<UploadSiteHostedPicturesResponseType> respElement = 
            (JAXBElement<UploadSiteHostedPicturesResponseType>) unmarshaller.unmarshal(xsr);
        UploadSiteHostedPicturesResponseType response = respElement.getValue();
        return response;
	}
	
	/**
	 * Send the picture file using HttpsURLConnection
	 * @param fileName, the full path of the picture file to be uploaded
	 * @param requestXmlString, request XML string
	 * @return response XML string
	 * @throws IOException
	 */
	private String sendFile(String fileName, String requestXmlString) throws IOException {
		// Sanitize the fileName and requestXmlString parameters
    	fileName = StringEscapeUtils.escapeJava(fileName);
    	requestXmlString = StringEscapeUtils.escapeXml11(requestXmlString);

		//Get Http connection
		URL u = new URL(apiContext.getEpsServerUrl());
		HttpsURLConnection c = (HttpsURLConnection) u.openConnection();
		
		setConnectionProperty(c);
		
		//First part of the request body
		String	reqStr1= "--" + BOUNDARY + CRLF
		+ "Content-Disposition: form-data; name=document" + CRLF
		+ "Content-Type: text/xml; charset=\"UTF-8\"" + CRLF + CRLF
		+ requestXmlString
		+ CRLF + "--" + BOUNDARY + CRLF
		+ "Content-Disposition: form-data; name=image; filename=image" + CRLF
		+ "Content-Transfer-Encoding: binary" + CRLF
		+ "Content-Type: application/octet-stream" + CRLF + CRLF;
	 
	    //Last part of the request body
		String reqStr2 = CRLF + "--" + BOUNDARY + "--" + CRLF;

		//Read in the file to be sent
	    byte[] content = readInFile(fileName);
	    
		//Send the request
	    c.connect();
		OutputStream os = c.getOutputStream();
		os.write(reqStr1.getBytes());
		os.write(content);
		os.write(reqStr2.getBytes());
		os.flush();
		os.close();
		
		//Read in the response
		StringBuffer buf = readInResponse(c);
		
		c.disconnect();
		
		//Return the response string
		return buf.toString();
	}

	private StringBuffer readInResponse(HttpsURLConnection c) throws IOException {
		InputStreamReader is = new InputStreamReader(c.getInputStream());
		BufferedReader reader = new BufferedReader(is);
		StringBuffer buf = new StringBuffer();
	    String line;

	    while ( (line = reader.readLine()) != null) {
	      buf.append(line + "\n");
	    }
	    
	    is.close();
		reader.close();
		return buf;
	}

	private byte[] readInFile(String fileName) throws FileNotFoundException,
			IOException {
		File file = new File(fileName);

		if(fileName.contains("..")){
			throw new IllegalArgumentException("Invalid file name");
		}

	    FileInputStream fin = new FileInputStream(file);
	    byte[] content = new byte[(int)file.length()];
	    fin.read(content);
	    fin.close();
		return content;
	}

	private void setConnectionProperty(HttpsURLConnection c)
			throws ProtocolException {
		c.setRequestMethod("POST");
		//c.setRequestProperty("ProtocolVersion", "HTTP/1.0");
		//Set request headers
		c.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
		c.addRequestProperty("X-EBAY-API-COMPATIBILITY-LEVEL", apiContext.getWSDLVersion());
        
		c.addRequestProperty("X-EBAY-API-CALL-NAME", API_CALL_NAME);
		
		c.addRequestProperty("X-EBAY-API-SITEID",
        		String.valueOf(SiteIDUtil.toNumericalID(this.apiContext.getSite())));
		c.addRequestProperty("X-EBAY-API-DETAIL-LEVEL","0");
		
		//set X-EBAY-API-IAF-TOKEN http request header with OAuthToken value 
		String tokenString = apiContext.getApiCredential().geteBayToken();
		String oAuthToken = apiContext.getApiCredential().getOAuthToken();
		if ( (oAuthToken != null || oAuthToken.trim().length() > 0) && 
		     (tokenString == null || tokenString.trim().length() == 0)) {
			c.addRequestProperty("X-EBAY-API-IAF-TOKEN", oAuthToken);
			
		}
		//Set additional request properties
		c.setUseCaches(false);
		c.setDoInput(true);
		c.setDoOutput(true);
	}

	/**
	 * Add eBay API authentication token to the XML Document
	 * @param doc, XML Document
	 * @throws SdkException
	 */
	private void addAuthToken(Document doc) throws SdkException{
		Node node = XmlUtil.getChildByName(doc, "UploadSiteHostedPicturesRequest");
		String tokenString = apiContext.getApiCredential().geteBayToken();
		String oAuthToken = apiContext.getApiCredential().getOAuthToken();
		if(tokenString == null || tokenString.trim().length() == 0){
			if(oAuthToken == null || oAuthToken.trim().length() == 0){
				throw new SdkException("No Token Found!!!");
			}
		} else if(tokenString != null || tokenString.trim().length() > 0){	
		    Node requesterCredentials = XmlUtil.appendChildNode(doc, EBAY_NAMESPACE, node, "RequesterCredentials");
		    XmlUtil.appendChildNode(doc, requesterCredentials, "eBayAuthToken", tokenString);
		}
	}

	private static final String EBAY_NAMESPACE = "urn:ebay:apis:eBLBaseComponents";
	private static final String API_CALL_NAME = "UploadSiteHostedPictures";
	//Boundary used for multipart. This could be anything as long
	//as the two hiphens are there.
	private static final String BOUNDARY = "gc0p4Jq0M2Yt08jU534c0p";
	private static final String CRLF = "\r\n";
}
