
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
 * 				Defines the maximum limit on compatible applications as part of the parts
 * 				compatibility feature. If the field is present, the corresponding feature applies
 * 				to the site. The field is returned as an empty element (e.g., a boolean value is
 * 				not returned).
 * 				<br><br>
 * 				Parts compatibility listings contain information to determine the assemblies with
 * 				which a part is compatible. For example, an automotive part or accessory listed
 * 				witih parts compatibility can be matched with vehicles (e.g., specific years,
 * 				makes, and models) with which the part or accessory can  be used.
 * 				<br><br>
 * 				There are two ways to enter parts compatibility: by application and by
 * 				specification. 
 * 				<ul>
 * 				<li> Entering parts compatibility by application specifies the assemblies
 * 				(e.g., a specific year, make, and model of car) to which the item applies. This can
 * 				be done automatically by listing with a catalog product that supports parts
 * 				compatibility, or manually, using <b
 * 				class="con">Item.ItemCompatibilityList</b> when listing or revising an
 * 				item. </li>
 * 				<li>Entering parts compatibility by specification involves specifying the
 * 				part's relevant dimensions and characteristics necessary to determine the
 * 				assemblies with which the part is compatible (e.g., Section Width, Aspect Ratio,
 * 				Rim Diammeter, Load Index, and Speed Rating values for a tire) using
 * 				attributes.</li>
 * 				</ul>
 * 			
 * 
 * <p>Java class for MaxItemCompatibilityDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaxItemCompatibilityDefinitionType">
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
@XmlType(name = "MaxItemCompatibilityDefinitionType", propOrder = {
    "any"
})
public class MaxItemCompatibilityDefinitionType
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
