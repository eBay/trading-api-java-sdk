
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Validates the user response to a <b class="con">GetChallengeToken</b>
 * 				botblock challenge.
 * 			
 * 
 * <p>Java class for ValidateChallengeInputRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateChallengeInputRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ChallengeToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeepTokenValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateChallengeInputRequestType", propOrder = {
    "challengeToken",
    "userInput",
    "keepTokenValid"
})
public class ValidateChallengeInputRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ChallengeToken")
    protected String challengeToken;
    @XmlElement(name = "UserInput")
    protected String userInput;
    @XmlElement(name = "KeepTokenValid")
    protected Boolean keepTokenValid;

    /**
     * Gets the value of the challengeToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeToken() {
        return challengeToken;
    }

    /**
     * Sets the value of the challengeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeToken(String value) {
        this.challengeToken = value;
    }

    /**
     * Gets the value of the userInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInput() {
        return userInput;
    }

    /**
     * Sets the value of the userInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInput(String value) {
        this.userInput = value;
    }

    /**
     * Gets the value of the keepTokenValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepTokenValid() {
        return keepTokenValid;
    }

    /**
     * Sets the value of the keepTokenValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepTokenValid(Boolean value) {
        this.keepTokenValid = value;
    }

}
