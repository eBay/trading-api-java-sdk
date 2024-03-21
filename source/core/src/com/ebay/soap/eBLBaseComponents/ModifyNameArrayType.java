
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
 * 				This type is used by the <b>ModifyNameList</b> container in a <b>ReviseFixedPriceItem</b> or <b>RelistFixedPriceItem</b> call to rename one or more Variation Specific names for a multiple-variation listing.
 * 			
 * 
 * <p>Java class for ModifyNameArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyNameArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyName" type="{urn:ebay:apis:eBLBaseComponents}ModifyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyNameArrayType", propOrder = {
    "modifyName"
})
public class ModifyNameArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ModifyName")
    protected List<ModifyNameType> modifyName;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ModifyNameType }
     *     
     */
    public ModifyNameType[] getModifyName() {
        if (this.modifyName == null) {
            return new ModifyNameType[ 0 ] ;
        }
        return ((ModifyNameType[]) this.modifyName.toArray(new ModifyNameType[this.modifyName.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ModifyNameType }
     *     
     */
    public ModifyNameType getModifyName(int idx) {
        if (this.modifyName == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.modifyName.get(idx);
    }

    public int getModifyNameLength() {
        if (this.modifyName == null) {
            return  0;
        }
        return this.modifyName.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ModifyNameType }
     *     
     */
    public void setModifyName(ModifyNameType[] values) {
        this._getModifyName().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.modifyName.add(values[i]);
        }
    }

    protected List<ModifyNameType> _getModifyName() {
        if (modifyName == null) {
            modifyName = new ArrayList<ModifyNameType>();
        }
        return modifyName;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyNameType }
     *     
     */
    public ModifyNameType setModifyName(int idx, ModifyNameType value) {
        return this.modifyName.set(idx, value);
    }

}
