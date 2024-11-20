
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
 * 					This is the base response type for the <b>GetDescriptionTemplates</b> call. This call retrieves the Listing Designer templates that are available for use by the seller. The user has the option of retrieving all available Listing Designer templates for all categories, for all motor vehicle categories, or for a specific eBay category.
 * 					<br>
 * 					<br>
 * 				  <span class="tablenote"><b>Note:</b> As of May 31, 2020, sellers are no longer able to use Listing Designer templates when they create or revise listings. Existing listings that are already using a Listing Designer template will remain unchanged. The <b>GetDescriptionTemplates</b> call will eventually get deprecated and decommissioned, and more information will be provided on timing at a later date. The <b>GetDescriptionTemplates</b> call will still retrieve Listing Designer template data, but none of retrieved templates will be usable to create or revise a listing.</span>
 * 				
 * 
 * <p>Java class for GetDescriptionTemplatesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDescriptionTemplatesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="DescriptionTemplate" type="{urn:ebay:apis:eBLBaseComponents}DescriptionTemplateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LayoutTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ObsoleteLayoutID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ObsoleteThemeID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThemeGroup" type="{urn:ebay:apis:eBLBaseComponents}ThemeGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThemeTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDescriptionTemplatesResponseType", propOrder = {
    "descriptionTemplate",
    "layoutTotal",
    "obsoleteLayoutID",
    "obsoleteThemeID",
    "themeGroup",
    "themeTotal"
})
public class GetDescriptionTemplatesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DescriptionTemplate")
    protected List<DescriptionTemplateType> descriptionTemplate;
    @XmlElement(name = "LayoutTotal")
    protected Integer layoutTotal;
    @XmlElement(name = "ObsoleteLayoutID", type = Integer.class)
    protected List<Integer> obsoleteLayoutID;
    @XmlElement(name = "ObsoleteThemeID", type = Integer.class)
    protected List<Integer> obsoleteThemeID;
    @XmlElement(name = "ThemeGroup")
    protected List<ThemeGroupType> themeGroup;
    @XmlElement(name = "ThemeTotal")
    protected Integer themeTotal;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DescriptionTemplateType }
     *     
     */
    public DescriptionTemplateType[] getDescriptionTemplate() {
        if (this.descriptionTemplate == null) {
            return new DescriptionTemplateType[ 0 ] ;
        }
        return ((DescriptionTemplateType[]) this.descriptionTemplate.toArray(new DescriptionTemplateType[this.descriptionTemplate.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DescriptionTemplateType }
     *     
     */
    public DescriptionTemplateType getDescriptionTemplate(int idx) {
        if (this.descriptionTemplate == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.descriptionTemplate.get(idx);
    }

    public int getDescriptionTemplateLength() {
        if (this.descriptionTemplate == null) {
            return  0;
        }
        return this.descriptionTemplate.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DescriptionTemplateType }
     *     
     */
    public void setDescriptionTemplate(DescriptionTemplateType[] values) {
        this._getDescriptionTemplate().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.descriptionTemplate.add(values[i]);
        }
    }

    protected List<DescriptionTemplateType> _getDescriptionTemplate() {
        if (descriptionTemplate == null) {
            descriptionTemplate = new ArrayList<DescriptionTemplateType>();
        }
        return descriptionTemplate;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionTemplateType }
     *     
     */
    public DescriptionTemplateType setDescriptionTemplate(int idx, DescriptionTemplateType value) {
        return this.descriptionTemplate.set(idx, value);
    }

    /**
     * Gets the value of the layoutTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayoutTotal() {
        return layoutTotal;
    }

    /**
     * Sets the value of the layoutTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayoutTotal(Integer value) {
        this.layoutTotal = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Integer }
     *     
     */
    public int[] getObsoleteLayoutID() {
        if (this.obsoleteLayoutID == null) {
            return new int[ 0 ] ;
        }
        int[] r = new int[this.obsoleteLayoutID.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.obsoleteLayoutID.get(__i).intValue();
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
    public int getObsoleteLayoutID(int idx) {
        if (this.obsoleteLayoutID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.obsoleteLayoutID.get(idx).intValue();
    }

    public int getObsoleteLayoutIDLength() {
        if (this.obsoleteLayoutID == null) {
            return  0;
        }
        return this.obsoleteLayoutID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Integer }
     *     
     */
    public void setObsoleteLayoutID(int[] values) {
        this._getObsoleteLayoutID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.obsoleteLayoutID.add(new Integer(values[i]));
        }
    }

    protected List<Integer> _getObsoleteLayoutID() {
        if (obsoleteLayoutID == null) {
            obsoleteLayoutID = new ArrayList<Integer>();
        }
        return obsoleteLayoutID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public int setObsoleteLayoutID(int idx, int value) {
        return this.obsoleteLayoutID.set(idx, new Integer(value)).intValue();
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Integer }
     *     
     */
    public int[] getObsoleteThemeID() {
        if (this.obsoleteThemeID == null) {
            return new int[ 0 ] ;
        }
        int[] r = new int[this.obsoleteThemeID.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.obsoleteThemeID.get(__i).intValue();
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
    public int getObsoleteThemeID(int idx) {
        if (this.obsoleteThemeID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.obsoleteThemeID.get(idx).intValue();
    }

    public int getObsoleteThemeIDLength() {
        if (this.obsoleteThemeID == null) {
            return  0;
        }
        return this.obsoleteThemeID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Integer }
     *     
     */
    public void setObsoleteThemeID(int[] values) {
        this._getObsoleteThemeID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.obsoleteThemeID.add(new Integer(values[i]));
        }
    }

    protected List<Integer> _getObsoleteThemeID() {
        if (obsoleteThemeID == null) {
            obsoleteThemeID = new ArrayList<Integer>();
        }
        return obsoleteThemeID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public int setObsoleteThemeID(int idx, int value) {
        return this.obsoleteThemeID.set(idx, new Integer(value)).intValue();
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ThemeGroupType }
     *     
     */
    public ThemeGroupType[] getThemeGroup() {
        if (this.themeGroup == null) {
            return new ThemeGroupType[ 0 ] ;
        }
        return ((ThemeGroupType[]) this.themeGroup.toArray(new ThemeGroupType[this.themeGroup.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ThemeGroupType }
     *     
     */
    public ThemeGroupType getThemeGroup(int idx) {
        if (this.themeGroup == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.themeGroup.get(idx);
    }

    public int getThemeGroupLength() {
        if (this.themeGroup == null) {
            return  0;
        }
        return this.themeGroup.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ThemeGroupType }
     *     
     */
    public void setThemeGroup(ThemeGroupType[] values) {
        this._getThemeGroup().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.themeGroup.add(values[i]);
        }
    }

    protected List<ThemeGroupType> _getThemeGroup() {
        if (themeGroup == null) {
            themeGroup = new ArrayList<ThemeGroupType>();
        }
        return themeGroup;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ThemeGroupType }
     *     
     */
    public ThemeGroupType setThemeGroup(int idx, ThemeGroupType value) {
        return this.themeGroup.set(idx, value);
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

}
