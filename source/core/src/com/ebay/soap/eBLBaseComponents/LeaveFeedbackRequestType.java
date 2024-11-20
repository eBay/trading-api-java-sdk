
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables a buyer and seller to leave Feedback for their order partner at the
 * 				conclusion of a successful order.
 * 			
 * 
 * <p>Java class for LeaveFeedbackRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeaveFeedbackRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentType" type="{urn:ebay:apis:eBLBaseComponents}CommentTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetUser" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="SellerItemRatingDetailArray" type="{urn:ebay:apis:eBLBaseComponents}ItemRatingDetailArrayType" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemArrivedWithinEDDType" type="{urn:ebay:apis:eBLBaseComponents}ItemArrivedWithinEDDCodeType" minOccurs="0"/>
 *         &lt;element name="ItemDeliveredWithinEDD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeaveFeedbackRequestType", propOrder = {
    "itemID",
    "commentText",
    "commentType",
    "transactionID",
    "targetUser",
    "sellerItemRatingDetailArray",
    "orderLineItemID",
    "itemArrivedWithinEDDType",
    "itemDeliveredWithinEDD"
})
public class LeaveFeedbackRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "CommentText")
    protected String commentText;
    @XmlElement(name = "CommentType")
    protected CommentTypeCodeType commentType;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "TargetUser")
    protected String targetUser;
    @XmlElement(name = "SellerItemRatingDetailArray")
    protected ItemRatingDetailArrayType sellerItemRatingDetailArray;
    @XmlElement(name = "OrderLineItemID")
    protected String orderLineItemID;
    @XmlElement(name = "ItemArrivedWithinEDDType")
    protected ItemArrivedWithinEDDCodeType itemArrivedWithinEDDType;
    @XmlElement(name = "ItemDeliveredWithinEDD")
    protected Boolean itemDeliveredWithinEDD;

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
     * Gets the value of the commentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

    /**
     * Gets the value of the commentType property.
     * 
     * @return
     *     possible object is
     *     {@link CommentTypeCodeType }
     *     
     */
    public CommentTypeCodeType getCommentType() {
        return commentType;
    }

    /**
     * Sets the value of the commentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentTypeCodeType }
     *     
     */
    public void setCommentType(CommentTypeCodeType value) {
        this.commentType = value;
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
     * Gets the value of the targetUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetUser() {
        return targetUser;
    }

    /**
     * Sets the value of the targetUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetUser(String value) {
        this.targetUser = value;
    }

    /**
     * Gets the value of the sellerItemRatingDetailArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRatingDetailArrayType }
     *     
     */
    public ItemRatingDetailArrayType getSellerItemRatingDetailArray() {
        return sellerItemRatingDetailArray;
    }

    /**
     * Sets the value of the sellerItemRatingDetailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRatingDetailArrayType }
     *     
     */
    public void setSellerItemRatingDetailArray(ItemRatingDetailArrayType value) {
        this.sellerItemRatingDetailArray = value;
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
     * Gets the value of the itemArrivedWithinEDDType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemArrivedWithinEDDCodeType }
     *     
     */
    public ItemArrivedWithinEDDCodeType getItemArrivedWithinEDDType() {
        return itemArrivedWithinEDDType;
    }

    /**
     * Sets the value of the itemArrivedWithinEDDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemArrivedWithinEDDCodeType }
     *     
     */
    public void setItemArrivedWithinEDDType(ItemArrivedWithinEDDCodeType value) {
        this.itemArrivedWithinEDDType = value;
    }

    /**
     * Gets the value of the itemDeliveredWithinEDD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemDeliveredWithinEDD() {
        return itemDeliveredWithinEDD;
    }

    /**
     * Sets the value of the itemDeliveredWithinEDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemDeliveredWithinEDD(Boolean value) {
        this.itemDeliveredWithinEDD = value;
    }

}
