
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
 * 				This type is used to express sales tax details for one or more tax jurisdictions. The concept of 'sales tax' is only applicable to eBay US and Canada (English and French) sites.
 * 			
 * 
 * <p>Java class for TaxTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxJurisdiction" type="{urn:ebay:apis:eBLBaseComponents}TaxJurisdictionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTableType", propOrder = {
    "taxJurisdiction"
})
public class TaxTableType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TaxJurisdiction")
    protected List<TaxJurisdictionType> taxJurisdiction;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link TaxJurisdictionType }
     *     
     */
    public TaxJurisdictionType[] getTaxJurisdiction() {
        if (this.taxJurisdiction == null) {
            return new TaxJurisdictionType[ 0 ] ;
        }
        return ((TaxJurisdictionType[]) this.taxJurisdiction.toArray(new TaxJurisdictionType[this.taxJurisdiction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link TaxJurisdictionType }
     *     
     */
    public TaxJurisdictionType getTaxJurisdiction(int idx) {
        if (this.taxJurisdiction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.taxJurisdiction.get(idx);
    }

    public int getTaxJurisdictionLength() {
        if (this.taxJurisdiction == null) {
            return  0;
        }
        return this.taxJurisdiction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link TaxJurisdictionType }
     *     
     */
    public void setTaxJurisdiction(TaxJurisdictionType[] values) {
        this._getTaxJurisdiction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.taxJurisdiction.add(values[i]);
        }
    }

    protected List<TaxJurisdictionType> _getTaxJurisdiction() {
        if (taxJurisdiction == null) {
            taxJurisdiction = new ArrayList<TaxJurisdictionType>();
        }
        return taxJurisdiction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionType }
     *     
     */
    public TaxJurisdictionType setTaxJurisdiction(int idx, TaxJurisdictionType value) {
        return this.taxJurisdiction.set(idx, value);
    }

}
