
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
 * 			Container for Top-Rated Seller program information.
 * 		
 * 
 * <p>Java class for TopRatedSellerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopRatedSellerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopRatedProgram" type="{urn:ebay:apis:eBLBaseComponents}TopRatedProgramCodeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TopRatedSellerDetailsType", propOrder = {
    "topRatedProgram",
    "any"
})
public class TopRatedSellerDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TopRatedProgram")
    protected List<TopRatedProgramCodeType> topRatedProgram;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link TopRatedProgramCodeType }
     *     
     */
    public TopRatedProgramCodeType[] getTopRatedProgram() {
        if (this.topRatedProgram == null) {
            return new TopRatedProgramCodeType[ 0 ] ;
        }
        return ((TopRatedProgramCodeType[]) this.topRatedProgram.toArray(new TopRatedProgramCodeType[this.topRatedProgram.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link TopRatedProgramCodeType }
     *     
     */
    public TopRatedProgramCodeType getTopRatedProgram(int idx) {
        if (this.topRatedProgram == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.topRatedProgram.get(idx);
    }

    public int getTopRatedProgramLength() {
        if (this.topRatedProgram == null) {
            return  0;
        }
        return this.topRatedProgram.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link TopRatedProgramCodeType }
     *     
     */
    public void setTopRatedProgram(TopRatedProgramCodeType[] values) {
        this._getTopRatedProgram().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.topRatedProgram.add(values[i]);
        }
    }

    protected List<TopRatedProgramCodeType> _getTopRatedProgram() {
        if (topRatedProgram == null) {
            topRatedProgram = new ArrayList<TopRatedProgramCodeType>();
        }
        return topRatedProgram;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link TopRatedProgramCodeType }
     *     
     */
    public TopRatedProgramCodeType setTopRatedProgram(int idx, TopRatedProgramCodeType value) {
        return this.topRatedProgram.set(idx, value);
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
