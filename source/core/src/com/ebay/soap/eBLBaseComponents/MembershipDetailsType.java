
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
 * 			Type used by the <b>Membership</b> container that is returned in the response of the <b>GetUser</b> call if the seller is enrolled in one or more eBay membership programs such as eBay Plus.
 * 			<br/><br/>
 * 			<span class="tablenote"><b>Note:</b> Currently, eBay Plus is available only to buyers on Germany and Australia marketplaces.
 * 			</span>
 * 		
 * 
 * <p>Java class for MembershipDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Program" type="{urn:ebay:apis:eBLBaseComponents}MembershipDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipDetailsType", propOrder = {
    "program"
})
public class MembershipDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Program")
    protected List<MembershipDetailType> program;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MembershipDetailType }
     *     
     */
    public MembershipDetailType[] getProgram() {
        if (this.program == null) {
            return new MembershipDetailType[ 0 ] ;
        }
        return ((MembershipDetailType[]) this.program.toArray(new MembershipDetailType[this.program.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MembershipDetailType }
     *     
     */
    public MembershipDetailType getProgram(int idx) {
        if (this.program == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.program.get(idx);
    }

    public int getProgramLength() {
        if (this.program == null) {
            return  0;
        }
        return this.program.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MembershipDetailType }
     *     
     */
    public void setProgram(MembershipDetailType[] values) {
        this._getProgram().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.program.add(values[i]);
        }
    }

    protected List<MembershipDetailType> _getProgram() {
        if (program == null) {
            program = new ArrayList<MembershipDetailType>();
        }
        return program;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipDetailType }
     *     
     */
    public MembershipDetailType setProgram(int idx, MembershipDetailType value) {
        return this.program.set(idx, value);
    }

}
