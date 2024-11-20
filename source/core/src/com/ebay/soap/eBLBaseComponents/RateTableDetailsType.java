
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
 * 			   This type is used to reference a seller's specific domestic and/or international shipping rate tables. Shipping rate tables allow sellers to configure specific shipping costs based on the shipping destinations and level of service (e.g. economy, standard, expedite, and one-day). Generally speaking, sellers want to use these shipping rate tables so they can charge a higher shipping cost to the buyer whenever shipping costs are higher for them as well. For example, shipping to Alaska or Hawaii is generally more expensive than shipping to any other of the 48 US states, or in regards to international shipping, shipping to some regions and countries are more expensive than others.
 *    			 <br><br>
 * 				 Sellers configure domestic, international, and regional shipping rate tables in My eBay Shipping Preferences. To apply shipping rate tables, the shipping cost type must be flat-rate.
 * 				 <br><br>
 * 				 For domestic shipping rate tables, the three supported domestic regions are Alaska & Hawaii, US Protectorates (e.g. Puerto Rico and Guam), and APO/FPO destinations, which are US military bases/locations outside of the continental US. In addition to setting one flat rate based on the destination and service level, the seller also has the option of adding an extra charge based on the weight of the shipping package, or they can add a surcharge instead.
 * 				 <br><br>
 * 				 For international shipping rate tables, specific rates may be set up for any and all geographical regions and individual countries within those regions. Similar to domestic shipping rate tables, the seller has the option of adding an extra charge based on the weight of the shipping package. Sellers cannot add a surcharge for international shipping.
 * 				 <br/><br/>
 * 				 <span class="tablenote"><b>Note: </b> The capability to create and use multiple domestic and international shipping rate tables (up to 40 per seller account) has rolled out to the US, Australia, Canada (English and French), Italy, UK, and Germany sites. For other sites, only one domestic and one international shipping rate table may be set up per seller. Until the seller's account is updated with the new shipping rate tables in My eBay, the seller will continue to use the <b>DomesticRateTable</b> and <b>InternationalRateTable</b> tags and pass in <code>Default</code> as the value. Once the seller's account is updated with the new shipping rate tables in My eBay, the seller will be required to use the new <b>DomesticRateTableId</b> and <b>InternationalRateTableId</b> tags, and the <b>DomesticRateTable</b> and <b>InternationalRateTable</b> tags will not work.  Note that shipping rate tables can also be applied to Shipping business policies that are applied against a listing. The new shipping rate tables have all of the functionality of the old shipping rate tables, plus the seller has access to all domestic regions and not just the special regions (such as Alaska & Hawaii, US Protectorates, and APO/FPO locations in US).</span>
 * 			
 * 
 * <p>Java class for RateTableDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateTableDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticRateTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalRateTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomesticRateTableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalRateTableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RateTableDetailsType", propOrder = {
    "domesticRateTable",
    "internationalRateTable",
    "domesticRateTableId",
    "internationalRateTableId",
    "any"
})
public class RateTableDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DomesticRateTable")
    protected String domesticRateTable;
    @XmlElement(name = "InternationalRateTable")
    protected String internationalRateTable;
    @XmlElement(name = "DomesticRateTableId")
    protected String domesticRateTableId;
    @XmlElement(name = "InternationalRateTableId")
    protected String internationalRateTableId;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the domesticRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticRateTable() {
        return domesticRateTable;
    }

    /**
     * Sets the value of the domesticRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticRateTable(String value) {
        this.domesticRateTable = value;
    }

    /**
     * Gets the value of the internationalRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalRateTable() {
        return internationalRateTable;
    }

    /**
     * Sets the value of the internationalRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalRateTable(String value) {
        this.internationalRateTable = value;
    }

    /**
     * Gets the value of the domesticRateTableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticRateTableId() {
        return domesticRateTableId;
    }

    /**
     * Sets the value of the domesticRateTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticRateTableId(String value) {
        this.domesticRateTableId = value;
    }

    /**
     * Gets the value of the internationalRateTableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalRateTableId() {
        return internationalRateTableId;
    }

    /**
     * Sets the value of the internationalRateTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalRateTableId(String value) {
        this.internationalRateTableId = value;
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
