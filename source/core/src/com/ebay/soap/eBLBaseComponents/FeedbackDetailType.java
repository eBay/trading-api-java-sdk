
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
 * 				Type used by the <b>FeedbackDetail</b> containers that are returned in the <b>GetFeedback</b> response. Each <b>FeedbackDetail</b> container consists of detailed information on one Feedback entry for a specific
 * 				order line item. This container will only be returned if uses the <b>DetailLevel</b> field and sets its value to <code>ReturnAll</code>.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b> Although it is possible for users to retrieve Feedback entries for order line items in which they are not the buyer or seller, some of the fields of the <b>FeedbackDetail</b> container will not be returned or masked. More details on the fields that will not be returned or masked are discussed in this type's individual fields.
 * 				</span>
 * 		  
 * 
 * <p>Java class for FeedbackDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentingUser" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="FeedbackRatingStar" type="{urn:ebay:apis:eBLBaseComponents}FeedbackRatingStarCodeType" minOccurs="0"/>
 *         &lt;element name="CommentingUserScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CommentType" type="{urn:ebay:apis:eBLBaseComponents}CommentTypeCodeType" minOccurs="0"/>
 *         &lt;element name="FeedbackResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Followup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="Role" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="ItemTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FeedbackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResponseReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FollowUpReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Countable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeedbackRevised" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "FeedbackDetailType", propOrder = {
    "commentingUser",
    "feedbackRatingStar",
    "commentingUserScore",
    "commentText",
    "commentTime",
    "commentType",
    "feedbackResponse",
    "followup",
    "itemID",
    "role",
    "itemTitle",
    "itemPrice",
    "feedbackID",
    "transactionID",
    "commentReplaced",
    "responseReplaced",
    "followUpReplaced",
    "countable",
    "feedbackRevised",
    "orderLineItemID",
    "any"
})
public class FeedbackDetailType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CommentingUser")
    protected String commentingUser;
    @XmlElement(name = "FeedbackRatingStar")
    protected FeedbackRatingStarCodeType feedbackRatingStar;
    @XmlElement(name = "CommentingUserScore")
    protected Integer commentingUserScore;
    @XmlElement(name = "CommentText")
    protected String commentText;
    @XmlElement(name = "CommentTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar commentTime;
    @XmlElement(name = "CommentType")
    protected CommentTypeCodeType commentType;
    @XmlElement(name = "FeedbackResponse")
    protected String feedbackResponse;
    @XmlElement(name = "Followup")
    protected String followup;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "Role")
    protected TradingRoleCodeType role;
    @XmlElement(name = "ItemTitle")
    protected String itemTitle;
    @XmlElement(name = "ItemPrice")
    protected AmountType itemPrice;
    @XmlElement(name = "FeedbackID")
    protected String feedbackID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "CommentReplaced")
    protected Boolean commentReplaced;
    @XmlElement(name = "ResponseReplaced")
    protected Boolean responseReplaced;
    @XmlElement(name = "FollowUpReplaced")
    protected Boolean followUpReplaced;
    @XmlElement(name = "Countable")
    protected Boolean countable;
    @XmlElement(name = "FeedbackRevised")
    protected Boolean feedbackRevised;
    @XmlElement(name = "OrderLineItemID")
    protected String orderLineItemID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the commentingUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentingUser() {
        return commentingUser;
    }

    /**
     * Sets the value of the commentingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentingUser(String value) {
        this.commentingUser = value;
    }

    /**
     * Gets the value of the feedbackRatingStar property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public FeedbackRatingStarCodeType getFeedbackRatingStar() {
        return feedbackRatingStar;
    }

    /**
     * Sets the value of the feedbackRatingStar property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public void setFeedbackRatingStar(FeedbackRatingStarCodeType value) {
        this.feedbackRatingStar = value;
    }

    /**
     * Gets the value of the commentingUserScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommentingUserScore() {
        return commentingUserScore;
    }

    /**
     * Sets the value of the commentingUserScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommentingUserScore(Integer value) {
        this.commentingUserScore = value;
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
     * Gets the value of the commentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCommentTime() {
        return commentTime;
    }

    /**
     * Sets the value of the commentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentTime(Calendar value) {
        this.commentTime = value;
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
     * Gets the value of the feedbackResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackResponse() {
        return feedbackResponse;
    }

    /**
     * Sets the value of the feedbackResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackResponse(String value) {
        this.feedbackResponse = value;
    }

    /**
     * Gets the value of the followup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowup() {
        return followup;
    }

    /**
     * Sets the value of the followup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowup(String value) {
        this.followup = value;
    }

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
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setRole(TradingRoleCodeType value) {
        this.role = value;
    }

    /**
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemPrice(AmountType value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the feedbackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackID() {
        return feedbackID;
    }

    /**
     * Sets the value of the feedbackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackID(String value) {
        this.feedbackID = value;
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
     * Gets the value of the commentReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommentReplaced() {
        return commentReplaced;
    }

    /**
     * Sets the value of the commentReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommentReplaced(Boolean value) {
        this.commentReplaced = value;
    }

    /**
     * Gets the value of the responseReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResponseReplaced() {
        return responseReplaced;
    }

    /**
     * Sets the value of the responseReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResponseReplaced(Boolean value) {
        this.responseReplaced = value;
    }

    /**
     * Gets the value of the followUpReplaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowUpReplaced() {
        return followUpReplaced;
    }

    /**
     * Sets the value of the followUpReplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowUpReplaced(Boolean value) {
        this.followUpReplaced = value;
    }

    /**
     * Gets the value of the countable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCountable() {
        return countable;
    }

    /**
     * Sets the value of the countable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountable(Boolean value) {
        this.countable = value;
    }

    /**
     * Gets the value of the feedbackRevised property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeedbackRevised() {
        return feedbackRevised;
    }

    /**
     * Sets the value of the feedbackRevised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeedbackRevised(Boolean value) {
        this.feedbackRevised = value;
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
