
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				An eBay-defined complex type for specifying monetary amounts.
 * 				<br><br>
 * 				A double value (e.g., 1.00 or 1.0) is meaningful as a monetary amount when accompanied by a specification of the currency, in which case the value specifies the amount in that currency. An <b>AmountType</b> expresses both the value (a double) and the currency.
 * 				<br><br>
 * 				The <b>AmountType</b> data type is typically used to specify details such as prices, fees, costs, and payments. In some cases, a whole number (i.e., without a period) can be passed or returned as a monetary value. This is necessary to support certain currencies that are only expressed as whole numbers.
 * 				<br><br>
 * 				Because a double is used to represent the amount, this also means whole monetary amounts may be returned with only one 0 after the decimal. For example, a dollar value could be returned as 1.0 instead of 1.00 in calls like <b>AddItem</b>.
 * 			
 * 
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="currencyID" use="required" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "value"
})
@XmlSeeAlso({
    RefundLineType.class
})
public class AmountType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlValue
    protected double value;
    @XmlAttribute(required = true)
    protected CurrencyCodeType currencyID;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyID(CurrencyCodeType value) {
        this.currencyID = value;
    }

}
