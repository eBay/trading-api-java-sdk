
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for SellereBayPaymentProcessConsentCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellereBayPaymentProcessConsentCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayoutMethodSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayoutMethod" type="{urn:ebay:apis:eBLBaseComponents}PayoutMethodType" minOccurs="0"/>
 *         &lt;element name="UserAgreementInfo" type="{urn:ebay:apis:eBLBaseComponents}UserAgreementInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellereBayPaymentProcessConsentCodeType", propOrder = {
    "payoutMethodSet",
    "payoutMethod",
    "userAgreementInfo",
    "any"
})
public class SellereBayPaymentProcessConsentCodeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PayoutMethodSet")
    protected Boolean payoutMethodSet;
    @XmlElement(name = "PayoutMethod")
    protected PayoutMethodType payoutMethod;
    @XmlElement(name = "UserAgreementInfo")
    protected List<UserAgreementInfoType> userAgreementInfo;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the payoutMethodSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayoutMethodSet() {
        return payoutMethodSet;
    }

    /**
     * Sets the value of the payoutMethodSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayoutMethodSet(Boolean value) {
        this.payoutMethodSet = value;
    }

    /**
     * Gets the value of the payoutMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutMethodType }
     *     
     */
    public PayoutMethodType getPayoutMethod() {
        return payoutMethod;
    }

    /**
     * Sets the value of the payoutMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutMethodType }
     *     
     */
    public void setPayoutMethod(PayoutMethodType value) {
        this.payoutMethod = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link UserAgreementInfoType }
     *     
     */
    public UserAgreementInfoType[] getUserAgreementInfo() {
        if (this.userAgreementInfo == null) {
            return new UserAgreementInfoType[ 0 ] ;
        }
        return ((UserAgreementInfoType[]) this.userAgreementInfo.toArray(new UserAgreementInfoType[this.userAgreementInfo.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link UserAgreementInfoType }
     *     
     */
    public UserAgreementInfoType getUserAgreementInfo(int idx) {
        if (this.userAgreementInfo == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.userAgreementInfo.get(idx);
    }

    public int getUserAgreementInfoLength() {
        if (this.userAgreementInfo == null) {
            return  0;
        }
        return this.userAgreementInfo.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link UserAgreementInfoType }
     *     
     */
    public void setUserAgreementInfo(UserAgreementInfoType[] values) {
        this._getUserAgreementInfo().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.userAgreementInfo.add(values[i]);
        }
    }

    protected List<UserAgreementInfoType> _getUserAgreementInfo() {
        if (userAgreementInfo == null) {
            userAgreementInfo = new ArrayList<UserAgreementInfoType>();
        }
        return userAgreementInfo;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link UserAgreementInfoType }
     *     
     */
    public UserAgreementInfoType setUserAgreementInfo(int idx, UserAgreementInfoType value) {
        return this.userAgreementInfo.set(idx, value);
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
