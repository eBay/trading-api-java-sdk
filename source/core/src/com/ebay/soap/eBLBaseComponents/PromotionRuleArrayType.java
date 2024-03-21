
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for PromotionRuleArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionRuleArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionRule" type="{urn:ebay:apis:eBLBaseComponents}PromotionRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionRuleArrayType", propOrder = {
    "promotionRule"
})
public class PromotionRuleArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PromotionRule")
    protected List<PromotionRuleType> promotionRule;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PromotionRuleType }
     *     
     */
    public PromotionRuleType[] getPromotionRule() {
        if (this.promotionRule == null) {
            return new PromotionRuleType[ 0 ] ;
        }
        return ((PromotionRuleType[]) this.promotionRule.toArray(new PromotionRuleType[this.promotionRule.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PromotionRuleType }
     *     
     */
    public PromotionRuleType getPromotionRule(int idx) {
        if (this.promotionRule == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.promotionRule.get(idx);
    }

    public int getPromotionRuleLength() {
        if (this.promotionRule == null) {
            return  0;
        }
        return this.promotionRule.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PromotionRuleType }
     *     
     */
    public void setPromotionRule(PromotionRuleType[] values) {
        this._getPromotionRule().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.promotionRule.add(values[i]);
        }
    }

    protected List<PromotionRuleType> _getPromotionRule() {
        if (promotionRule == null) {
            promotionRule = new ArrayList<PromotionRuleType>();
        }
        return promotionRule;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionRuleType }
     *     
     */
    public PromotionRuleType setPromotionRule(int idx, PromotionRuleType value) {
        return this.promotionRule.set(idx, value);
    }

}
