
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
 * 				Type defining the array of <b>AccountEntry</b> objects that are conditionally returned in the <b>GetAccount</b> response.
 * 			
 * 
 * <p>Java class for AccountEntriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountEntriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountEntry" type="{urn:ebay:apis:eBLBaseComponents}AccountEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AccountEntriesType", propOrder = {
    "accountEntry",
    "any"
})
public class AccountEntriesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AccountEntry")
    protected List<AccountEntryType> accountEntry;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AccountEntryType }
     *     
     */
    public AccountEntryType[] getAccountEntry() {
        if (this.accountEntry == null) {
            return new AccountEntryType[ 0 ] ;
        }
        return ((AccountEntryType[]) this.accountEntry.toArray(new AccountEntryType[this.accountEntry.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AccountEntryType }
     *     
     */
    public AccountEntryType getAccountEntry(int idx) {
        if (this.accountEntry == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.accountEntry.get(idx);
    }

    public int getAccountEntryLength() {
        if (this.accountEntry == null) {
            return  0;
        }
        return this.accountEntry.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AccountEntryType }
     *     
     */
    public void setAccountEntry(AccountEntryType[] values) {
        this._getAccountEntry().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.accountEntry.add(values[i]);
        }
    }

    protected List<AccountEntryType> _getAccountEntry() {
        if (accountEntry == null) {
            accountEntry = new ArrayList<AccountEntryType>();
        }
        return accountEntry;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AccountEntryType }
     *     
     */
    public AccountEntryType setAccountEntry(int idx, AccountEntryType value) {
        return this.accountEntry.set(idx, value);
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
