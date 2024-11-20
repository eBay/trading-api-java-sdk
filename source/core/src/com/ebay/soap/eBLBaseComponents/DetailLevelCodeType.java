
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetailLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReturnAll"/>
 *     &lt;enumeration value="ItemReturnDescription"/>
 *     &lt;enumeration value="ItemReturnAttributes"/>
 *     &lt;enumeration value="ItemReturnCategories"/>
 *     &lt;enumeration value="ReturnSummary"/>
 *     &lt;enumeration value="ReturnHeaders"/>
 *     &lt;enumeration value="ReturnMessages"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DetailLevelCodeType")
@XmlEnum
public enum DetailLevelCodeType {


    /**
     * 
     * 						Returns all available data.
     * 						With <b>GetSellerList</b> and other calls that retrieve large data sets,
     * 						please avoid using <b>ReturnAll</b> when possible. For example, if you use
     * 						<b>GetSellerList</b>, use a <b>GranularityLevel</b> or use the
     * 						<b>GetSellerEvents</b> call instead. If you use <b>ReturnAll</b> with <b>GetSellerList</b>,
     * 						use a small <b>EntriesPerPage</b> value and a short
     * 						<b>EndTimeFrom</b>/<b>EndTimeTo</b> range for better performance.
     * 					
     * 
     */
    @XmlEnumValue("ReturnAll")
    RETURN_ALL("ReturnAll"),

    /**
     * 
     * 						 Returns the description, plus the
     * 						<b>ListingDesigner</b> node and some additional information if applicable
     * 					
     * 
     */
    @XmlEnumValue("ItemReturnDescription")
    ITEM_RETURN_DESCRIPTION("ItemReturnDescription"),

    /**
     * 
     * 						 For <b>GetItem</b>, returns Item Specifics and
     * 						Pre-filled Item Information, if any.
     * 						Also see the description of
     * 						<b>Item.ProductListingDetails</b> for <b>GetItem</b>.
     * 					
     * 
     */
    @XmlEnumValue("ItemReturnAttributes")
    ITEM_RETURN_ATTRIBUTES("ItemReturnAttributes"),

    /**
     * 
     * 						 If this value is used, the primary category and, if applicable, the secondary category is returned.
     * 					
     * 
     */
    @XmlEnumValue("ItemReturnCategories")
    ITEM_RETURN_CATEGORIES("ItemReturnCategories"),

    /**
     * 
     * 						 Returns the summary data.
     * 						For <b>GetMyMessages</b>, this detail level returns the same data
     * 						whether or not you include <b>MessageIDs</b> in the
     * 						request. Returns up to 10 <b>FolderID</b> and <b>FolderName</b> values.
     * 						Currently, this detail level is the only way to retrieve
     * 						<b>FolderID</b> and <b>FolderName</b> values. See <b>GetMyMessages</b>
     * 						 for a code sample that demonstrates
     * 						this.
     * 					
     * 
     */
    @XmlEnumValue("ReturnSummary")
    RETURN_SUMMARY("ReturnSummary"),

    /**
     * 
     * 						 Returns message headers.
     * 						For <b>GetMyMessages</b>, if you include <b>MessageIDs</b> in
     * 						the request, this detail level returns header information,
     * 						without body text, for the specified message ID or alert ID
     * 						values. If you include a <b>FolderID</b>, header information is
     * 						returned only for the messages and alerts in the specified
     * 						folder.<br/><br/>
     * 						If you do not include <b>MessageIDs</b>, this detail
     * 						level returns header information for Alerts and Messages as follows:
     * 						<ul>
     * 						   <li>If all the Alerts have been read, they are sorted in date order,
     * 						with the most recent first.</li>
     * 						   <li>If one of the Alerts has not been read, the Read Alerts come first,
     * 						sorted most recent first, followed by the Unread Alert(s).</li>
     * 						   <li>All messages in ascending order by date received with the
     * 						  oldest messages first.</li>
     * 						 </ul>
     * 						  <br/>
     * 						<span class="tablenote"><b>Note:</b>
     * 						Even when restricted by this detail level to return only header information, <b>GetMyMessages</b> may return a high volume of data.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("ReturnHeaders")
    RETURN_HEADERS("ReturnHeaders"),

    /**
     * 
     * 						 Returns full message information.
     * 						For <b>GetMyMessages</b>, if you include <b>MessageIDs</b> in
     * 						the request, this detail level returns message information
     * 						for the specified message ID or alert ID values. If you
     * 						include a <b>FolderID</b>, message information is returned only for
     * 						the messages and alerts in the specified folder.
     * 					
     * 
     */
    @XmlEnumValue("ReturnMessages")
    RETURN_MESSAGES("ReturnMessages");
    private final String value;

    DetailLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailLevelCodeType fromValue(String v) {
        for (DetailLevelCodeType c: DetailLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
