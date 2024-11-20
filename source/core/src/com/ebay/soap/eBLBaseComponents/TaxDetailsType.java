
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
 * 				Type used by the <b>TaxDetails</b> container, which consists of detailed tax information for an order line item, including the tax type and description, tax on the item cost, and tax related to shipping and handling. The information in this container supercedes/overrides the sales tax information in the <b>ShippingDetails.SalesTax</b> container (if returned).
 * 				<br><br>
 * 				A separate <b>TaxDetails</b> container will be returned for each type of tax that applied to an order line item. For tax that is subject to 'eBay collect and remit', such as US sales tax or 'Goods and Services tax' for Australia or New Zealand, the <b>TaxDetails</b> container will be returned under the <b>eBayCollectAndRemitTaxes</b> container. For all other tax, the tax details will be returned under the <b>Taxes</b> container.
 * 			
 * 
 * <p>Java class for TaxDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Imposition" type="{urn:ebay:apis:eBLBaseComponents}TaxTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TaxDescription" type="{urn:ebay:apis:eBLBaseComponents}TaxDescriptionCodeType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxOnSubtotalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxOnShippingAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxOnHandlingAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionMethod" type="{urn:ebay:apis:eBLBaseComponents}CollectionMethodCodeType" minOccurs="0"/>
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
@XmlType(name = "TaxDetailsType", propOrder = {
    "imposition",
    "taxDescription",
    "taxAmount",
    "taxOnSubtotalAmount",
    "taxOnShippingAmount",
    "taxOnHandlingAmount",
    "taxCode",
    "collectionMethod",
    "any"
})
public class TaxDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Imposition")
    protected TaxTypeCodeType imposition;
    @XmlElement(name = "TaxDescription")
    protected TaxDescriptionCodeType taxDescription;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;
    @XmlElement(name = "TaxOnSubtotalAmount")
    protected AmountType taxOnSubtotalAmount;
    @XmlElement(name = "TaxOnShippingAmount")
    protected AmountType taxOnShippingAmount;
    @XmlElement(name = "TaxOnHandlingAmount")
    protected AmountType taxOnHandlingAmount;
    @XmlElement(name = "TaxCode")
    protected String taxCode;
    @XmlElement(name = "CollectionMethod")
    protected CollectionMethodCodeType collectionMethod;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the imposition property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public TaxTypeCodeType getImposition() {
        return imposition;
    }

    /**
     * Sets the value of the imposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public void setImposition(TaxTypeCodeType value) {
        this.imposition = value;
    }

    /**
     * Gets the value of the taxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDescriptionCodeType }
     *     
     */
    public TaxDescriptionCodeType getTaxDescription() {
        return taxDescription;
    }

    /**
     * Sets the value of the taxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDescriptionCodeType }
     *     
     */
    public void setTaxDescription(TaxDescriptionCodeType value) {
        this.taxDescription = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxAmount(AmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxOnSubtotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxOnSubtotalAmount() {
        return taxOnSubtotalAmount;
    }

    /**
     * Sets the value of the taxOnSubtotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxOnSubtotalAmount(AmountType value) {
        this.taxOnSubtotalAmount = value;
    }

    /**
     * Gets the value of the taxOnShippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxOnShippingAmount() {
        return taxOnShippingAmount;
    }

    /**
     * Sets the value of the taxOnShippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxOnShippingAmount(AmountType value) {
        this.taxOnShippingAmount = value;
    }

    /**
     * Gets the value of the taxOnHandlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxOnHandlingAmount() {
        return taxOnHandlingAmount;
    }

    /**
     * Sets the value of the taxOnHandlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxOnHandlingAmount(AmountType value) {
        this.taxOnHandlingAmount = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the collectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionMethodCodeType }
     *     
     */
    public CollectionMethodCodeType getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * Sets the value of the collectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionMethodCodeType }
     *     
     */
    public void setCollectionMethod(CollectionMethodCodeType value) {
        this.collectionMethod = value;
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
