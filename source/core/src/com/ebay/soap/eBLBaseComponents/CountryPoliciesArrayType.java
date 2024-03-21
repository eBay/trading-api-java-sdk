
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
 * 				This type specifies custom product compliance and/or take-back policies that apply to a specified country.
 * 		
 * 
 * <p>Java class for CountryPoliciesArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryPoliciesArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryPolicies" type="{urn:ebay:apis:eBLBaseComponents}CountryPoliciesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryPoliciesArrayType", propOrder = {
    "countryPolicies"
})
public class CountryPoliciesArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CountryPolicies")
    protected List<CountryPoliciesType> countryPolicies;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CountryPoliciesType }
     *     
     */
    public CountryPoliciesType[] getCountryPolicies() {
        if (this.countryPolicies == null) {
            return new CountryPoliciesType[ 0 ] ;
        }
        return ((CountryPoliciesType[]) this.countryPolicies.toArray(new CountryPoliciesType[this.countryPolicies.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CountryPoliciesType }
     *     
     */
    public CountryPoliciesType getCountryPolicies(int idx) {
        if (this.countryPolicies == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.countryPolicies.get(idx);
    }

    public int getCountryPoliciesLength() {
        if (this.countryPolicies == null) {
            return  0;
        }
        return this.countryPolicies.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CountryPoliciesType }
     *     
     */
    public void setCountryPolicies(CountryPoliciesType[] values) {
        this._getCountryPolicies().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.countryPolicies.add(values[i]);
        }
    }

    protected List<CountryPoliciesType> _getCountryPolicies() {
        if (countryPolicies == null) {
            countryPolicies = new ArrayList<CountryPoliciesType>();
        }
        return countryPolicies;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPoliciesType }
     *     
     */
    public CountryPoliciesType setCountryPolicies(int idx, CountryPoliciesType value) {
        return this.countryPolicies.set(idx, value);
    }

}
