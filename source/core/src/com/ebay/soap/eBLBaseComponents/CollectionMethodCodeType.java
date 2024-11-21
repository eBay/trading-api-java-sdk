
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="NET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CollectionMethodCodeType")
@XmlEnum
public enum CollectionMethodCodeType {


    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> This value is for future use.
     * 						</span>
     * 					
     * 
     */
    INVOICE,

    /**
     * 
     * 						This value is always returned, but because the <b>CollectionMethod</b> field and <b>CollectionMethodCodeType</b> are not currently applicable, this value does not have any purpose at this time.
     * 					
     * 
     */
    NET;

    public String value() {
        return name();
    }

    public static CollectionMethodCodeType fromValue(String v) {
        return valueOf(v);
    }

}
