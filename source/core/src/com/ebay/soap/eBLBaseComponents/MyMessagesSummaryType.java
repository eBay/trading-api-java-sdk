
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
 * 				Summary data for a given user's alerts and messages.
 * 				This includes the numbers of new alerts and messages,
 * 				unresolved alerts, flagged messages, and total alerts
 * 				and messages.
 * 			
 * 
 * <p>Java class for MyMessagesSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderSummary" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesFolderSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NewMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlaggedMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NewHighPriorityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalHighPriorityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesSummaryType", propOrder = {
    "folderSummary",
    "newMessageCount",
    "flaggedMessageCount",
    "totalMessageCount",
    "newHighPriorityCount",
    "totalHighPriorityCount"
})
public class MyMessagesSummaryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FolderSummary")
    protected List<MyMessagesFolderSummaryType> folderSummary;
    @XmlElement(name = "NewMessageCount")
    protected Integer newMessageCount;
    @XmlElement(name = "FlaggedMessageCount")
    protected Integer flaggedMessageCount;
    @XmlElement(name = "TotalMessageCount")
    protected Integer totalMessageCount;
    @XmlElement(name = "NewHighPriorityCount")
    protected Integer newHighPriorityCount;
    @XmlElement(name = "TotalHighPriorityCount")
    protected Integer totalHighPriorityCount;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MyMessagesFolderSummaryType }
     *     
     */
    public MyMessagesFolderSummaryType[] getFolderSummary() {
        if (this.folderSummary == null) {
            return new MyMessagesFolderSummaryType[ 0 ] ;
        }
        return ((MyMessagesFolderSummaryType[]) this.folderSummary.toArray(new MyMessagesFolderSummaryType[this.folderSummary.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MyMessagesFolderSummaryType }
     *     
     */
    public MyMessagesFolderSummaryType getFolderSummary(int idx) {
        if (this.folderSummary == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.folderSummary.get(idx);
    }

    public int getFolderSummaryLength() {
        if (this.folderSummary == null) {
            return  0;
        }
        return this.folderSummary.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MyMessagesFolderSummaryType }
     *     
     */
    public void setFolderSummary(MyMessagesFolderSummaryType[] values) {
        this._getFolderSummary().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.folderSummary.add(values[i]);
        }
    }

    protected List<MyMessagesFolderSummaryType> _getFolderSummary() {
        if (folderSummary == null) {
            folderSummary = new ArrayList<MyMessagesFolderSummaryType>();
        }
        return folderSummary;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesFolderSummaryType }
     *     
     */
    public MyMessagesFolderSummaryType setFolderSummary(int idx, MyMessagesFolderSummaryType value) {
        return this.folderSummary.set(idx, value);
    }

    /**
     * Gets the value of the newMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewMessageCount() {
        return newMessageCount;
    }

    /**
     * Sets the value of the newMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewMessageCount(Integer value) {
        this.newMessageCount = value;
    }

    /**
     * Gets the value of the flaggedMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlaggedMessageCount() {
        return flaggedMessageCount;
    }

    /**
     * Sets the value of the flaggedMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlaggedMessageCount(Integer value) {
        this.flaggedMessageCount = value;
    }

    /**
     * Gets the value of the totalMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalMessageCount() {
        return totalMessageCount;
    }

    /**
     * Sets the value of the totalMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalMessageCount(Integer value) {
        this.totalMessageCount = value;
    }

    /**
     * Gets the value of the newHighPriorityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewHighPriorityCount() {
        return newHighPriorityCount;
    }

    /**
     * Sets the value of the newHighPriorityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewHighPriorityCount(Integer value) {
        this.newHighPriorityCount = value;
    }

    /**
     * Gets the value of the totalHighPriorityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalHighPriorityCount() {
        return totalHighPriorityCount;
    }

    /**
     * Sets the value of the totalHighPriorityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalHighPriorityCount(Integer value) {
        this.totalHighPriorityCount = value;
    }

}
