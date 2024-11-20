
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base response type of the <b>GetItemShipping</b> call. This call takes an <b>ItemID</b> value for an item that has yet to be shipped, and then returns estimated shipping costs for every shipping service that the seller has offered with the listing. This call will also return the  <b>PickUpInStoreDetails.EligibleForPickupInStore</b> flag if the item is available for buyer pick-up through the In-Store Pickup feature.
 * 			
 * 
 * <p>Java class for GetItemShippingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemShippingResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="PickUpInStoreDetails" type="{urn:ebay:apis:eBLBaseComponents}PickupInStoreDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemShippingResponseType", propOrder = {
    "shippingDetails",
    "pickUpInStoreDetails"
})
public class GetItemShippingResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShippingDetails")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "PickUpInStoreDetails")
    protected PickupInStoreDetailsType pickUpInStoreDetails;

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsType }
     *     
     */
    public ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsType }
     *     
     */
    public void setShippingDetails(ShippingDetailsType value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the pickUpInStoreDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PickupInStoreDetailsType }
     *     
     */
    public PickupInStoreDetailsType getPickUpInStoreDetails() {
        return pickUpInStoreDetails;
    }

    /**
     * Sets the value of the pickUpInStoreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupInStoreDetailsType }
     *     
     */
    public void setPickUpInStoreDetails(PickupInStoreDetailsType value) {
        this.pickUpInStoreDetails = value;
    }

}
