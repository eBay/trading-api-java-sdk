
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
 * 				This type has been deprecated.
 * 			
 * 
 * <p>Java class for AverageRatingDetailArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AverageRatingDetailArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AverageRatingDetails" type="{urn:ebay:apis:eBLBaseComponents}AverageRatingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AverageRatingDetailArrayType", propOrder = {
    "averageRatingDetails"
})
public class AverageRatingDetailArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AverageRatingDetails")
    protected List<AverageRatingDetailsType> averageRatingDetails;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AverageRatingDetailsType }
     *     
     */
    public AverageRatingDetailsType[] getAverageRatingDetails() {
        if (this.averageRatingDetails == null) {
            return new AverageRatingDetailsType[ 0 ] ;
        }
        return ((AverageRatingDetailsType[]) this.averageRatingDetails.toArray(new AverageRatingDetailsType[this.averageRatingDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AverageRatingDetailsType }
     *     
     */
    public AverageRatingDetailsType getAverageRatingDetails(int idx) {
        if (this.averageRatingDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.averageRatingDetails.get(idx);
    }

    public int getAverageRatingDetailsLength() {
        if (this.averageRatingDetails == null) {
            return  0;
        }
        return this.averageRatingDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AverageRatingDetailsType }
     *     
     */
    public void setAverageRatingDetails(AverageRatingDetailsType[] values) {
        this._getAverageRatingDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.averageRatingDetails.add(values[i]);
        }
    }

    protected List<AverageRatingDetailsType> _getAverageRatingDetails() {
        if (averageRatingDetails == null) {
            averageRatingDetails = new ArrayList<AverageRatingDetailsType>();
        }
        return averageRatingDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AverageRatingDetailsType }
     *     
     */
    public AverageRatingDetailsType setAverageRatingDetails(int idx, AverageRatingDetailsType value) {
        return this.averageRatingDetails.set(idx, value);
    }

}
