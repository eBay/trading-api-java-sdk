
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
 * 				Variations are multiple similar (but not identical) items in a
 * 				fixed-price listing.
 * 				For example, a single listing could contain multiple items of the
 * 				same brand and model that vary by color and size (like "Blue, Large" and "Black, Medium"). Each variation can have its own quantity and
 * 				price. For example, a listing could include 10 "Blue, Large"
 * 				variations and 20 "Black, Medium" variations.
 * 			
 * 
 * <p>Java class for VariationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Variation" type="{urn:ebay:apis:eBLBaseComponents}VariationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pictures" type="{urn:ebay:apis:eBLBaseComponents}PicturesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariationSpecificsSet" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="ModifyNameList" type="{urn:ebay:apis:eBLBaseComponents}ModifyNameArrayType" minOccurs="0"/>
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
@XmlType(name = "VariationsType", propOrder = {
    "variation",
    "pictures",
    "variationSpecificsSet",
    "modifyNameList",
    "any"
})
public class VariationsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Variation")
    protected List<VariationType> variation;
    @XmlElement(name = "Pictures")
    protected List<PicturesType> pictures;
    @XmlElement(name = "VariationSpecificsSet")
    protected NameValueListArrayType variationSpecificsSet;
    @XmlElement(name = "ModifyNameList")
    protected ModifyNameArrayType modifyNameList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link VariationType }
     *     
     */
    public VariationType[] getVariation() {
        if (this.variation == null) {
            return new VariationType[ 0 ] ;
        }
        return ((VariationType[]) this.variation.toArray(new VariationType[this.variation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link VariationType }
     *     
     */
    public VariationType getVariation(int idx) {
        if (this.variation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.variation.get(idx);
    }

    public int getVariationLength() {
        if (this.variation == null) {
            return  0;
        }
        return this.variation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link VariationType }
     *     
     */
    public void setVariation(VariationType[] values) {
        this._getVariation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.variation.add(values[i]);
        }
    }

    protected List<VariationType> _getVariation() {
        if (variation == null) {
            variation = new ArrayList<VariationType>();
        }
        return variation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link VariationType }
     *     
     */
    public VariationType setVariation(int idx, VariationType value) {
        return this.variation.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PicturesType }
     *     
     */
    public PicturesType[] getPictures() {
        if (this.pictures == null) {
            return new PicturesType[ 0 ] ;
        }
        return ((PicturesType[]) this.pictures.toArray(new PicturesType[this.pictures.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PicturesType }
     *     
     */
    public PicturesType getPictures(int idx) {
        if (this.pictures == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.pictures.get(idx);
    }

    public int getPicturesLength() {
        if (this.pictures == null) {
            return  0;
        }
        return this.pictures.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PicturesType }
     *     
     */
    public void setPictures(PicturesType[] values) {
        this._getPictures().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.pictures.add(values[i]);
        }
    }

    protected List<PicturesType> _getPictures() {
        if (pictures == null) {
            pictures = new ArrayList<PicturesType>();
        }
        return pictures;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PicturesType }
     *     
     */
    public PicturesType setPictures(int idx, PicturesType value) {
        return this.pictures.set(idx, value);
    }

    /**
     * Gets the value of the variationSpecificsSet property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getVariationSpecificsSet() {
        return variationSpecificsSet;
    }

    /**
     * Sets the value of the variationSpecificsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setVariationSpecificsSet(NameValueListArrayType value) {
        this.variationSpecificsSet = value;
    }

    /**
     * Gets the value of the modifyNameList property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyNameArrayType }
     *     
     */
    public ModifyNameArrayType getModifyNameList() {
        return modifyNameList;
    }

    /**
     * Sets the value of the modifyNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyNameArrayType }
     *     
     */
    public void setModifyNameList(ModifyNameArrayType value) {
        this.modifyNameList = value;
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
