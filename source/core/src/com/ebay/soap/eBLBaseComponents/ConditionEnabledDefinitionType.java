
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
 * 				Type defining the <b>ConditionEnabled</b> field that is 
 * 				returned under the <b>FeatureDefinitions</b> container of the 
 * 				<b>GetCategoryFeatures</b> response (as long as 
 * 				'ConditionEnabled' is included as a <b>FeatureID</b> value in 
 * 				the call request or no <b>FeatureID</b> values are passed into the call 
 * 				request). This field is returned as an
 * 				empty element (a boolean value is not returned) if one or more eBay API-enabled sites 
 * 				support the use of Condition IDs to express the condition of an item. 
 * 				<br/><br/>
 * 				To verify if a specific eBay site supports Condition IDs (for most
 * 				categories), look for a 'Enabled' value in the 
 * 				<b>SiteDefaults.ConditionEnabled</b> field.
 * 				<br/><br/>
 * 				To verify if a specific category on a specific eBay site supports Condition IDs, pass in a <b>CategoryID</b> value in the request, and then 
 * 				look for an 'Enabled' or 'Required' value in the <b>ConditionEnabled</b> field 
 * 				of the corresponding Category node (match up the <b>CategoryID</b> values 
 * 				if more than one Category IDs were passed in the request).
 * 			
 * 
 * <p>Java class for ConditionEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionEnabledDefinitionType">
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
@XmlType(name = "ConditionEnabledDefinitionType", propOrder = {
    "any"
})
public class ConditionEnabledDefinitionType
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
