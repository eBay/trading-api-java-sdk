
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for RefundLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundLineType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:ebay:apis:eBLBaseComponents>AmountType">
 *       &lt;attribute name="type" type="{urn:ebay:apis:eBLBaseComponents}RefundLineTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundLineType")
public class RefundLineType
    extends AmountType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlAttribute
    protected RefundLineTypeCodeType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RefundLineTypeCodeType }
     *     
     */
    public RefundLineTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundLineTypeCodeType }
     *     
     */
    public void setType(RefundLineTypeCodeType value) {
        this.type = value;
    }

}
