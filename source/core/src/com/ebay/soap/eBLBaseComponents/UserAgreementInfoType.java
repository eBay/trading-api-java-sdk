
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for UserAgreementInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAgreementInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="SellereBayPaymentProcessStatus" type="{urn:ebay:apis:eBLBaseComponents}SellereBayPaymentProcessStatusCodeType" minOccurs="0"/>
 *         &lt;element name="AcceptedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SellereBayPaymentProcessEnableTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserAgreementURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
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
@XmlType(name = "UserAgreementInfoType", propOrder = {
    "site",
    "sellereBayPaymentProcessStatus",
    "acceptedTime",
    "sellereBayPaymentProcessEnableTime",
    "userAgreementURL",
    "any"
})
public class UserAgreementInfoType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Site")
    protected SiteCodeType site;
    @XmlElement(name = "SellereBayPaymentProcessStatus")
    protected SellereBayPaymentProcessStatusCodeType sellereBayPaymentProcessStatus;
    @XmlElement(name = "AcceptedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar acceptedTime;
    @XmlElement(name = "SellereBayPaymentProcessEnableTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar sellereBayPaymentProcessEnableTime;
    @XmlElement(name = "UserAgreementURL")
    @XmlSchemaType(name = "anyURI")
    protected String userAgreementURL;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType value) {
        this.site = value;
    }

    /**
     * Gets the value of the sellereBayPaymentProcessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellereBayPaymentProcessStatusCodeType }
     *     
     */
    public SellereBayPaymentProcessStatusCodeType getSellereBayPaymentProcessStatus() {
        return sellereBayPaymentProcessStatus;
    }

    /**
     * Sets the value of the sellereBayPaymentProcessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellereBayPaymentProcessStatusCodeType }
     *     
     */
    public void setSellereBayPaymentProcessStatus(SellereBayPaymentProcessStatusCodeType value) {
        this.sellereBayPaymentProcessStatus = value;
    }

    /**
     * Gets the value of the acceptedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAcceptedTime() {
        return acceptedTime;
    }

    /**
     * Sets the value of the acceptedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedTime(Calendar value) {
        this.acceptedTime = value;
    }

    /**
     * Gets the value of the sellereBayPaymentProcessEnableTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSellereBayPaymentProcessEnableTime() {
        return sellereBayPaymentProcessEnableTime;
    }

    /**
     * Sets the value of the sellereBayPaymentProcessEnableTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellereBayPaymentProcessEnableTime(Calendar value) {
        this.sellereBayPaymentProcessEnableTime = value;
    }

    /**
     * Gets the value of the userAgreementURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgreementURL() {
        return userAgreementURL;
    }

    /**
     * Sets the value of the userAgreementURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgreementURL(String value) {
        this.userAgreementURL = value;
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
