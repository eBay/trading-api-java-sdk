
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
 * 			  Type defining the <b>SupportedSellerProfiles</b> container for all payment,
 * 				return, and shipping policy profiles that a seller has defined for a site.
 * 			
 * 
 * <p>Java class for SupportedSellerProfilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedSellerProfilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportedSellerProfile" type="{urn:ebay:apis:eBLBaseComponents}SupportedSellerProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedSellerProfilesType", propOrder = {
    "supportedSellerProfile"
})
public class SupportedSellerProfilesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SupportedSellerProfile")
    protected List<SupportedSellerProfileType> supportedSellerProfile;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SupportedSellerProfileType }
     *     
     */
    public SupportedSellerProfileType[] getSupportedSellerProfile() {
        if (this.supportedSellerProfile == null) {
            return new SupportedSellerProfileType[ 0 ] ;
        }
        return ((SupportedSellerProfileType[]) this.supportedSellerProfile.toArray(new SupportedSellerProfileType[this.supportedSellerProfile.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SupportedSellerProfileType }
     *     
     */
    public SupportedSellerProfileType getSupportedSellerProfile(int idx) {
        if (this.supportedSellerProfile == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.supportedSellerProfile.get(idx);
    }

    public int getSupportedSellerProfileLength() {
        if (this.supportedSellerProfile == null) {
            return  0;
        }
        return this.supportedSellerProfile.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SupportedSellerProfileType }
     *     
     */
    public void setSupportedSellerProfile(SupportedSellerProfileType[] values) {
        this._getSupportedSellerProfile().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.supportedSellerProfile.add(values[i]);
        }
    }

    protected List<SupportedSellerProfileType> _getSupportedSellerProfile() {
        if (supportedSellerProfile == null) {
            supportedSellerProfile = new ArrayList<SupportedSellerProfileType>();
        }
        return supportedSellerProfile;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedSellerProfileType }
     *     
     */
    public SupportedSellerProfileType setSupportedSellerProfile(int idx, SupportedSellerProfileType value) {
        return this.supportedSellerProfile.set(idx, value);
    }

}
