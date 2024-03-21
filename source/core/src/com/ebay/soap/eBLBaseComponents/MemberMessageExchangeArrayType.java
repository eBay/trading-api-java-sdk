
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
 * 				Type is used by the <b>MemberMessage</b> container that is returned in the <b>GetMemberMessages</b> and <b>GetAdFormatLeads</b> calls. The <b>MemberMessage</b> container will consists of one or more member messages that meet the input criteria in the call request.
 * 			
 * 
 * <p>Java class for MemberMessageExchangeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberMessageExchangeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberMessageExchange" type="{urn:ebay:apis:eBLBaseComponents}MemberMessageExchangeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberMessageExchangeArrayType", propOrder = {
    "memberMessageExchange"
})
public class MemberMessageExchangeArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MemberMessageExchange")
    protected List<MemberMessageExchangeType> memberMessageExchange;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MemberMessageExchangeType }
     *     
     */
    public MemberMessageExchangeType[] getMemberMessageExchange() {
        if (this.memberMessageExchange == null) {
            return new MemberMessageExchangeType[ 0 ] ;
        }
        return ((MemberMessageExchangeType[]) this.memberMessageExchange.toArray(new MemberMessageExchangeType[this.memberMessageExchange.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MemberMessageExchangeType }
     *     
     */
    public MemberMessageExchangeType getMemberMessageExchange(int idx) {
        if (this.memberMessageExchange == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.memberMessageExchange.get(idx);
    }

    public int getMemberMessageExchangeLength() {
        if (this.memberMessageExchange == null) {
            return  0;
        }
        return this.memberMessageExchange.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MemberMessageExchangeType }
     *     
     */
    public void setMemberMessageExchange(MemberMessageExchangeType[] values) {
        this._getMemberMessageExchange().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.memberMessageExchange.add(values[i]);
        }
    }

    protected List<MemberMessageExchangeType> _getMemberMessageExchange() {
        if (memberMessageExchange == null) {
            memberMessageExchange = new ArrayList<MemberMessageExchangeType>();
        }
        return memberMessageExchange;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MemberMessageExchangeType }
     *     
     */
    public MemberMessageExchangeType setMemberMessageExchange(int idx, MemberMessageExchangeType value) {
        return this.memberMessageExchange.set(idx, value);
    }

}
