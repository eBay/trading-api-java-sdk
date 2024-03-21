
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
 * 				Type defining the <b>Performance</b> container returned in the 
 * 				<b>GetSellerDashboard</b> response. The <b>Performance</b> 
 * 				container consists of the seller's overall selling performance rating on all eBay sites 
 * 				on which the seller is sellling, as well as any alerts related to performance.
 * 			
 * 
 * <p>Java class for PerformanceDashboardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceDashboardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PerformanceStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Alert" type="{urn:ebay:apis:eBLBaseComponents}SellerDashboardAlertType" minOccurs="0"/>
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
@XmlType(name = "PerformanceDashboardType", propOrder = {
    "site",
    "status",
    "alert",
    "any"
})
public class PerformanceDashboardType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Site")
    protected List<SiteCodeType> site;
    @XmlElement(name = "Status")
    protected PerformanceStatusCodeType status;
    @XmlElement(name = "Alert")
    protected SellerDashboardAlertType alert;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType[] getSite() {
        if (this.site == null) {
            return new SiteCodeType[ 0 ] ;
        }
        return ((SiteCodeType[]) this.site.toArray(new SiteCodeType[this.site.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite(int idx) {
        if (this.site == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.site.get(idx);
    }

    public int getSiteLength() {
        if (this.site == null) {
            return  0;
        }
        return this.site.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType[] values) {
        this._getSite().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.site.add(values[i]);
        }
    }

    protected List<SiteCodeType> _getSite() {
        if (site == null) {
            site = new ArrayList<SiteCodeType>();
        }
        return site;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType setSite(int idx, SiteCodeType value) {
        return this.site.set(idx, value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceStatusCodeType }
     *     
     */
    public PerformanceStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceStatusCodeType }
     *     
     */
    public void setStatus(PerformanceStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link SellerDashboardAlertType }
     *     
     */
    public SellerDashboardAlertType getAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerDashboardAlertType }
     *     
     */
    public void setAlert(SellerDashboardAlertType value) {
        this.alert = value;
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
