
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
 * <p>Java class for PictureManagerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureManagerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionLevel" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerSubscriptionLevelCodeType" minOccurs="0"/>
 *         &lt;element name="StorageUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalStorageAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KeepOriginal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WatermarkEPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WatermarkUserID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerFolderType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PictureManagerDetailsType", propOrder = {
    "subscriptionLevel",
    "storageUsed",
    "totalStorageAvailable",
    "keepOriginal",
    "watermarkEPS",
    "watermarkUserID",
    "folder",
    "any"
})
public class PictureManagerDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SubscriptionLevel")
    protected PictureManagerSubscriptionLevelCodeType subscriptionLevel;
    @XmlElement(name = "StorageUsed")
    protected Integer storageUsed;
    @XmlElement(name = "TotalStorageAvailable")
    protected Integer totalStorageAvailable;
    @XmlElement(name = "KeepOriginal")
    protected Boolean keepOriginal;
    @XmlElement(name = "WatermarkEPS")
    protected Boolean watermarkEPS;
    @XmlElement(name = "WatermarkUserID")
    protected Boolean watermarkUserID;
    @XmlElement(name = "Folder")
    protected List<PictureManagerFolderType> folder;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the subscriptionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PictureManagerSubscriptionLevelCodeType }
     *     
     */
    public PictureManagerSubscriptionLevelCodeType getSubscriptionLevel() {
        return subscriptionLevel;
    }

    /**
     * Sets the value of the subscriptionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerSubscriptionLevelCodeType }
     *     
     */
    public void setSubscriptionLevel(PictureManagerSubscriptionLevelCodeType value) {
        this.subscriptionLevel = value;
    }

    /**
     * Gets the value of the storageUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStorageUsed() {
        return storageUsed;
    }

    /**
     * Sets the value of the storageUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStorageUsed(Integer value) {
        this.storageUsed = value;
    }

    /**
     * Gets the value of the totalStorageAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalStorageAvailable() {
        return totalStorageAvailable;
    }

    /**
     * Sets the value of the totalStorageAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalStorageAvailable(Integer value) {
        this.totalStorageAvailable = value;
    }

    /**
     * Gets the value of the keepOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepOriginal() {
        return keepOriginal;
    }

    /**
     * Sets the value of the keepOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepOriginal(Boolean value) {
        this.keepOriginal = value;
    }

    /**
     * Gets the value of the watermarkEPS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWatermarkEPS() {
        return watermarkEPS;
    }

    /**
     * Sets the value of the watermarkEPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWatermarkEPS(Boolean value) {
        this.watermarkEPS = value;
    }

    /**
     * Gets the value of the watermarkUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWatermarkUserID() {
        return watermarkUserID;
    }

    /**
     * Sets the value of the watermarkUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWatermarkUserID(Boolean value) {
        this.watermarkUserID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PictureManagerFolderType }
     *     
     */
    public PictureManagerFolderType[] getFolder() {
        if (this.folder == null) {
            return new PictureManagerFolderType[ 0 ] ;
        }
        return ((PictureManagerFolderType[]) this.folder.toArray(new PictureManagerFolderType[this.folder.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PictureManagerFolderType }
     *     
     */
    public PictureManagerFolderType getFolder(int idx) {
        if (this.folder == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.folder.get(idx);
    }

    public int getFolderLength() {
        if (this.folder == null) {
            return  0;
        }
        return this.folder.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PictureManagerFolderType }
     *     
     */
    public void setFolder(PictureManagerFolderType[] values) {
        this._getFolder().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.folder.add(values[i]);
        }
    }

    protected List<PictureManagerFolderType> _getFolder() {
        if (folder == null) {
            folder = new ArrayList<PictureManagerFolderType>();
        }
        return folder;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerFolderType }
     *     
     */
    public PictureManagerFolderType setFolder(int idx, PictureManagerFolderType value) {
        return this.folder.set(idx, value);
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
