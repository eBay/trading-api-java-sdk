
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 *         This type is used to express the details of an order. An order may contain one or more line items (purchases) from the same buyer. Regardless of how many line items an order has, only one payment is made for the order.
 *         <br><br>
 *         The <b>GetOrders</b> and <b>GetOrderTransactions</b> calls return many of the fields of this type.
 *         <br><br>
 *         The <b>GetItemTransactions</b> and <b>GetSellerTransactions</b> calls will only return order-level details if the <b>IncludeContainingOrder</b> boolean field is included in the call request and set to <code>true</code>.
 *         <br><br>
 *         The <b>AddOrder</b> call is used to combine two or more unpaid order line items (between the same seller and buyer) into a 'Combined Invoice' order. While combining these order line items into one 'Combined Invoice' order, the seller can make adjustments to accepted payment methods, shipping details (including costs), and the total cost of the order. Sometimes, sellers will reduce the cost of shipping if one or more order line items can be shipped together in the same package.
 *         <br><br>
 *         The <b>GetMyeBaySelling</b> call returns order details if the seller wishes to view listings that have sold, and the <b>GetMyeBayBuying</b> call returns order details if the buyer wishes to view items they have won or purchased.
 *       
 * 
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{urn:ebay:apis:eBLBaseComponents}OrderStatusCodeType" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountPaid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountSaved" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CheckoutStatus" type="{urn:ebay:apis:eBLBaseComponents}CheckoutStatusType" minOccurs="0"/>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="CreatingUserRole" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentMethods" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceSelected" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionsType" minOccurs="0"/>
 *         &lt;element name="Subtotal" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Total" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ExternalTransaction" type="{urn:ebay:apis:eBLBaseComponents}ExternalTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionArray" type="{urn:ebay:apis:eBLBaseComponents}TransactionArrayType" minOccurs="0"/>
 *         &lt;element name="BuyerUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="PaidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShippedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BundlePurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyerCheckoutMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EIASToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentHoldStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentHoldDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldDetailType" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="RefundStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundArray" type="{urn:ebay:apis:eBLBaseComponents}RefundArrayType" minOccurs="0"/>
 *         &lt;element name="IsMultiLegShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultiLegShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}MultiLegShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="MonetaryDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentsInformationType" minOccurs="0"/>
 *         &lt;element name="PickupDetails" type="{urn:ebay:apis:eBLBaseComponents}PickupDetailsType" minOccurs="0"/>
 *         &lt;element name="PickupMethodSelected" type="{urn:ebay:apis:eBLBaseComponents}PickupMethodSelectedType" minOccurs="0"/>
 *         &lt;element name="SellerUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="SellerEIASToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelReason" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="CancelStatus" type="{urn:ebay:apis:eBLBaseComponents}CancelStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CancelReasonDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingConvenienceCharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CancelDetail" type="{urn:ebay:apis:eBLBaseComponents}CancelDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LogisticsPlanType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="BuyerTaxIdentifier" type="{urn:ebay:apis:eBLBaseComponents}TaxIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyerPackageEnclosures" type="{urn:ebay:apis:eBLBaseComponents}BuyerPackageEnclosuresType" minOccurs="0"/>
 *         &lt;element name="ExtendedOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContainseBayPlusTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayCollectAndRemitTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderLineItemCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "OrderType", propOrder = {
    "orderID",
    "orderStatus",
    "adjustmentAmount",
    "amountPaid",
    "amountSaved",
    "checkoutStatus",
    "shippingDetails",
    "creatingUserRole",
    "createdTime",
    "paymentMethods",
    "sellerEmail",
    "shippingAddress",
    "shippingServiceSelected",
    "subtotal",
    "total",
    "externalTransaction",
    "transactionArray",
    "buyerUserID",
    "paidTime",
    "shippedTime",
    "integratedMerchantCreditCardEnabled",
    "bundlePurchase",
    "buyerCheckoutMessage",
    "eiasToken",
    "paymentHoldStatus",
    "paymentHoldDetails",
    "refundAmount",
    "refundStatus",
    "refundArray",
    "isMultiLegShipping",
    "multiLegShippingDetails",
    "monetaryDetails",
    "pickupDetails",
    "pickupMethodSelected",
    "sellerUserID",
    "sellerEIASToken",
    "cancelReason",
    "cancelStatus",
    "cancelReasonDetails",
    "shippingConvenienceCharge",
    "cancelDetail",
    "logisticsPlanType",
    "buyerTaxIdentifier",
    "buyerPackageEnclosures",
    "extendedOrderID",
    "containseBayPlusTransaction",
    "eBayCollectAndRemitTax",
    "orderLineItemCount",
    "any"
})
public class OrderType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "OrderStatus")
    protected OrderStatusCodeType orderStatus;
    @XmlElement(name = "AdjustmentAmount")
    protected AmountType adjustmentAmount;
    @XmlElement(name = "AmountPaid")
    protected AmountType amountPaid;
    @XmlElement(name = "AmountSaved")
    protected AmountType amountSaved;
    @XmlElement(name = "CheckoutStatus")
    protected CheckoutStatusType checkoutStatus;
    @XmlElement(name = "ShippingDetails")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "CreatingUserRole")
    protected TradingRoleCodeType creatingUserRole;
    @XmlElement(name = "CreatedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createdTime;
    @XmlElement(name = "PaymentMethods")
    protected List<BuyerPaymentMethodCodeType> paymentMethods;
    @XmlElement(name = "SellerEmail")
    protected String sellerEmail;
    @XmlElement(name = "ShippingAddress")
    protected AddressType shippingAddress;
    @XmlElement(name = "ShippingServiceSelected")
    protected ShippingServiceOptionsType shippingServiceSelected;
    @XmlElement(name = "Subtotal")
    protected AmountType subtotal;
    @XmlElement(name = "Total")
    protected AmountType total;
    @XmlElement(name = "ExternalTransaction")
    protected List<ExternalTransactionType> externalTransaction;
    @XmlElement(name = "TransactionArray")
    protected TransactionArrayType transactionArray;
    @XmlElement(name = "BuyerUserID")
    protected String buyerUserID;
    @XmlElement(name = "PaidTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar paidTime;
    @XmlElement(name = "ShippedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar shippedTime;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled")
    protected Boolean integratedMerchantCreditCardEnabled;
    @XmlElement(name = "BundlePurchase")
    protected Boolean bundlePurchase;
    @XmlElement(name = "BuyerCheckoutMessage")
    protected String buyerCheckoutMessage;
    @XmlElement(name = "EIASToken")
    protected String eiasToken;
    @XmlElement(name = "PaymentHoldStatus")
    protected PaymentHoldStatusCodeType paymentHoldStatus;
    @XmlElement(name = "PaymentHoldDetails")
    protected PaymentHoldDetailType paymentHoldDetails;
    @XmlElement(name = "RefundAmount")
    protected AmountType refundAmount;
    @XmlElement(name = "RefundStatus")
    protected String refundStatus;
    @XmlElement(name = "RefundArray")
    protected RefundArrayType refundArray;
    @XmlElement(name = "IsMultiLegShipping")
    protected Boolean isMultiLegShipping;
    @XmlElement(name = "MultiLegShippingDetails")
    protected MultiLegShippingDetailsType multiLegShippingDetails;
    @XmlElement(name = "MonetaryDetails")
    protected PaymentsInformationType monetaryDetails;
    @XmlElement(name = "PickupDetails")
    protected PickupDetailsType pickupDetails;
    @XmlElement(name = "PickupMethodSelected")
    protected PickupMethodSelectedType pickupMethodSelected;
    @XmlElement(name = "SellerUserID")
    protected String sellerUserID;
    @XmlElement(name = "SellerEIASToken")
    protected String sellerEIASToken;
    @XmlElement(name = "CancelReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cancelReason;
    @XmlElement(name = "CancelStatus")
    protected CancelStatusCodeType cancelStatus;
    @XmlElement(name = "CancelReasonDetails")
    protected String cancelReasonDetails;
    @XmlElement(name = "ShippingConvenienceCharge")
    protected AmountType shippingConvenienceCharge;
    @XmlElement(name = "CancelDetail")
    protected List<CancelDetailType> cancelDetail;
    @XmlElement(name = "LogisticsPlanType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String logisticsPlanType;
    @XmlElement(name = "BuyerTaxIdentifier")
    protected List<TaxIdentifierType> buyerTaxIdentifier;
    @XmlElement(name = "BuyerPackageEnclosures")
    protected BuyerPackageEnclosuresType buyerPackageEnclosures;
    @XmlElement(name = "ExtendedOrderID")
    protected String extendedOrderID;
    @XmlElement(name = "ContainseBayPlusTransaction")
    protected Boolean containseBayPlusTransaction;
    protected Boolean eBayCollectAndRemitTax;
    @XmlElement(name = "OrderLineItemCount")
    protected Long orderLineItemCount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusCodeType }
     *     
     */
    public OrderStatusCodeType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusCodeType }
     *     
     */
    public void setOrderStatus(OrderStatusCodeType value) {
        this.orderStatus = value;
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

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPaid(AmountType value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the amountSaved property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountSaved() {
        return amountSaved;
    }

    /**
     * Sets the value of the amountSaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountSaved(AmountType value) {
        this.amountSaved = value;
    }

    /**
     * Gets the value of the checkoutStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutStatusType }
     *     
     */
    public CheckoutStatusType getCheckoutStatus() {
        return checkoutStatus;
    }

    /**
     * Sets the value of the checkoutStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutStatusType }
     *     
     */
    public void setCheckoutStatus(CheckoutStatusType value) {
        this.checkoutStatus = value;
    }

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsType }
     *     
     */
    public ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsType }
     *     
     */
    public void setShippingDetails(ShippingDetailsType value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the creatingUserRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getCreatingUserRole() {
        return creatingUserRole;
    }

    /**
     * Sets the value of the creatingUserRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setCreatingUserRole(TradingRoleCodeType value) {
        this.creatingUserRole = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedTime(Calendar value) {
        this.createdTime = value;
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
     * Gets the value of the sellerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerEmail() {
        return sellerEmail;
    }

    /**
     * Sets the value of the sellerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerEmail(String value) {
        this.sellerEmail = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShippingAddress(AddressType value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the shippingServiceSelected property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType getShippingServiceSelected() {
        return shippingServiceSelected;
    }

    /**
     * Sets the value of the shippingServiceSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public void setShippingServiceSelected(ShippingServiceOptionsType value) {
        this.shippingServiceSelected = value;
    }

    /**
     * Gets the value of the subtotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubtotal() {
        return subtotal;
    }

    /**
     * Sets the value of the subtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubtotal(AmountType value) {
        this.subtotal = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotal(AmountType value) {
        this.total = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ExternalTransactionType }
     *     
     */
    public ExternalTransactionType[] getExternalTransaction() {
        if (this.externalTransaction == null) {
            return new ExternalTransactionType[ 0 ] ;
        }
        return ((ExternalTransactionType[]) this.externalTransaction.toArray(new ExternalTransactionType[this.externalTransaction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ExternalTransactionType }
     *     
     */
    public ExternalTransactionType getExternalTransaction(int idx) {
        if (this.externalTransaction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.externalTransaction.get(idx);
    }

    public int getExternalTransactionLength() {
        if (this.externalTransaction == null) {
            return  0;
        }
        return this.externalTransaction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ExternalTransactionType }
     *     
     */
    public void setExternalTransaction(ExternalTransactionType[] values) {
        this._getExternalTransaction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.externalTransaction.add(values[i]);
        }
    }

    protected List<ExternalTransactionType> _getExternalTransaction() {
        if (externalTransaction == null) {
            externalTransaction = new ArrayList<ExternalTransactionType>();
        }
        return externalTransaction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalTransactionType }
     *     
     */
    public ExternalTransactionType setExternalTransaction(int idx, ExternalTransactionType value) {
        return this.externalTransaction.set(idx, value);
    }

    /**
     * Gets the value of the transactionArray property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionArrayType }
     *     
     */
    public TransactionArrayType getTransactionArray() {
        return transactionArray;
    }

    /**
     * Sets the value of the transactionArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionArrayType }
     *     
     */
    public void setTransactionArray(TransactionArrayType value) {
        this.transactionArray = value;
    }

    /**
     * Gets the value of the buyerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerUserID() {
        return buyerUserID;
    }

    /**
     * Sets the value of the buyerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerUserID(String value) {
        this.buyerUserID = value;
    }

    /**
     * Gets the value of the paidTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPaidTime() {
        return paidTime;
    }

    /**
     * Sets the value of the paidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidTime(Calendar value) {
        this.paidTime = value;
    }

    /**
     * Gets the value of the shippedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getShippedTime() {
        return shippedTime;
    }

    /**
     * Sets the value of the shippedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedTime(Calendar value) {
        this.shippedTime = value;
    }

    /**
     * Gets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedMerchantCreditCardEnabled() {
        return integratedMerchantCreditCardEnabled;
    }

    /**
     * Sets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedMerchantCreditCardEnabled(Boolean value) {
        this.integratedMerchantCreditCardEnabled = value;
    }

    /**
     * Gets the value of the bundlePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundlePurchase() {
        return bundlePurchase;
    }

    /**
     * Sets the value of the bundlePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundlePurchase(Boolean value) {
        this.bundlePurchase = value;
    }

    /**
     * Gets the value of the buyerCheckoutMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerCheckoutMessage() {
        return buyerCheckoutMessage;
    }

    /**
     * Sets the value of the buyerCheckoutMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerCheckoutMessage(String value) {
        this.buyerCheckoutMessage = value;
    }

    /**
     * Gets the value of the eiasToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIASToken() {
        return eiasToken;
    }

    /**
     * Sets the value of the eiasToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIASToken(String value) {
        this.eiasToken = value;
    }

    /**
     * Gets the value of the paymentHoldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public PaymentHoldStatusCodeType getPaymentHoldStatus() {
        return paymentHoldStatus;
    }

    /**
     * Sets the value of the paymentHoldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public void setPaymentHoldStatus(PaymentHoldStatusCodeType value) {
        this.paymentHoldStatus = value;
    }

    /**
     * Gets the value of the paymentHoldDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldDetailType }
     *     
     */
    public PaymentHoldDetailType getPaymentHoldDetails() {
        return paymentHoldDetails;
    }

    /**
     * Sets the value of the paymentHoldDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldDetailType }
     *     
     */
    public void setPaymentHoldDetails(PaymentHoldDetailType value) {
        this.paymentHoldDetails = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRefundAmount(AmountType value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundStatus(String value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the refundArray property.
     * 
     * @return
     *     possible object is
     *     {@link RefundArrayType }
     *     
     */
    public RefundArrayType getRefundArray() {
        return refundArray;
    }

    /**
     * Sets the value of the refundArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundArrayType }
     *     
     */
    public void setRefundArray(RefundArrayType value) {
        this.refundArray = value;
    }

    /**
     * Gets the value of the isMultiLegShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiLegShipping() {
        return isMultiLegShipping;
    }

    /**
     * Sets the value of the isMultiLegShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiLegShipping(Boolean value) {
        this.isMultiLegShipping = value;
    }

    /**
     * Gets the value of the multiLegShippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLegShippingDetailsType }
     *     
     */
    public MultiLegShippingDetailsType getMultiLegShippingDetails() {
        return multiLegShippingDetails;
    }

    /**
     * Sets the value of the multiLegShippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLegShippingDetailsType }
     *     
     */
    public void setMultiLegShippingDetails(MultiLegShippingDetailsType value) {
        this.multiLegShippingDetails = value;
    }

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsInformationType }
     *     
     */
    public PaymentsInformationType getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsInformationType }
     *     
     */
    public void setMonetaryDetails(PaymentsInformationType value) {
        this.monetaryDetails = value;
    }

    /**
     * Gets the value of the pickupDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PickupDetailsType }
     *     
     */
    public PickupDetailsType getPickupDetails() {
        return pickupDetails;
    }

    /**
     * Sets the value of the pickupDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupDetailsType }
     *     
     */
    public void setPickupDetails(PickupDetailsType value) {
        this.pickupDetails = value;
    }

    /**
     * Gets the value of the pickupMethodSelected property.
     * 
     * @return
     *     possible object is
     *     {@link PickupMethodSelectedType }
     *     
     */
    public PickupMethodSelectedType getPickupMethodSelected() {
        return pickupMethodSelected;
    }

    /**
     * Sets the value of the pickupMethodSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupMethodSelectedType }
     *     
     */
    public void setPickupMethodSelected(PickupMethodSelectedType value) {
        this.pickupMethodSelected = value;
    }

    /**
     * Gets the value of the sellerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerUserID() {
        return sellerUserID;
    }

    /**
     * Sets the value of the sellerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerUserID(String value) {
        this.sellerUserID = value;
    }

    /**
     * Gets the value of the sellerEIASToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerEIASToken() {
        return sellerEIASToken;
    }

    /**
     * Sets the value of the sellerEIASToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerEIASToken(String value) {
        this.sellerEIASToken = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the cancelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CancelStatusCodeType }
     *     
     */
    public CancelStatusCodeType getCancelStatus() {
        return cancelStatus;
    }

    /**
     * Sets the value of the cancelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelStatusCodeType }
     *     
     */
    public void setCancelStatus(CancelStatusCodeType value) {
        this.cancelStatus = value;
    }

    /**
     * Gets the value of the cancelReasonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReasonDetails() {
        return cancelReasonDetails;
    }

    /**
     * Sets the value of the cancelReasonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReasonDetails(String value) {
        this.cancelReasonDetails = value;
    }

    /**
     * Gets the value of the shippingConvenienceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingConvenienceCharge() {
        return shippingConvenienceCharge;
    }

    /**
     * Sets the value of the shippingConvenienceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingConvenienceCharge(AmountType value) {
        this.shippingConvenienceCharge = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CancelDetailType }
     *     
     */
    public CancelDetailType[] getCancelDetail() {
        if (this.cancelDetail == null) {
            return new CancelDetailType[ 0 ] ;
        }
        return ((CancelDetailType[]) this.cancelDetail.toArray(new CancelDetailType[this.cancelDetail.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CancelDetailType }
     *     
     */
    public CancelDetailType getCancelDetail(int idx) {
        if (this.cancelDetail == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.cancelDetail.get(idx);
    }

    public int getCancelDetailLength() {
        if (this.cancelDetail == null) {
            return  0;
        }
        return this.cancelDetail.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CancelDetailType }
     *     
     */
    public void setCancelDetail(CancelDetailType[] values) {
        this._getCancelDetail().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.cancelDetail.add(values[i]);
        }
    }

    protected List<CancelDetailType> _getCancelDetail() {
        if (cancelDetail == null) {
            cancelDetail = new ArrayList<CancelDetailType>();
        }
        return cancelDetail;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CancelDetailType }
     *     
     */
    public CancelDetailType setCancelDetail(int idx, CancelDetailType value) {
        return this.cancelDetail.set(idx, value);
    }

    /**
     * Gets the value of the logisticsPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsPlanType() {
        return logisticsPlanType;
    }

    /**
     * Sets the value of the logisticsPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsPlanType(String value) {
        this.logisticsPlanType = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link TaxIdentifierType }
     *     
     */
    public TaxIdentifierType[] getBuyerTaxIdentifier() {
        if (this.buyerTaxIdentifier == null) {
            return new TaxIdentifierType[ 0 ] ;
        }
        return ((TaxIdentifierType[]) this.buyerTaxIdentifier.toArray(new TaxIdentifierType[this.buyerTaxIdentifier.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link TaxIdentifierType }
     *     
     */
    public TaxIdentifierType getBuyerTaxIdentifier(int idx) {
        if (this.buyerTaxIdentifier == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.buyerTaxIdentifier.get(idx);
    }

    public int getBuyerTaxIdentifierLength() {
        if (this.buyerTaxIdentifier == null) {
            return  0;
        }
        return this.buyerTaxIdentifier.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link TaxIdentifierType }
     *     
     */
    public void setBuyerTaxIdentifier(TaxIdentifierType[] values) {
        this._getBuyerTaxIdentifier().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.buyerTaxIdentifier.add(values[i]);
        }
    }

    protected List<TaxIdentifierType> _getBuyerTaxIdentifier() {
        if (buyerTaxIdentifier == null) {
            buyerTaxIdentifier = new ArrayList<TaxIdentifierType>();
        }
        return buyerTaxIdentifier;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentifierType }
     *     
     */
    public TaxIdentifierType setBuyerTaxIdentifier(int idx, TaxIdentifierType value) {
        return this.buyerTaxIdentifier.set(idx, value);
    }

    /**
     * Gets the value of the buyerPackageEnclosures property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPackageEnclosuresType }
     *     
     */
    public BuyerPackageEnclosuresType getBuyerPackageEnclosures() {
        return buyerPackageEnclosures;
    }

    /**
     * Sets the value of the buyerPackageEnclosures property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPackageEnclosuresType }
     *     
     */
    public void setBuyerPackageEnclosures(BuyerPackageEnclosuresType value) {
        this.buyerPackageEnclosures = value;
    }

    /**
     * Gets the value of the extendedOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedOrderID() {
        return extendedOrderID;
    }

    /**
     * Sets the value of the extendedOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedOrderID(String value) {
        this.extendedOrderID = value;
    }

    /**
     * Gets the value of the containseBayPlusTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainseBayPlusTransaction() {
        return containseBayPlusTransaction;
    }

    /**
     * Sets the value of the containseBayPlusTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainseBayPlusTransaction(Boolean value) {
        this.containseBayPlusTransaction = value;
    }

    /**
     * Gets the value of the eBayCollectAndRemitTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayCollectAndRemitTax() {
        return eBayCollectAndRemitTax;
    }

    /**
     * Sets the value of the eBayCollectAndRemitTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayCollectAndRemitTax(Boolean value) {
        this.eBayCollectAndRemitTax = value;
    }

    /**
     * Gets the value of the orderLineItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderLineItemCount() {
        return orderLineItemCount;
    }

    /**
     * Sets the value of the orderLineItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderLineItemCount(Long value) {
        this.orderLineItemCount = value;
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
