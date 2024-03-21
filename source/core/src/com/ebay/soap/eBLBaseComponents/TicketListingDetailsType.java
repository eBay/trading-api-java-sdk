
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					This type and its fields are not usable and will be ignored if sent. See <a href="https://developer.ebay.com/develop/apis/api-deprecation-status">API Deprecation Status</a> for the decommission date (when this type will stop being returned).
 * 				</span>
 * 				Type defining the <b>TicketListingDetails</b> container, which is used in
 * 				an <b>Add</b>/<b>Revise</b>/<b>Relist</b> call to provide more details about event tickets.
 * 			
 * 
 * <p>Java class for TicketListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Venue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketListingDetailsType", propOrder = {
    "eventTitle",
    "venue",
    "printedDate",
    "printedTime",
    "any"
})
public class TicketListingDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EventTitle")
    protected String eventTitle;
    @XmlElement(name = "Venue")
    protected String venue;
    @XmlElement(name = "PrintedDate")
    protected String printedDate;
    @XmlElement(name = "PrintedTime")
    protected String printedTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eventTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTitle() {
        return eventTitle;
    }

    /**
     * Sets the value of the eventTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTitle(String value) {
        this.eventTitle = value;
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenue(String value) {
        this.venue = value;
    }

    /**
     * Gets the value of the printedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintedDate() {
        return printedDate;
    }

    /**
     * Sets the value of the printedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintedDate(String value) {
        this.printedDate = value;
    }

    /**
     * Gets the value of the printedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintedTime() {
        return printedTime;
    }

    /**
     * Sets the value of the printedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintedTime(String value) {
        this.printedTime = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
