
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 					Returns the items in an <b>ItemArrayType</b> object for the a seller events that have occurred and that meet any filters specified. There can be zero, one, or multiple <b>ItemType</b> objects. Each <b>ItemType</b> object contains the detail data for one item listing.
 * 			
 * 
 * <p>Java class for GetSellerEventsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerEventsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="TimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}ItemArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerEventsResponseType", propOrder = {
    "timeTo",
    "itemArray"
})
public class GetSellerEventsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar timeTo;
    @XmlElement(name = "ItemArray")
    protected ItemArrayType itemArray;

    /**
     * Gets the value of the timeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTimeTo() {
        return timeTo;
    }

    /**
     * Sets the value of the timeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTo(Calendar value) {
        this.timeTo = value;
    }

    /**
     * Gets the value of the itemArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemArrayType }
     *     
     */
    public ItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * Sets the value of the itemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemArrayType }
     *     
     */
    public void setItemArray(ItemArrayType value) {
        this.itemArray = value;
    }

}
