
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
 * 				Type defining the <b>TransactionArray</b> container, which contains an
 * 				array of <b>Transaction</b> containers. Each <b>Transaction</b>
 * 				container consists of detailed information on one order line item.
 * 			
 * 
 * <p>Java class for TransactionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction" type="{urn:ebay:apis:eBLBaseComponents}TransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionArrayType", propOrder = {
    "transaction"
})
public class TransactionArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Transaction")
    protected List<TransactionType> transaction;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link TransactionType }
     *     
     */
    public TransactionType[] getTransaction() {
        if (this.transaction == null) {
            return new TransactionType[ 0 ] ;
        }
        return ((TransactionType[]) this.transaction.toArray(new TransactionType[this.transaction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransaction(int idx) {
        if (this.transaction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.transaction.get(idx);
    }

    public int getTransactionLength() {
        if (this.transaction == null) {
            return  0;
        }
        return this.transaction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link TransactionType }
     *     
     */
    public void setTransaction(TransactionType[] values) {
        this._getTransaction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.transaction.add(values[i]);
        }
    }

    protected List<TransactionType> _getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<TransactionType>();
        }
        return transaction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType setTransaction(int idx, TransactionType value) {
        return this.transaction.set(idx, value);
    }

}
