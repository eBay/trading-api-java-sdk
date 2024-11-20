
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
 * 				Container for a list of reported items. Can contain zero, one, or multiple
 * 				VeROReportedItemType objects, each of which conveys the data for one item listing.
 * 			
 * 
 * <p>Java class for VeROReportedItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportedItemDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportedItem" type="{urn:ebay:apis:eBLBaseComponents}VeROReportedItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReportedItemDetailsType", propOrder = {
    "reportedItem"
})
public class VeROReportedItemDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ReportedItem")
    protected List<VeROReportedItemType> reportedItem;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link VeROReportedItemType }
     *     
     */
    public VeROReportedItemType[] getReportedItem() {
        if (this.reportedItem == null) {
            return new VeROReportedItemType[ 0 ] ;
        }
        return ((VeROReportedItemType[]) this.reportedItem.toArray(new VeROReportedItemType[this.reportedItem.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link VeROReportedItemType }
     *     
     */
    public VeROReportedItemType getReportedItem(int idx) {
        if (this.reportedItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.reportedItem.get(idx);
    }

    public int getReportedItemLength() {
        if (this.reportedItem == null) {
            return  0;
        }
        return this.reportedItem.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link VeROReportedItemType }
     *     
     */
    public void setReportedItem(VeROReportedItemType[] values) {
        this._getReportedItem().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.reportedItem.add(values[i]);
        }
    }

    protected List<VeROReportedItemType> _getReportedItem() {
        if (reportedItem == null) {
            reportedItem = new ArrayList<VeROReportedItemType>();
        }
        return reportedItem;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link VeROReportedItemType }
     *     
     */
    public VeROReportedItemType setReportedItem(int idx, VeROReportedItemType value) {
        return this.reportedItem.set(idx, value);
    }

}
