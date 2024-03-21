
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Summary data for the requesting user's seller account as a whole. This includes a
 * 				balance for the account, any past due amount and date, and defining data for
 * 				additional accounts (if the user has changed country of residency while having an
 * 				active eBay account).
 * 			
 * 
 * <p>Java class for AccountSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountState" type="{urn:ebay:apis:eBLBaseComponents}AccountStateCodeType" minOccurs="0"/>
 *         &lt;element name="InvoicePayment" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InvoiceCredit" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InvoiceNewFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AdditionalAccount" type="{urn:ebay:apis:eBLBaseComponents}AdditionalAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AmountPastDue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="BankAccountInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BillingCycleDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditCardExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditCardInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CurrentBalance" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceBalance" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastAmountPaid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="LastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PastDue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="NettedTransactionSummary" type="{urn:ebay:apis:eBLBaseComponents}NettedTransactionSummaryType" minOccurs="0"/>
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
@XmlType(name = "AccountSummaryType", propOrder = {
    "accountState",
    "invoicePayment",
    "invoiceCredit",
    "invoiceNewFee",
    "additionalAccount",
    "amountPastDue",
    "bankAccountInfo",
    "bankModifyDate",
    "billingCycleDate",
    "creditCardExpiration",
    "creditCardInfo",
    "creditCardModifyDate",
    "currentBalance",
    "email",
    "invoiceBalance",
    "invoiceDate",
    "lastAmountPaid",
    "lastPaymentDate",
    "pastDue",
    "paymentMethod",
    "nettedTransactionSummary",
    "any"
})
public class AccountSummaryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AccountState")
    protected AccountStateCodeType accountState;
    @XmlElement(name = "InvoicePayment")
    protected AmountType invoicePayment;
    @XmlElement(name = "InvoiceCredit")
    protected AmountType invoiceCredit;
    @XmlElement(name = "InvoiceNewFee")
    protected AmountType invoiceNewFee;
    @XmlElement(name = "AdditionalAccount")
    protected List<AdditionalAccountType> additionalAccount;
    @XmlElement(name = "AmountPastDue")
    protected AmountType amountPastDue;
    @XmlElement(name = "BankAccountInfo")
    protected String bankAccountInfo;
    @XmlElement(name = "BankModifyDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar bankModifyDate;
    @XmlElement(name = "BillingCycleDate")
    protected Integer billingCycleDate;
    @XmlElement(name = "CreditCardExpiration", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creditCardExpiration;
    @XmlElement(name = "CreditCardInfo")
    protected String creditCardInfo;
    @XmlElement(name = "CreditCardModifyDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creditCardModifyDate;
    @XmlElement(name = "CurrentBalance")
    protected AmountType currentBalance;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "InvoiceBalance")
    protected AmountType invoiceBalance;
    @XmlElement(name = "InvoiceDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar invoiceDate;
    @XmlElement(name = "LastAmountPaid")
    protected AmountType lastAmountPaid;
    @XmlElement(name = "LastPaymentDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastPaymentDate;
    @XmlElement(name = "PastDue")
    protected Boolean pastDue;
    @XmlElement(name = "PaymentMethod")
    protected SellerPaymentMethodCodeType paymentMethod;
    @XmlElement(name = "NettedTransactionSummary")
    protected NettedTransactionSummaryType nettedTransactionSummary;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the accountState property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStateCodeType }
     *     
     */
    public AccountStateCodeType getAccountState() {
        return accountState;
    }

    /**
     * Sets the value of the accountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStateCodeType }
     *     
     */
    public void setAccountState(AccountStateCodeType value) {
        this.accountState = value;
    }

    /**
     * Gets the value of the invoicePayment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoicePayment() {
        return invoicePayment;
    }

    /**
     * Sets the value of the invoicePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoicePayment(AmountType value) {
        this.invoicePayment = value;
    }

    /**
     * Gets the value of the invoiceCredit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoiceCredit() {
        return invoiceCredit;
    }

    /**
     * Sets the value of the invoiceCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoiceCredit(AmountType value) {
        this.invoiceCredit = value;
    }

    /**
     * Gets the value of the invoiceNewFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoiceNewFee() {
        return invoiceNewFee;
    }

    /**
     * Sets the value of the invoiceNewFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoiceNewFee(AmountType value) {
        this.invoiceNewFee = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AdditionalAccountType }
     *     
     */
    public AdditionalAccountType[] getAdditionalAccount() {
        if (this.additionalAccount == null) {
            return new AdditionalAccountType[ 0 ] ;
        }
        return ((AdditionalAccountType[]) this.additionalAccount.toArray(new AdditionalAccountType[this.additionalAccount.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AdditionalAccountType }
     *     
     */
    public AdditionalAccountType getAdditionalAccount(int idx) {
        if (this.additionalAccount == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.additionalAccount.get(idx);
    }

    public int getAdditionalAccountLength() {
        if (this.additionalAccount == null) {
            return  0;
        }
        return this.additionalAccount.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AdditionalAccountType }
     *     
     */
    public void setAdditionalAccount(AdditionalAccountType[] values) {
        this._getAdditionalAccount().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.additionalAccount.add(values[i]);
        }
    }

    protected List<AdditionalAccountType> _getAdditionalAccount() {
        if (additionalAccount == null) {
            additionalAccount = new ArrayList<AdditionalAccountType>();
        }
        return additionalAccount;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalAccountType }
     *     
     */
    public AdditionalAccountType setAdditionalAccount(int idx, AdditionalAccountType value) {
        return this.additionalAccount.set(idx, value);
    }

    /**
     * Gets the value of the amountPastDue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPastDue() {
        return amountPastDue;
    }

    /**
     * Sets the value of the amountPastDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPastDue(AmountType value) {
        this.amountPastDue = value;
    }

    /**
     * Gets the value of the bankAccountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountInfo() {
        return bankAccountInfo;
    }

    /**
     * Sets the value of the bankAccountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountInfo(String value) {
        this.bankAccountInfo = value;
    }

    /**
     * Gets the value of the bankModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBankModifyDate() {
        return bankModifyDate;
    }

    /**
     * Sets the value of the bankModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankModifyDate(Calendar value) {
        this.bankModifyDate = value;
    }

    /**
     * Gets the value of the billingCycleDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingCycleDate() {
        return billingCycleDate;
    }

    /**
     * Sets the value of the billingCycleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingCycleDate(Integer value) {
        this.billingCycleDate = value;
    }

    /**
     * Gets the value of the creditCardExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreditCardExpiration() {
        return creditCardExpiration;
    }

    /**
     * Sets the value of the creditCardExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpiration(Calendar value) {
        this.creditCardExpiration = value;
    }

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardInfo(String value) {
        this.creditCardInfo = value;
    }

    /**
     * Gets the value of the creditCardModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreditCardModifyDate() {
        return creditCardModifyDate;
    }

    /**
     * Sets the value of the creditCardModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardModifyDate(Calendar value) {
        this.creditCardModifyDate = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentBalance(AmountType value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the invoiceBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoiceBalance() {
        return invoiceBalance;
    }

    /**
     * Sets the value of the invoiceBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoiceBalance(AmountType value) {
        this.invoiceBalance = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(Calendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the lastAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLastAmountPaid() {
        return lastAmountPaid;
    }

    /**
     * Sets the value of the lastAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLastAmountPaid(AmountType value) {
        this.lastAmountPaid = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPaymentDate(Calendar value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the pastDue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPastDue() {
        return pastDue;
    }

    /**
     * Sets the value of the pastDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPastDue(Boolean value) {
        this.pastDue = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentMethodCodeType }
     *     
     */
    public SellerPaymentMethodCodeType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethod(SellerPaymentMethodCodeType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the nettedTransactionSummary property.
     * 
     * @return
     *     possible object is
     *     {@link NettedTransactionSummaryType }
     *     
     */
    public NettedTransactionSummaryType getNettedTransactionSummary() {
        return nettedTransactionSummary;
    }

    /**
     * Sets the value of the nettedTransactionSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettedTransactionSummaryType }
     *     
     */
    public void setNettedTransactionSummary(NettedTransactionSummaryType value) {
        this.nettedTransactionSummary = value;
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
