
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a packet ID and status for the items reported by the VeRO Program member.
 * 			
 * 
 * <p>Java class for VeROReportItemsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportItemsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="VeROReportPacketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VeROReportPacketStatus" type="{urn:ebay:apis:eBLBaseComponents}VeROReportPacketStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReportItemsResponseType", propOrder = {
    "veROReportPacketID",
    "veROReportPacketStatus"
})
public class VeROReportItemsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VeROReportPacketID")
    protected Long veROReportPacketID;
    @XmlElement(name = "VeROReportPacketStatus")
    protected VeROReportPacketStatusCodeType veROReportPacketStatus;

    /**
     * Gets the value of the veROReportPacketID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVeROReportPacketID() {
        return veROReportPacketID;
    }

    /**
     * Sets the value of the veROReportPacketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVeROReportPacketID(Long value) {
        this.veROReportPacketID = value;
    }

    /**
     * Gets the value of the veROReportPacketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VeROReportPacketStatusCodeType }
     *     
     */
    public VeROReportPacketStatusCodeType getVeROReportPacketStatus() {
        return veROReportPacketStatus;
    }

    /**
     * Sets the value of the veROReportPacketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeROReportPacketStatusCodeType }
     *     
     */
    public void setVeROReportPacketStatus(VeROReportPacketStatusCodeType value) {
        this.veROReportPacketStatus = value;
    }

}
