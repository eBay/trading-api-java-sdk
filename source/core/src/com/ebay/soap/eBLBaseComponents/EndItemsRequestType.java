
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The <b>EndItems</b> call is used to end up to 10 specified eBay listings before the date and time at which those listings would normally end per the listing duration.
 * 			
 * 
 * <p>Java class for EndItemsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndItemsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="EndItemRequestContainer" type="{urn:ebay:apis:eBLBaseComponents}EndItemRequestContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndItemsRequestType", propOrder = {
    "endItemRequestContainer"
})
public class EndItemsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EndItemRequestContainer")
    protected List<EndItemRequestContainerType> endItemRequestContainer;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link EndItemRequestContainerType }
     *     
     */
    public EndItemRequestContainerType[] getEndItemRequestContainer() {
        if (this.endItemRequestContainer == null) {
            return new EndItemRequestContainerType[ 0 ] ;
        }
        return ((EndItemRequestContainerType[]) this.endItemRequestContainer.toArray(new EndItemRequestContainerType[this.endItemRequestContainer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link EndItemRequestContainerType }
     *     
     */
    public EndItemRequestContainerType getEndItemRequestContainer(int idx) {
        if (this.endItemRequestContainer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.endItemRequestContainer.get(idx);
    }

    public int getEndItemRequestContainerLength() {
        if (this.endItemRequestContainer == null) {
            return  0;
        }
        return this.endItemRequestContainer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link EndItemRequestContainerType }
     *     
     */
    public void setEndItemRequestContainer(EndItemRequestContainerType[] values) {
        this._getEndItemRequestContainer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.endItemRequestContainer.add(values[i]);
        }
    }

    protected List<EndItemRequestContainerType> _getEndItemRequestContainer() {
        if (endItemRequestContainer == null) {
            endItemRequestContainer = new ArrayList<EndItemRequestContainerType>();
        }
        return endItemRequestContainer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link EndItemRequestContainerType }
     *     
     */
    public EndItemRequestContainerType setEndItemRequestContainer(int idx, EndItemRequestContainerType value) {
        return this.endItemRequestContainer.set(idx, value);
    }

}
