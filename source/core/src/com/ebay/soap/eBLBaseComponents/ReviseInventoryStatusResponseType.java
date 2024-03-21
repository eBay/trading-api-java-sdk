
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
 * 				The base response type for the <b>ReviseInventoryStatus</b> call. The response includes a <b>Fees</b> container and an <b>InventoryStatus</b> container for each item and/or item variation that was revised.
 * 			
 * 
 * <p>Java class for ReviseInventoryStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseInventoryStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="InventoryStatus" type="{urn:ebay:apis:eBLBaseComponents}InventoryStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fees" type="{urn:ebay:apis:eBLBaseComponents}InventoryFeesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseInventoryStatusResponseType", propOrder = {
    "inventoryStatus",
    "fees"
})
public class ReviseInventoryStatusResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "InventoryStatus")
    protected List<InventoryStatusType> inventoryStatus;
    @XmlElement(name = "Fees")
    protected List<InventoryFeesType> fees;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link InventoryStatusType }
     *     
     */
    public InventoryStatusType[] getInventoryStatus() {
        if (this.inventoryStatus == null) {
            return new InventoryStatusType[ 0 ] ;
        }
        return ((InventoryStatusType[]) this.inventoryStatus.toArray(new InventoryStatusType[this.inventoryStatus.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link InventoryStatusType }
     *     
     */
    public InventoryStatusType getInventoryStatus(int idx) {
        if (this.inventoryStatus == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.inventoryStatus.get(idx);
    }

    public int getInventoryStatusLength() {
        if (this.inventoryStatus == null) {
            return  0;
        }
        return this.inventoryStatus.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link InventoryStatusType }
     *     
     */
    public void setInventoryStatus(InventoryStatusType[] values) {
        this._getInventoryStatus().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.inventoryStatus.add(values[i]);
        }
    }

    protected List<InventoryStatusType> _getInventoryStatus() {
        if (inventoryStatus == null) {
            inventoryStatus = new ArrayList<InventoryStatusType>();
        }
        return inventoryStatus;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatusType }
     *     
     */
    public InventoryStatusType setInventoryStatus(int idx, InventoryStatusType value) {
        return this.inventoryStatus.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link InventoryFeesType }
     *     
     */
    public InventoryFeesType[] getFees() {
        if (this.fees == null) {
            return new InventoryFeesType[ 0 ] ;
        }
        return ((InventoryFeesType[]) this.fees.toArray(new InventoryFeesType[this.fees.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link InventoryFeesType }
     *     
     */
    public InventoryFeesType getFees(int idx) {
        if (this.fees == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.fees.get(idx);
    }

    public int getFeesLength() {
        if (this.fees == null) {
            return  0;
        }
        return this.fees.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link InventoryFeesType }
     *     
     */
    public void setFees(InventoryFeesType[] values) {
        this._getFees().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.fees.add(values[i]);
        }
    }

    protected List<InventoryFeesType> _getFees() {
        if (fees == null) {
            fees = new ArrayList<InventoryFeesType>();
        }
        return fees;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryFeesType }
     *     
     */
    public InventoryFeesType setFees(int idx, InventoryFeesType value) {
        return this.fees.set(idx, value);
    }

}
