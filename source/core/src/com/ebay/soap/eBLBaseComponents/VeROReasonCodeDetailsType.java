
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
 * 				Container for reason code details for all sites.
 * 			
 * 
 * <p>Java class for VeROReasonCodeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReasonCodeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VeROSiteDetail" type="{urn:ebay:apis:eBLBaseComponents}VeROSiteDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReasonCodeDetailsType", propOrder = {
    "veROSiteDetail"
})
public class VeROReasonCodeDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VeROSiteDetail")
    protected List<VeROSiteDetailType> veROSiteDetail;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link VeROSiteDetailType }
     *     
     */
    public VeROSiteDetailType[] getVeROSiteDetail() {
        if (this.veROSiteDetail == null) {
            return new VeROSiteDetailType[ 0 ] ;
        }
        return ((VeROSiteDetailType[]) this.veROSiteDetail.toArray(new VeROSiteDetailType[this.veROSiteDetail.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link VeROSiteDetailType }
     *     
     */
    public VeROSiteDetailType getVeROSiteDetail(int idx) {
        if (this.veROSiteDetail == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.veROSiteDetail.get(idx);
    }

    public int getVeROSiteDetailLength() {
        if (this.veROSiteDetail == null) {
            return  0;
        }
        return this.veROSiteDetail.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link VeROSiteDetailType }
     *     
     */
    public void setVeROSiteDetail(VeROSiteDetailType[] values) {
        this._getVeROSiteDetail().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.veROSiteDetail.add(values[i]);
        }
    }

    protected List<VeROSiteDetailType> _getVeROSiteDetail() {
        if (veROSiteDetail == null) {
            veROSiteDetail = new ArrayList<VeROSiteDetailType>();
        }
        return veROSiteDetail;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link VeROSiteDetailType }
     *     
     */
    public VeROSiteDetailType setVeROSiteDetail(int idx, VeROSiteDetailType value) {
        return this.veROSiteDetail.set(idx, value);
    }

}
