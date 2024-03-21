
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
 * 				Type defining the <b>ReportItems</b> container in the <b>VeROReportItems</b> request. The <b>ReportItems</b> container is an array of one or more eBay items which, according to the product's owner, are infringing upon the product owner's copyright, trademark, or intellectual property rights.
 * 			
 * 
 * <p>Java class for VeROReportItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportItem" type="{urn:ebay:apis:eBLBaseComponents}VeROReportItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReportItemsType", propOrder = {
    "reportItem"
})
public class VeROReportItemsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ReportItem")
    protected List<VeROReportItemType> reportItem;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link VeROReportItemType }
     *     
     */
    public VeROReportItemType[] getReportItem() {
        if (this.reportItem == null) {
            return new VeROReportItemType[ 0 ] ;
        }
        return ((VeROReportItemType[]) this.reportItem.toArray(new VeROReportItemType[this.reportItem.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link VeROReportItemType }
     *     
     */
    public VeROReportItemType getReportItem(int idx) {
        if (this.reportItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.reportItem.get(idx);
    }

    public int getReportItemLength() {
        if (this.reportItem == null) {
            return  0;
        }
        return this.reportItem.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link VeROReportItemType }
     *     
     */
    public void setReportItem(VeROReportItemType[] values) {
        this._getReportItem().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.reportItem.add(values[i]);
        }
    }

    protected List<VeROReportItemType> _getReportItem() {
        if (reportItem == null) {
            reportItem = new ArrayList<VeROReportItemType>();
        }
        return reportItem;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link VeROReportItemType }
     *     
     */
    public VeROReportItemType setReportItem(int idx, VeROReportItemType value) {
        return this.reportItem.set(idx, value);
    }

}
