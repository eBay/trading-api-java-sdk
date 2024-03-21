
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
 * 				Type used by the <b>VeROSiteDetailType</b> container, which is returned in <b>GetVeROReasonCodeDetails</b>. Each <b>VeROSiteDetailType</b> container will contain one or more reasons how an eBay listing could possibly infringe upon the intellectual property rights of a product owner.
 * 			
 * 
 * <p>Java class for VeROSiteDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROSiteDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCodeDetail" type="{urn:ebay:apis:eBLBaseComponents}ReasonCodeDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "VeROSiteDetailType", propOrder = {
    "site",
    "reasonCodeDetail",
    "any"
})
public class VeROSiteDetailType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Site")
    protected SiteCodeType site;
    @XmlElement(name = "ReasonCodeDetail")
    protected List<ReasonCodeDetailType> reasonCodeDetail;
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
     * 
     * 
     * @return
     *     array of
     *     {@link ReasonCodeDetailType }
     *     
     */
    public ReasonCodeDetailType[] getReasonCodeDetail() {
        if (this.reasonCodeDetail == null) {
            return new ReasonCodeDetailType[ 0 ] ;
        }
        return ((ReasonCodeDetailType[]) this.reasonCodeDetail.toArray(new ReasonCodeDetailType[this.reasonCodeDetail.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReasonCodeDetailType }
     *     
     */
    public ReasonCodeDetailType getReasonCodeDetail(int idx) {
        if (this.reasonCodeDetail == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.reasonCodeDetail.get(idx);
    }

    public int getReasonCodeDetailLength() {
        if (this.reasonCodeDetail == null) {
            return  0;
        }
        return this.reasonCodeDetail.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReasonCodeDetailType }
     *     
     */
    public void setReasonCodeDetail(ReasonCodeDetailType[] values) {
        this._getReasonCodeDetail().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.reasonCodeDetail.add(values[i]);
        }
    }

    protected List<ReasonCodeDetailType> _getReasonCodeDetail() {
        if (reasonCodeDetail == null) {
            reasonCodeDetail = new ArrayList<ReasonCodeDetailType>();
        }
        return reasonCodeDetail;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCodeDetailType }
     *     
     */
    public ReasonCodeDetailType setReasonCodeDetail(int idx, ReasonCodeDetailType value) {
        return this.reasonCodeDetail.set(idx, value);
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
