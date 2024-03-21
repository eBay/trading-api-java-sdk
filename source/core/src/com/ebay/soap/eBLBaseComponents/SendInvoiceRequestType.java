
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
 * 				This call enables a seller to send an order invoice to a buyer. Optionally, and when applicable, this call can also be used to update the shipping service options available for shipment, to provide payment or checkout instructions to the buyer, to make a cost adjustment for the order/order line item, or to provide one or more offline payment methods (for orders where offline payment is an option).
 * 			
 * 
 * <p>Java class for SendInvoiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendInvoiceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" minOccurs="0"/>
 *         &lt;element name="InternationalShippingServiceOptions" type="{urn:ebay:apis:eBLBaseComponents}InternationalShippingServiceOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingServiceOptions" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{urn:ebay:apis:eBLBaseComponents}SalesTaxType" minOccurs="0"/>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="InsuranceFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentMethods" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PayPalEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckoutInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailCopyToSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendInvoiceRequestType", propOrder = {
    "itemID",
    "transactionID",
    "orderID",
    "internationalShippingServiceOptions",
    "shippingServiceOptions",
    "salesTax",
    "insuranceOption",
    "insuranceFee",
    "paymentMethods",
    "payPalEmailAddress",
    "checkoutInstructions",
    "emailCopyToSeller",
    "sku",
    "orderLineItemID",
    "adjustmentAmount"
})
public class SendInvoiceRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "InternationalShippingServiceOptions")
    protected List<InternationalShippingServiceOptionsType> internationalShippingServiceOptions;
    @XmlElement(name = "ShippingServiceOptions")
    protected List<ShippingServiceOptionsType> shippingServiceOptions;
    @XmlElement(name = "SalesTax")
    protected SalesTaxType salesTax;
    @XmlElement(name = "InsuranceOption")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "InsuranceFee")
    protected AmountType insuranceFee;
    @XmlElement(name = "PaymentMethods")
    protected List<BuyerPaymentMethodCodeType> paymentMethods;
    @XmlElement(name = "PayPalEmailAddress")
    protected String payPalEmailAddress;
    @XmlElement(name = "CheckoutInstructions")
    protected String checkoutInstructions;
    @XmlElement(name = "EmailCopyToSeller")
    protected Boolean emailCopyToSeller;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "OrderLineItemID")
    protected String orderLineItemID;
    @XmlElement(name = "AdjustmentAmount")
    protected AmountType adjustmentAmount;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link InternationalShippingServiceOptionsType }
     *     
     */
    public InternationalShippingServiceOptionsType[] getInternationalShippingServiceOptions() {
        if (this.internationalShippingServiceOptions == null) {
            return new InternationalShippingServiceOptionsType[ 0 ] ;
        }
        return ((InternationalShippingServiceOptionsType[]) this.internationalShippingServiceOptions.toArray(new InternationalShippingServiceOptionsType[this.internationalShippingServiceOptions.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link InternationalShippingServiceOptionsType }
     *     
     */
    public InternationalShippingServiceOptionsType getInternationalShippingServiceOptions(int idx) {
        if (this.internationalShippingServiceOptions == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.internationalShippingServiceOptions.get(idx);
    }

    public int getInternationalShippingServiceOptionsLength() {
        if (this.internationalShippingServiceOptions == null) {
            return  0;
        }
        return this.internationalShippingServiceOptions.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link InternationalShippingServiceOptionsType }
     *     
     */
    public void setInternationalShippingServiceOptions(InternationalShippingServiceOptionsType[] values) {
        this._getInternationalShippingServiceOptions().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.internationalShippingServiceOptions.add(values[i]);
        }
    }

    protected List<InternationalShippingServiceOptionsType> _getInternationalShippingServiceOptions() {
        if (internationalShippingServiceOptions == null) {
            internationalShippingServiceOptions = new ArrayList<InternationalShippingServiceOptionsType>();
        }
        return internationalShippingServiceOptions;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalShippingServiceOptionsType }
     *     
     */
    public InternationalShippingServiceOptionsType setInternationalShippingServiceOptions(int idx, InternationalShippingServiceOptionsType value) {
        return this.internationalShippingServiceOptions.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType[] getShippingServiceOptions() {
        if (this.shippingServiceOptions == null) {
            return new ShippingServiceOptionsType[ 0 ] ;
        }
        return ((ShippingServiceOptionsType[]) this.shippingServiceOptions.toArray(new ShippingServiceOptionsType[this.shippingServiceOptions.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType getShippingServiceOptions(int idx) {
        if (this.shippingServiceOptions == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingServiceOptions.get(idx);
    }

    public int getShippingServiceOptionsLength() {
        if (this.shippingServiceOptions == null) {
            return  0;
        }
        return this.shippingServiceOptions.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public void setShippingServiceOptions(ShippingServiceOptionsType[] values) {
        this._getShippingServiceOptions().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingServiceOptions.add(values[i]);
        }
    }

    protected List<ShippingServiceOptionsType> _getShippingServiceOptions() {
        if (shippingServiceOptions == null) {
            shippingServiceOptions = new ArrayList<ShippingServiceOptionsType>();
        }
        return shippingServiceOptions;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType setShippingServiceOptions(int idx, ShippingServiceOptionsType value) {
        return this.shippingServiceOptions.set(idx, value);
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxType }
     *     
     */
    public SalesTaxType getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxType }
     *     
     */
    public void setSalesTax(SalesTaxType value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the insuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the value of the insuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(InsuranceOptionCodeType value) {
        this.insuranceOption = value;
    }

    /**
     * Gets the value of the insuranceFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceFee() {
        return insuranceFee;
    }

    /**
     * Sets the value of the insuranceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceFee(AmountType value) {
        this.insuranceFee = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType[] getPaymentMethods() {
        if (this.paymentMethods == null) {
            return new BuyerPaymentMethodCodeType[ 0 ] ;
        }
        return ((BuyerPaymentMethodCodeType[]) this.paymentMethods.toArray(new BuyerPaymentMethodCodeType[this.paymentMethods.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType getPaymentMethods(int idx) {
        if (this.paymentMethods == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.paymentMethods.get(idx);
    }

    public int getPaymentMethodsLength() {
        if (this.paymentMethods == null) {
            return  0;
        }
        return this.paymentMethods.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethods(BuyerPaymentMethodCodeType[] values) {
        this._getPaymentMethods().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.paymentMethods.add(values[i]);
        }
    }

    protected List<BuyerPaymentMethodCodeType> _getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<BuyerPaymentMethodCodeType>();
        }
        return paymentMethods;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType setPaymentMethods(int idx, BuyerPaymentMethodCodeType value) {
        return this.paymentMethods.set(idx, value);
    }

    /**
     * Gets the value of the payPalEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalEmailAddress() {
        return payPalEmailAddress;
    }

    /**
     * Sets the value of the payPalEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalEmailAddress(String value) {
        this.payPalEmailAddress = value;
    }

    /**
     * Gets the value of the checkoutInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutInstructions() {
        return checkoutInstructions;
    }

    /**
     * Sets the value of the checkoutInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutInstructions(String value) {
        this.checkoutInstructions = value;
    }

    /**
     * Gets the value of the emailCopyToSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailCopyToSeller() {
        return emailCopyToSeller;
    }

    /**
     * Sets the value of the emailCopyToSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailCopyToSeller(Boolean value) {
        this.emailCopyToSeller = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the orderLineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemID() {
        return orderLineItemID;
    }

    /**
     * Sets the value of the orderLineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemID(String value) {
        this.orderLineItemID = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentAmount(AmountType value) {
        this.adjustmentAmount = value;
    }

}
