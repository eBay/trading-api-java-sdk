
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response of a <b>GetStoreCategoryUpdateStatus</b> call. The response includes the status of an eBay Store Category hierarchy change that was made with a <b>SetStoreCategories</b> call.
 * 			
 * 
 * <p>Java class for GetStoreCategoryUpdateStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStoreCategoryUpdateStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}TaskStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreCategoryUpdateStatusResponseType", propOrder = {
    "status"
})
public class GetStoreCategoryUpdateStatusResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Status")
    protected TaskStatusCodeType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TaskStatusCodeType }
     *     
     */
    public TaskStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskStatusCodeType }
     *     
     */
    public void setStatus(TaskStatusCodeType value) {
        this.status = value;
    }

}
