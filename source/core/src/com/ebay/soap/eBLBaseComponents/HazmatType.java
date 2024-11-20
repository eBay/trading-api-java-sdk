
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
 * 				Type defining the <b>Pictograms</b> and <b>Statements</b> containers, and the <b>Component</b> and <b>SignalWord</b> fields, that provide hazardous material related information. For additional information, see <a href="https://developer.ebay.com/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Signal" target="_blank">Signal word information</a>. 
 * 			
 * 
 * <p>Java class for HazmatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazmatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pictograms" type="{urn:ebay:apis:eBLBaseComponents}PictogramsType" minOccurs="0"/>
 *         &lt;element name="SignalWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Statements" type="{urn:ebay:apis:eBLBaseComponents}StatementsType" minOccurs="0"/>
 *         &lt;element name="Component" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "HazmatType", propOrder = {
    "pictograms",
    "signalWord",
    "statements",
    "component",
    "any"
})
public class HazmatType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Pictograms")
    protected PictogramsType pictograms;
    @XmlElement(name = "SignalWord")
    protected String signalWord;
    @XmlElement(name = "Statements")
    protected StatementsType statements;
    @XmlElement(name = "Component")
    protected String component;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pictograms property.
     * 
     * @return
     *     possible object is
     *     {@link PictogramsType }
     *     
     */
    public PictogramsType getPictograms() {
        return pictograms;
    }

    /**
     * Sets the value of the pictograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictogramsType }
     *     
     */
    public void setPictograms(PictogramsType value) {
        this.pictograms = value;
    }

    /**
     * Gets the value of the signalWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalWord() {
        return signalWord;
    }

    /**
     * Sets the value of the signalWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalWord(String value) {
        this.signalWord = value;
    }

    /**
     * Gets the value of the statements property.
     * 
     * @return
     *     possible object is
     *     {@link StatementsType }
     *     
     */
    public StatementsType getStatements() {
        return statements;
    }

    /**
     * Sets the value of the statements property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementsType }
     *     
     */
    public void setStatements(StatementsType value) {
        this.statements = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
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
