
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 *  
 *  				Type defining the <b>CrossBorderTradeNorthAmericaEnabled</b> field that is 
 * 				returned under the <b>FeatureDefinitions</b> container of the 
 * 				<b>GetCategoryFeatures</b> response (as long as 
 * 				'CrossBorderTradeEnabled' is included as a <b>FeatureID</b> value in 
 * 				the call request or no <b>FeatureID</b> values are passed into the call 
 * 				request). This field is returned as an
 * 				empty element (a boolean value is not returned) if one or more eBay API-enabled sites 
 * 				support Cross Border Trade listings on the eBay US and eBay Canada sites. 
 * 				<br/><br/>
 * 				To verify if a specific eBay site supports Cross Border Trade listings on the eBay US and eBay Canada sites (for most
 * 				categories), look for a 'true' value in the 
 * 				<b>SiteDefaults.CrossBorderTradeNorthAmericaEnabled</b> field.
 * 				<br/><br/>
 * 				To verify if a specific category on a specific eBay site supports Cross Border Trade listings on the eBay US and eBay Canada sites, pass in a <b>CategoryID</b> value in the request, and then 
 * 				look for a 'true' value in the <b>CrossBorderTradeNorthAmericaEnabled</b> field 
 * 				of the corresponding Category node (match up the <b>CategoryID</b> values 
 * 				if more than one Category IDs were passed in the request).
 * 			
 * 
 * <p>Java class for CrossBorderTradeNorthAmericaEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossBorderTradeNorthAmericaEnabledDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "CrossBorderTradeNorthAmericaEnabledDefinitionType", propOrder = {
    "any"
})
public class CrossBorderTradeNorthAmericaEnabledDefinitionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
