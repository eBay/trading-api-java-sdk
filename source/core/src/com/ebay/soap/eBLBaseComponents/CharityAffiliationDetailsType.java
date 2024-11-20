
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
 * 				This type is used to hold an array of one or more eBay for Charity organizations that are affiliated with the seller's account.
 * 			
 * 
 * <p>Java class for CharityAffiliationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityAffiliationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharityAffiliationDetail" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityAffiliationDetailsType", propOrder = {
    "charityAffiliationDetail"
})
public class CharityAffiliationDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CharityAffiliationDetail")
    protected List<CharityAffiliationDetailType> charityAffiliationDetail;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CharityAffiliationDetailType }
     *     
     */
    public CharityAffiliationDetailType[] getCharityAffiliationDetail() {
        if (this.charityAffiliationDetail == null) {
            return new CharityAffiliationDetailType[ 0 ] ;
        }
        return ((CharityAffiliationDetailType[]) this.charityAffiliationDetail.toArray(new CharityAffiliationDetailType[this.charityAffiliationDetail.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CharityAffiliationDetailType }
     *     
     */
    public CharityAffiliationDetailType getCharityAffiliationDetail(int idx) {
        if (this.charityAffiliationDetail == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.charityAffiliationDetail.get(idx);
    }

    public int getCharityAffiliationDetailLength() {
        if (this.charityAffiliationDetail == null) {
            return  0;
        }
        return this.charityAffiliationDetail.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CharityAffiliationDetailType }
     *     
     */
    public void setCharityAffiliationDetail(CharityAffiliationDetailType[] values) {
        this._getCharityAffiliationDetail().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.charityAffiliationDetail.add(values[i]);
        }
    }

    protected List<CharityAffiliationDetailType> _getCharityAffiliationDetail() {
        if (charityAffiliationDetail == null) {
            charityAffiliationDetail = new ArrayList<CharityAffiliationDetailType>();
        }
        return charityAffiliationDetail;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CharityAffiliationDetailType }
     *     
     */
    public CharityAffiliationDetailType setCharityAffiliationDetail(int idx, CharityAffiliationDetailType value) {
        return this.charityAffiliationDetail.set(idx, value);
    }

}
