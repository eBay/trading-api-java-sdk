
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
 * 				Enables a seller to change the price and/or quantity of one to four
 * 				active, fixed-price listings. The fixed-price listing to modify is identified with the <b>ItemID</b> of the listing and/or the <b>SKU</b> value of the item (if a seller-defined SKU value exists for the listing). If the seller is modifying one or more variations within a multiple-variation listing, the <b>ItemID</b> and <b>SKU</b> fields in the <b>InventoryStatus</b> container become required, with the <b>ItemID</b> value identifying the listing, and the <b>SKU</b> value identifying the specific product variation within that multiple-variation listing. Each variation within a multiple-variation listing requires a seller-defined SKU value.
 * 				<br/><br/>
 * 				Whether updating the price and/or quantity of a single-variation listing or a specific variation within a multiple-variation listing, the limit of items or item variations that can be modified with one call is four.
 * 			
 * 
 * <p>Java class for ReviseInventoryStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseInventoryStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="InventoryStatus" type="{urn:ebay:apis:eBLBaseComponents}InventoryStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseInventoryStatusRequestType", propOrder = {
    "inventoryStatus",
    "reviseInventoryStatusRequestTypeAny"
})
public class ReviseInventoryStatusRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "InventoryStatus")
    protected List<InventoryStatusType> inventoryStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> reviseInventoryStatusRequestTypeAny;

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
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getReviseInventoryStatusRequestTypeAny() {
        if (this.reviseInventoryStatusRequestTypeAny == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.reviseInventoryStatusRequestTypeAny.toArray(new Object[this.reviseInventoryStatusRequestTypeAny.size()] ));
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
    public Object getReviseInventoryStatusRequestTypeAny(int idx) {
        if (this.reviseInventoryStatusRequestTypeAny == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.reviseInventoryStatusRequestTypeAny.get(idx);
    }

    public int getReviseInventoryStatusRequestTypeAnyLength() {
        if (this.reviseInventoryStatusRequestTypeAny == null) {
            return  0;
        }
        return this.reviseInventoryStatusRequestTypeAny.size();
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
    public void setReviseInventoryStatusRequestTypeAny(Object[] values) {
        this._getReviseInventoryStatusRequestTypeAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.reviseInventoryStatusRequestTypeAny.add(values[i]);
        }
    }

    protected List<Object> _getReviseInventoryStatusRequestTypeAny() {
        if (reviseInventoryStatusRequestTypeAny == null) {
            reviseInventoryStatusRequestTypeAny = new ArrayList<Object>();
        }
        return reviseInventoryStatusRequestTypeAny;
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
    public Object setReviseInventoryStatusRequestTypeAny(int idx, Object value) {
        return this.reviseInventoryStatusRequestTypeAny.set(idx, value);
    }

}
