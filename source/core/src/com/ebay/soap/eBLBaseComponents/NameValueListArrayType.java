
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
 * 				A list of one or more valid names and corresponding values. Currently
 * 				used to identify Item Specifics and individual variations within a multiple-variation listing.
 * 			
 * 
 * <p>Java class for NameValueListArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameValueListArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameValueList" type="{urn:ebay:apis:eBLBaseComponents}NameValueListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameValueListArrayType", propOrder = {
    "nameValueList"
})
public class NameValueListArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "NameValueList")
    protected List<NameValueListType> nameValueList;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType[] getNameValueList() {
        if (this.nameValueList == null) {
            return new NameValueListType[ 0 ] ;
        }
        return ((NameValueListType[]) this.nameValueList.toArray(new NameValueListType[this.nameValueList.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType getNameValueList(int idx) {
        if (this.nameValueList == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.nameValueList.get(idx);
    }

    public int getNameValueListLength() {
        if (this.nameValueList == null) {
            return  0;
        }
        return this.nameValueList.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NameValueListType }
     *     
     */
    public void setNameValueList(NameValueListType[] values) {
        this._getNameValueList().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.nameValueList.add(values[i]);
        }
    }

    protected List<NameValueListType> _getNameValueList() {
        if (nameValueList == null) {
            nameValueList = new ArrayList<NameValueListType>();
        }
        return nameValueList;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType setNameValueList(int idx, NameValueListType value) {
        return this.nameValueList.set(idx, value);
    }

}
