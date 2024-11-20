
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base response type for the <b>RespondToBestOffer</b> call. Along with the standard output fields for Trading API calls, this type contains a <b>RespondToBestOffer</b> container that indicates whether or not the action specified in the call request (accept, decline, or counter offer) was successful.
 * 			
 * 
 * <p>Java class for RespondToBestOfferResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondToBestOfferResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="RespondToBestOffer" type="{urn:ebay:apis:eBLBaseComponents}BestOfferArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondToBestOfferResponseType", propOrder = {
    "respondToBestOffer"
})
public class RespondToBestOfferResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RespondToBestOffer")
    protected BestOfferArrayType respondToBestOffer;

    /**
     * Gets the value of the respondToBestOffer property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferArrayType }
     *     
     */
    public BestOfferArrayType getRespondToBestOffer() {
        return respondToBestOffer;
    }

    /**
     * Sets the value of the respondToBestOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferArrayType }
     *     
     */
    public void setRespondToBestOffer(BestOfferArrayType value) {
        this.respondToBestOffer = value;
    }

}
