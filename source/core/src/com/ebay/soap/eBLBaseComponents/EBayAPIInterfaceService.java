
package com.ebay.soap.eBLBaseComponents;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "eBayAPIInterfaceService", targetNamespace = "urn:ebay:apis:eBLBaseComponents", wsdlLocation = "file:/Users/lrishi/Documents/TradingAPISDK-Java/source/wsdl/eBaySvc.wsdl")
public class EBayAPIInterfaceService
    extends Service
{

    private final static URL EBAYAPIINTERFACESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.ebay.soap.eBLBaseComponents.EBayAPIInterfaceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.ebay.soap.eBLBaseComponents.EBayAPIInterfaceService.class.getResource(".");
            url = new URL(baseUrl, "file:/Users/lrishi/Documents/TradingAPISDK-Java/source/wsdl/eBaySvc.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/Users/lrishi/Documents/TradingAPISDK-Java/source/wsdl/eBaySvc.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EBAYAPIINTERFACESERVICE_WSDL_LOCATION = url;
    }

    public EBayAPIInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EBayAPIInterfaceService() {
        super(EBAYAPIINTERFACESERVICE_WSDL_LOCATION, new QName("urn:ebay:apis:eBLBaseComponents", "eBayAPIInterfaceService"));
    }

    /**
     * 
     * @return
     *     returns EBayAPIInterface
     */
    @WebEndpoint(name = "eBayAPI")
    public EBayAPIInterface getEBayAPI() {
        return super.getPort(new QName("urn:ebay:apis:eBLBaseComponents", "eBayAPI"), EBayAPIInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EBayAPIInterface
     */
    @WebEndpoint(name = "eBayAPI")
    public EBayAPIInterface getEBayAPI(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ebay:apis:eBLBaseComponents", "eBayAPI"), EBayAPIInterface.class, features);
    }

}
