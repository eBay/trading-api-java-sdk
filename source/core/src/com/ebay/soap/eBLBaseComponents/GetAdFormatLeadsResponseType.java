
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns number of leads and contact and other information for each lead. One
 * 				AdFormatLead node is returned for each lead.
 * 			
 * 
 * <p>Java class for GetAdFormatLeadsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAdFormatLeadsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AdFormatLead" type="{urn:ebay:apis:eBLBaseComponents}AdFormatLeadType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdFormatLeadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAdFormatLeadsResponseType", propOrder = {
    "adFormatLead",
    "adFormatLeadCount"
})
public class GetAdFormatLeadsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AdFormatLead")
    protected List<AdFormatLeadType> adFormatLead;
    @XmlElement(name = "AdFormatLeadCount")
    protected Integer adFormatLeadCount;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AdFormatLeadType }
     *     
     */
    public AdFormatLeadType[] getAdFormatLead() {
        if (this.adFormatLead == null) {
            return new AdFormatLeadType[ 0 ] ;
        }
        return ((AdFormatLeadType[]) this.adFormatLead.toArray(new AdFormatLeadType[this.adFormatLead.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AdFormatLeadType }
     *     
     */
    public AdFormatLeadType getAdFormatLead(int idx) {
        if (this.adFormatLead == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.adFormatLead.get(idx);
    }

    public int getAdFormatLeadLength() {
        if (this.adFormatLead == null) {
            return  0;
        }
        return this.adFormatLead.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AdFormatLeadType }
     *     
     */
    public void setAdFormatLead(AdFormatLeadType[] values) {
        this._getAdFormatLead().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.adFormatLead.add(values[i]);
        }
    }

    protected List<AdFormatLeadType> _getAdFormatLead() {
        if (adFormatLead == null) {
            adFormatLead = new ArrayList<AdFormatLeadType>();
        }
        return adFormatLead;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatLeadType }
     *     
     */
    public AdFormatLeadType setAdFormatLead(int idx, AdFormatLeadType value) {
        return this.adFormatLead.set(idx, value);
    }

    /**
     * Gets the value of the adFormatLeadCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdFormatLeadCount() {
        return adFormatLeadCount;
    }

    /**
     * Sets the value of the adFormatLeadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdFormatLeadCount(Integer value) {
        this.adFormatLeadCount = value;
    }

}
