
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
 * 				Data for one theme group. Returned for <b>GetDescriptionTemplates</b>
 * 				if theme groups are requested.
 * 			
 * 
 * <p>Java class for ThemeGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThemeGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThemeID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThemeTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ThemeGroupType", propOrder = {
    "groupID",
    "groupName",
    "themeID",
    "themeTotal",
    "any"
})
public class ThemeGroupType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "GroupID")
    protected Integer groupID;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "ThemeID", type = Integer.class)
    protected List<Integer> themeID;
    @XmlElement(name = "ThemeTotal")
    protected Integer themeTotal;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupID(Integer value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Integer }
     *     
     */
    public int[] getThemeID() {
        if (this.themeID == null) {
            return new int[ 0 ] ;
        }
        int[] r = new int[this.themeID.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.themeID.get(__i).intValue();
        }
        return r;
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Integer }
     *     
     */
    public int getThemeID(int idx) {
        if (this.themeID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.themeID.get(idx).intValue();
    }

    public int getThemeIDLength() {
        if (this.themeID == null) {
            return  0;
        }
        return this.themeID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Integer }
     *     
     */
    public void setThemeID(int[] values) {
        this._getThemeID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.themeID.add(new Integer(values[i]));
        }
    }

    protected List<Integer> _getThemeID() {
        if (themeID == null) {
            themeID = new ArrayList<Integer>();
        }
        return themeID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public int setThemeID(int idx, int value) {
        return this.themeID.set(idx, new Integer(value)).intValue();
    }

    /**
     * Gets the value of the themeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThemeTotal() {
        return themeTotal;
    }

    /**
     * Sets the value of the themeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThemeTotal(Integer value) {
        this.themeTotal = value;
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
