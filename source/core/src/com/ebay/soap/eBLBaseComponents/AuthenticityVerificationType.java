
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
 * 			This type is used by the <b>AuthenticityVerification</b> container, which gives status on whether the order line
 * 			item has passed or failed the authenticity inspection, or if the test is still pending. The following table
 * 			describes the relationship between the <b>Status</b> and <b>OutcomeReason</b> fields.
 * 			<table>
 * 				<col />
 * 				<col />
 * 				<col />
 * 				<thead>
 * 					<tr>
 * 						<th>
 * 							<p>Status</p>
 * 						</th>
 * 						<th>
 * 							<p>OutcomeReason</p>
 * 						</th>
 * 						<th>
 * 							<p>Description</p>
 * 						</th>
 * 					</tr>
 * 				</thead>
 * 				<tbody>
 * 					<tr>
 * 						<td>PENDING</td>
 * 						<td><em>Not applicable</em></td>
 * 						<td>Authenticity checks have not completed (the authentication status is pending). The order's authenticity
 * 						is still unknown</td>
 * 					</tr>
 * 					<tr>
 * 						<td>PASSED</td>
 * 						<td><em>Not applicable</em></td>
 * 						<td>The authentication has been accepted. The order is authentic. The authentication partner sends the order
 * 						line item to the buyer with the message that the item is authentic</td>
 * 					</tr>
 * 					<tr>
 * 						<td rowspan="2">PASSED_WITH_EXCEPTION <br />There may be legal reasons or requirements such that the item
 * 						cannot be labeled authentic. </td>
 * 						<td>CUSTOMIZED</td>
 * 						<td>The order line item has been altered or customized, and cannot be labeled as authentic but will be sent
 * 						to the buyer</td>
 * 					</tr>
 * 					<tr>
 * 						<td>MISCATEGORIZED</td>
 * 						<td>The order line item was in the wrong eBay category and cannot be labeled as authentic but will be sent
 * 						to the buyer</td>
 * 					</tr>
 * 					<tr>
 * 						<td>PASSED_WITH_PARTIAL_FAILURE </td>
 * 						<td><em>Dependent</em></td>
 * 						<td>Multi-quantity use case where part of the order is authentic, but the other part of the order FAILED</td>
 * 					</tr>
 * 					<tr>
 * 						<td rowspan="3">FAILED</td>
 * 						<td>NOT_AUTHENTIC</td>
 * 						<td>The order could not be authenticated. The authentication partner returns the order line item to the
 * 						seller; refunds the buyer</td>
 * 					</tr>
 * 					<tr>
 * 						<td>NOT_AS_DESCRIBED</td>
 * 						<td>The order is not as described. The authentication partner returns the order line item to the seller;
 * 						refunds the buyer</td>
 * 					</tr>
 * 					<tr>
 * 						<td>NOT_AUTHENTIC_NO_RETURN</td>
 * 						<td>This enumeration value indicates that the order line item was found as counterfeit and cannot be
 * 						returned to the seller because of legal constraints; refunds the buyer</td>
 * 					</tr>
 * 				</tbody>
 * 			</table>
 * 			
 * 
 * <p>Java class for AuthenticityVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticityVerificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutcomeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCost" type="{urn:ebay:apis:eBLBaseComponents}ServiceCostType" minOccurs="0"/>
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
@XmlType(name = "AuthenticityVerificationType", propOrder = {
    "status",
    "outcomeReason",
    "serviceCost",
    "any"
})
public class AuthenticityVerificationType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "OutcomeReason")
    protected String outcomeReason;
    @XmlElement(name = "ServiceCost")
    protected ServiceCostType serviceCost;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the outcomeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeReason() {
        return outcomeReason;
    }

    /**
     * Sets the value of the outcomeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeReason(String value) {
        this.outcomeReason = value;
    }

    /**
     * Gets the value of the serviceCost property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCostType }
     *     
     */
    public ServiceCostType getServiceCost() {
        return serviceCost;
    }

    /**
     * Sets the value of the serviceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCostType }
     *     
     */
    public void setServiceCost(ServiceCostType value) {
        this.serviceCost = value;
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
