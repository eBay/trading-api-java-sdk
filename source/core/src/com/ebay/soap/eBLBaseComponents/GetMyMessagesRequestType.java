
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Retrieves information about the messages sent to a given user.
 * 			
 * 
 * <p>Java class for GetMyMessagesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyMessagesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="MessageIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageIDArrayType" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExternalMessageIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesExternalMessageIDArrayType" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="IncludeHighPriorityMessageOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyMessagesRequestType", propOrder = {
    "messageIDs",
    "folderID",
    "startTime",
    "endTime",
    "externalMessageIDs",
    "pagination",
    "includeHighPriorityMessageOnly"
})
public class GetMyMessagesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MessageIDs")
    protected MyMessagesMessageIDArrayType messageIDs;
    @XmlElement(name = "FolderID")
    protected Long folderID;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTime;
    @XmlElement(name = "ExternalMessageIDs")
    protected MyMessagesExternalMessageIDArrayType externalMessageIDs;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;
    @XmlElement(name = "IncludeHighPriorityMessageOnly")
    protected Boolean includeHighPriorityMessageOnly;

    /**
     * Gets the value of the messageIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesMessageIDArrayType }
     *     
     */
    public MyMessagesMessageIDArrayType getMessageIDs() {
        return messageIDs;
    }

    /**
     * Sets the value of the messageIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesMessageIDArrayType }
     *     
     */
    public void setMessageIDs(MyMessagesMessageIDArrayType value) {
        this.messageIDs = value;
    }

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(Calendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Calendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the externalMessageIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesExternalMessageIDArrayType }
     *     
     */
    public MyMessagesExternalMessageIDArrayType getExternalMessageIDs() {
        return externalMessageIDs;
    }

    /**
     * Sets the value of the externalMessageIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesExternalMessageIDArrayType }
     *     
     */
    public void setExternalMessageIDs(MyMessagesExternalMessageIDArrayType value) {
        this.externalMessageIDs = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the includeHighPriorityMessageOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHighPriorityMessageOnly() {
        return includeHighPriorityMessageOnly;
    }

    /**
     * Sets the value of the includeHighPriorityMessageOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHighPriorityMessageOnly(Boolean value) {
        this.includeHighPriorityMessageOnly = value;
    }

}
