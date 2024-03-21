
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
 * 				List of objects representing markup or markdown events for a given application
 * 				and time period. If no time period is specified in the request, the information
 * 				for only one day (24 hours before the time the call is made to the time the call
 * 				is made) is included. The maximum time period is allowed is 3 days (72 hours
 * 				before the call is made to the time the call is made).
 * 			
 * 
 * <p>Java class for MarkUpMarkDownHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkUpMarkDownHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkUpMarkDownEvent" type="{urn:ebay:apis:eBLBaseComponents}MarkUpMarkDownEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkUpMarkDownHistoryType", propOrder = {
    "markUpMarkDownEvent"
})
public class MarkUpMarkDownHistoryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MarkUpMarkDownEvent")
    protected List<MarkUpMarkDownEventType> markUpMarkDownEvent;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MarkUpMarkDownEventType }
     *     
     */
    public MarkUpMarkDownEventType[] getMarkUpMarkDownEvent() {
        if (this.markUpMarkDownEvent == null) {
            return new MarkUpMarkDownEventType[ 0 ] ;
        }
        return ((MarkUpMarkDownEventType[]) this.markUpMarkDownEvent.toArray(new MarkUpMarkDownEventType[this.markUpMarkDownEvent.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MarkUpMarkDownEventType }
     *     
     */
    public MarkUpMarkDownEventType getMarkUpMarkDownEvent(int idx) {
        if (this.markUpMarkDownEvent == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.markUpMarkDownEvent.get(idx);
    }

    public int getMarkUpMarkDownEventLength() {
        if (this.markUpMarkDownEvent == null) {
            return  0;
        }
        return this.markUpMarkDownEvent.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MarkUpMarkDownEventType }
     *     
     */
    public void setMarkUpMarkDownEvent(MarkUpMarkDownEventType[] values) {
        this._getMarkUpMarkDownEvent().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.markUpMarkDownEvent.add(values[i]);
        }
    }

    protected List<MarkUpMarkDownEventType> _getMarkUpMarkDownEvent() {
        if (markUpMarkDownEvent == null) {
            markUpMarkDownEvent = new ArrayList<MarkUpMarkDownEventType>();
        }
        return markUpMarkDownEvent;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MarkUpMarkDownEventType }
     *     
     */
    public MarkUpMarkDownEventType setMarkUpMarkDownEvent(int idx, MarkUpMarkDownEventType value) {
        return this.markUpMarkDownEvent.set(idx, value);
    }

}
