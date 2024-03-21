
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
 * 				Contains information about one seller associated with a registered eBay for Charity nonprofit organization.
 * 			
 * 
 * <p>Java class for CharitySellerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharitySellerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharitySellerStatus" type="{urn:ebay:apis:eBLBaseComponents}CharitySellerStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CharityAffiliation" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "CharitySellerType", propOrder = {
    "charitySellerStatus",
    "charityAffiliation",
    "termsAndConditionsAccepted",
    "any"
})
public class CharitySellerType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CharitySellerStatus")
    protected CharitySellerStatusCodeType charitySellerStatus;
    @XmlElement(name = "CharityAffiliation")
    protected List<CharityAffiliationType> charityAffiliation;
    @XmlElement(name = "TermsAndConditionsAccepted")
    protected Boolean termsAndConditionsAccepted;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the charitySellerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CharitySellerStatusCodeType }
     *     
     */
    public CharitySellerStatusCodeType getCharitySellerStatus() {
        return charitySellerStatus;
    }

    /**
     * Sets the value of the charitySellerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharitySellerStatusCodeType }
     *     
     */
    public void setCharitySellerStatus(CharitySellerStatusCodeType value) {
        this.charitySellerStatus = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CharityAffiliationType }
     *     
     */
    public CharityAffiliationType[] getCharityAffiliation() {
        if (this.charityAffiliation == null) {
            return new CharityAffiliationType[ 0 ] ;
        }
        return ((CharityAffiliationType[]) this.charityAffiliation.toArray(new CharityAffiliationType[this.charityAffiliation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CharityAffiliationType }
     *     
     */
    public CharityAffiliationType getCharityAffiliation(int idx) {
        if (this.charityAffiliation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.charityAffiliation.get(idx);
    }

    public int getCharityAffiliationLength() {
        if (this.charityAffiliation == null) {
            return  0;
        }
        return this.charityAffiliation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CharityAffiliationType }
     *     
     */
    public void setCharityAffiliation(CharityAffiliationType[] values) {
        this._getCharityAffiliation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.charityAffiliation.add(values[i]);
        }
    }

    protected List<CharityAffiliationType> _getCharityAffiliation() {
        if (charityAffiliation == null) {
            charityAffiliation = new ArrayList<CharityAffiliationType>();
        }
        return charityAffiliation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CharityAffiliationType }
     *     
     */
    public CharityAffiliationType setCharityAffiliation(int idx, CharityAffiliationType value) {
        return this.charityAffiliation.set(idx, value);
    }

    /**
     * Gets the value of the termsAndConditionsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTermsAndConditionsAccepted() {
        return termsAndConditionsAccepted;
    }

    /**
     * Sets the value of the termsAndConditionsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTermsAndConditionsAccepted(Boolean value) {
        this.termsAndConditionsAccepted = value;
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
