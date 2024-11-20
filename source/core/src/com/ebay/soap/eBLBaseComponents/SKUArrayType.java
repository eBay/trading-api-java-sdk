
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
 * 				A list of stock-keeping unit (SKU) identifiers that a seller uses in listings.
 * 			
 * 
 * <p>Java class for SKUArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKUArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKUArrayType", propOrder = {
    "sku"
})
public class SKUArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SKU")
    protected List<String> sku;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getSKU() {
        if (this.sku == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.sku.toArray(new String[this.sku.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getSKU(int idx) {
        if (this.sku == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.sku.get(idx);
    }

    public int getSKULength() {
        if (this.sku == null) {
            return  0;
        }
        return this.sku.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setSKU(String[] values) {
        this._getSKU().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.sku.add(values[i]);
        }
    }

    protected List<String> _getSKU() {
        if (sku == null) {
            sku = new ArrayList<String>();
        }
        return sku;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setSKU(int idx, String value) {
        return this.sku.set(idx, value);
    }

}
