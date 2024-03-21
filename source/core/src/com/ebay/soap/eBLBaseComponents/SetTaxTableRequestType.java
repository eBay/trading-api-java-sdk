
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This call allows you to add or modify sales tax rates for one or more tax jurisdictions within the specified site. Any additions or modifications made with this call is saved in the seller's Sales Tax Table in My eBay.
 * 				<br/><br/>
 * 				Sales Tax Tables are only supported on the US and Canada (English and French versions) sites, so this call is only applicable to those sites. To view their current Sales Tax Table, a seller may go to the Sales Tax Table in My eBay, or they can make a <b>GetTaxTable</b> call.
 * 			
 * 
 * <p>Java class for SetTaxTableRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTaxTableRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="TaxTable" type="{urn:ebay:apis:eBLBaseComponents}TaxTableType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTaxTableRequestType", propOrder = {
    "taxTable"
})
public class SetTaxTableRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TaxTable")
    protected TaxTableType taxTable;

    /**
     * Gets the value of the taxTable property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTableType }
     *     
     */
    public TaxTableType getTaxTable() {
        return taxTable;
    }

    /**
     * Sets the value of the taxTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTableType }
     *     
     */
    public void setTaxTable(TaxTableType value) {
        this.taxTable = value;
    }

}
