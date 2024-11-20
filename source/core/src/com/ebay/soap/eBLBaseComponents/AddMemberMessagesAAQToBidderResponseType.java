
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
 * 				Type defining the <b>AddMemberMessagesAAQToBidderResponseContainer</b> container, which consists of the <b>Ack</b> field (indicating the result of the send message operation) and the <b>CorrelationID</b> field (used to track multiple send message operations performed in one call).
 * 			
 * 
 * <p>Java class for AddMemberMessagesAAQToBidderResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMemberMessagesAAQToBidderResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AddMemberMessagesAAQToBidderResponseContainer" type="{urn:ebay:apis:eBLBaseComponents}AddMemberMessagesAAQToBidderResponseContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMemberMessagesAAQToBidderResponseType", propOrder = {
    "addMemberMessagesAAQToBidderResponseContainer"
})
public class AddMemberMessagesAAQToBidderResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AddMemberMessagesAAQToBidderResponseContainer")
    protected List<AddMemberMessagesAAQToBidderResponseContainerType> addMemberMessagesAAQToBidderResponseContainer;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AddMemberMessagesAAQToBidderResponseContainerType }
     *     
     */
    public AddMemberMessagesAAQToBidderResponseContainerType[] getAddMemberMessagesAAQToBidderResponseContainer() {
        if (this.addMemberMessagesAAQToBidderResponseContainer == null) {
            return new AddMemberMessagesAAQToBidderResponseContainerType[ 0 ] ;
        }
        return ((AddMemberMessagesAAQToBidderResponseContainerType[]) this.addMemberMessagesAAQToBidderResponseContainer.toArray(new AddMemberMessagesAAQToBidderResponseContainerType[this.addMemberMessagesAAQToBidderResponseContainer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AddMemberMessagesAAQToBidderResponseContainerType }
     *     
     */
    public AddMemberMessagesAAQToBidderResponseContainerType getAddMemberMessagesAAQToBidderResponseContainer(int idx) {
        if (this.addMemberMessagesAAQToBidderResponseContainer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.addMemberMessagesAAQToBidderResponseContainer.get(idx);
    }

    public int getAddMemberMessagesAAQToBidderResponseContainerLength() {
        if (this.addMemberMessagesAAQToBidderResponseContainer == null) {
            return  0;
        }
        return this.addMemberMessagesAAQToBidderResponseContainer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AddMemberMessagesAAQToBidderResponseContainerType }
     *     
     */
    public void setAddMemberMessagesAAQToBidderResponseContainer(AddMemberMessagesAAQToBidderResponseContainerType[] values) {
        this._getAddMemberMessagesAAQToBidderResponseContainer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.addMemberMessagesAAQToBidderResponseContainer.add(values[i]);
        }
    }

    protected List<AddMemberMessagesAAQToBidderResponseContainerType> _getAddMemberMessagesAAQToBidderResponseContainer() {
        if (addMemberMessagesAAQToBidderResponseContainer == null) {
            addMemberMessagesAAQToBidderResponseContainer = new ArrayList<AddMemberMessagesAAQToBidderResponseContainerType>();
        }
        return addMemberMessagesAAQToBidderResponseContainer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AddMemberMessagesAAQToBidderResponseContainerType }
     *     
     */
    public AddMemberMessagesAAQToBidderResponseContainerType setAddMemberMessagesAAQToBidderResponseContainer(int idx, AddMemberMessagesAAQToBidderResponseContainerType value) {
        return this.addMemberMessagesAAQToBidderResponseContainer.set(idx, value);
    }

}
