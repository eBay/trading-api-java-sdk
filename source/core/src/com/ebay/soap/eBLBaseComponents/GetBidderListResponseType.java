
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Response to a <b>GetBidderList</b> call, which retrieves all items the
 * 				user is currently bidding on, or has won or purchased.
 * 			
 * 
 * 
 * 					Response to GetBidderListRequest.
 * 				
 * 
 * <p>Java class for GetBidderListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBidderListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Bidder" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *         &lt;element name="BidItemArray" type="{urn:ebay:apis:eBLBaseComponents}ItemArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBidderListResponseType", propOrder = {
    "bidder",
    "bidItemArray"
})
public class GetBidderListResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Bidder")
    protected UserType bidder;
    @XmlElement(name = "BidItemArray")
    protected ItemArrayType bidItemArray;

    /**
     * Gets the value of the bidder property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getBidder() {
        return bidder;
    }

    /**
     * Sets the value of the bidder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setBidder(UserType value) {
        this.bidder = value;
    }

    /**
     * Gets the value of the bidItemArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemArrayType }
     *     
     */
    public ItemArrayType getBidItemArray() {
        return bidItemArray;
    }

    /**
     * Sets the value of the bidItemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemArrayType }
     *     
     */
    public void setBidItemArray(ItemArrayType value) {
        this.bidItemArray = value;
    }

}
