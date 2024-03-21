
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
 * 				This type defines the <b>RequiredSellerActionArray</b> container,
 * 				which may contain one or more <b>RequiredSellerAction</b> fields.
 * 			
 * 
 * <p>Java class for RequiredSellerActionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredSellerActionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequiredSellerAction" type="{urn:ebay:apis:eBLBaseComponents}RequiredSellerActionCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSellerActionArrayType", propOrder = {
    "requiredSellerAction"
})
public class RequiredSellerActionArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RequiredSellerAction")
    protected List<RequiredSellerActionCodeType> requiredSellerAction;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RequiredSellerActionCodeType }
     *     
     */
    public RequiredSellerActionCodeType[] getRequiredSellerAction() {
        if (this.requiredSellerAction == null) {
            return new RequiredSellerActionCodeType[ 0 ] ;
        }
        return ((RequiredSellerActionCodeType[]) this.requiredSellerAction.toArray(new RequiredSellerActionCodeType[this.requiredSellerAction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RequiredSellerActionCodeType }
     *     
     */
    public RequiredSellerActionCodeType getRequiredSellerAction(int idx) {
        if (this.requiredSellerAction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.requiredSellerAction.get(idx);
    }

    public int getRequiredSellerActionLength() {
        if (this.requiredSellerAction == null) {
            return  0;
        }
        return this.requiredSellerAction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RequiredSellerActionCodeType }
     *     
     */
    public void setRequiredSellerAction(RequiredSellerActionCodeType[] values) {
        this._getRequiredSellerAction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.requiredSellerAction.add(values[i]);
        }
    }

    protected List<RequiredSellerActionCodeType> _getRequiredSellerAction() {
        if (requiredSellerAction == null) {
            requiredSellerAction = new ArrayList<RequiredSellerActionCodeType>();
        }
        return requiredSellerAction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSellerActionCodeType }
     *     
     */
    public RequiredSellerActionCodeType setRequiredSellerAction(int idx, RequiredSellerActionCodeType value) {
        return this.requiredSellerAction.set(idx, value);
    }

}
