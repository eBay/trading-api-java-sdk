
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountEntrySortTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountEntrySortTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AccountEntryCreatedTimeAscending"/>
 *     &lt;enumeration value="AccountEntryCreatedTimeDescending"/>
 *     &lt;enumeration value="AccountEntryItemNumberAscending"/>
 *     &lt;enumeration value="AccountEntryItemNumberDescending"/>
 *     &lt;enumeration value="AccountEntryFeeTypeAscending"/>
 *     &lt;enumeration value="AccountEntryFeeTypeDescending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AccountEntrySortTypeCodeType")
@XmlEnum
public enum AccountEntrySortTypeCodeType {


    /**
     * 
     * 					 This is the default value. With this value set, account entries in the <b>GetAccount</b> response are sorted by transaction date (see <b>AccountEntry.Date</b> field) in ascending order (oldest transaction to most recent transaction). This value will produce the same results as the  <b>AccountEntryCreatedTimeAscending</b> value.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 					 With this value set, account entries in the <b>GetAccount</b> response are sorted by transaction date (see <b>AccountEntry.Date</b> field) in ascending order (oldest transaction to most recent transaction). This value will produce the same results as the  <b>None</b> value.
     * 					
     * 
     */
    @XmlEnumValue("AccountEntryCreatedTimeAscending")
    ACCOUNT_ENTRY_CREATED_TIME_ASCENDING("AccountEntryCreatedTimeAscending"),

    /**
     * 
     * 						With this value set, account entries in the <b>GetAccount</b> response are sorted by transaction date (see <b>AccountEntry.Date</b> field) in descending order (most recent transaction to oldest transaction).
     * 					
     * 
     */
    @XmlEnumValue("AccountEntryCreatedTimeDescending")
    ACCOUNT_ENTRY_CREATED_TIME_DESCENDING("AccountEntryCreatedTimeDescending"),

    /**
     * 
     * 						With this value set, account entries in the <b>GetAccount</b> response are sorted by Item ID value (see <b>AccountEntry.ItemID</b> field) in ascending order (oldest eBay listing to most recent eBay listing).
     * 					
     * 
     */
    @XmlEnumValue("AccountEntryItemNumberAscending")
    ACCOUNT_ENTRY_ITEM_NUMBER_ASCENDING("AccountEntryItemNumberAscending"),

    /**
     * 
     * 						With this value set, account entries in the <b>GetAccount</b> response are sorted by Item ID value (see <b>AccountEntry.ItemID</b> field) in descending order (most recent eBay listing to oldest eBay listing).
     * 					
     * 
     */
    @XmlEnumValue("AccountEntryItemNumberDescending")
    ACCOUNT_ENTRY_ITEM_NUMBER_DESCENDING("AccountEntryItemNumberDescending"),

    /**
     * 
     * 						With this value set, account entries in the <b>GetAccount</b> response are sorted in alphabetical order according to each entry's <b>AccountEntry.Description</b> value. When account entries are sorted according to fee type, the secondary sort criterion is transaction date, and for account entries with identical fee types, the oldest account entries will appear first in the response.
     * 					
     * 
     */
    @XmlEnumValue("AccountEntryFeeTypeAscending")
    ACCOUNT_ENTRY_FEE_TYPE_ASCENDING("AccountEntryFeeTypeAscending"),

    /**
     * 
     * 					With this value set, account entries in the <b>GetAccount</b> response are sorted in reverse alphabetical order according to each entry's <b>AccountEntry.Description</b> value. When account entries are sorted according to fee type, the secondary sort criterion is transaction date, and for account entries with identical fee types, the oldest account entries will appear first in the response.
     * 					
     * 
     */
    @XmlEnumValue("AccountEntryFeeTypeDescending")
    ACCOUNT_ENTRY_FEE_TYPE_DESCENDING("AccountEntryFeeTypeDescending"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AccountEntrySortTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountEntrySortTypeCodeType fromValue(String v) {
        for (AccountEntrySortTypeCodeType c: AccountEntrySortTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
