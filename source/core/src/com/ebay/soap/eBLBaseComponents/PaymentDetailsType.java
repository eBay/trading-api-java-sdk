
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
 * 			Type defining the <b>PaymentDetails</b> container, which is used by the seller to
 * 			specify the amount of the initial deposit, and the due dates for the deposit and the full payment for a motor vehicle listing. 
 * 			<br/>
 * 			<br/>
 * 			<span class="tablenote"><b>Note:</b>
 * 			The seller may not use the <b>PaymentDetails</b> container if selling a motor vehicle through a Classified Ad listing. If it is used in a Trading call, it will be dropped and the seller will get a warning that it was dropped. For a Classified Ad listing, the buyer and seller directly discuss amongst themselves any details on a deposit, or due dates for a deposit and full balance. eBay will not be involved in this process for a Classified Ad listing.</span>
 * 		
 * 
 * <p>Java class for PaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoursToDeposit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DaysToFullPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="DepositType" type="{urn:ebay:apis:eBLBaseComponents}DepositTypeCodeType" minOccurs="0"/>
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
@XmlType(name = "PaymentDetailsType", propOrder = {
    "hoursToDeposit",
    "daysToFullPayment",
    "depositAmount",
    "depositType",
    "any"
})
public class PaymentDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "HoursToDeposit")
    protected Integer hoursToDeposit;
    @XmlElement(name = "DaysToFullPayment")
    protected Integer daysToFullPayment;
    @XmlElement(name = "DepositAmount")
    protected AmountType depositAmount;
    @XmlElement(name = "DepositType")
    protected DepositTypeCodeType depositType;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the hoursToDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoursToDeposit() {
        return hoursToDeposit;
    }

    /**
     * Sets the value of the hoursToDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoursToDeposit(Integer value) {
        this.hoursToDeposit = value;
    }

    /**
     * Gets the value of the daysToFullPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysToFullPayment() {
        return daysToFullPayment;
    }

    /**
     * Sets the value of the daysToFullPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysToFullPayment(Integer value) {
        this.daysToFullPayment = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepositAmount(AmountType value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link DepositTypeCodeType }
     *     
     */
    public DepositTypeCodeType getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositTypeCodeType }
     *     
     */
    public void setDepositType(DepositTypeCodeType value) {
        this.depositType = value;
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
