
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines the response of the <b>CompleteSale</b> call. There are no call-specific fields in this response, but the seller should look for an <b>Ack</b> value of <code>true</code> in the response, as this value will indicate that the action(s) in the <b>CompleteSale</b> call were successful. If any other <b>Ack</b> value besides <code>true</code> is returned, the seller should look for any returned error messages or warnings.
 * 			
 * 
 * <p>Java class for CompleteSaleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteSaleResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteSaleResponseType")
public class CompleteSaleResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;

}
