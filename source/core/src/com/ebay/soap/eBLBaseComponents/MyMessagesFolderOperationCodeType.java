
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyMessagesFolderOperationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MyMessagesFolderOperationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="Rename"/>
 *     &lt;enumeration value="Remove"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MyMessagesFolderOperationCodeType")
@XmlEnum
public enum MyMessagesFolderOperationCodeType {


    /**
     * 
     * 						This enumeration value is used to create one or more custom folders in <b>My eBay Messages</b>. For a 'Display' operation, the new folder name(s) are specified in  one or more <b>FolderName</b> fields. The maximum length of a folder name is 15 characters. Up to 10 new folders can be created with one <b>ReviseMyMessagesFolders</b> call, but this is also limited by how many custom folders exist at the time of the call, as only a maximum of 10 custom folders are supported in <b>My eBay Messages</b>.
     * 					
     * 
     */
    @XmlEnumValue("Display")
    DISPLAY("Display"),

    /**
     * 
     * 						This enumeration value is used to rename one or more existing folders in <b>My eBay Messages</b>. For a 'Rename' operation, the unique identifier(s) of the message folder(s) to rename are specified in one or more <b>FolderID</b> fields, and the new name for the folder(s) are specified in one or more <b>FolderName</b> fields.
     * 						<br/><br/>
     * 						The <b>FolderID</b> and <b>FolderName</b> values can be retrieved by calling <b>GetMyMessages</b> with a <b>DetailLevel</b> value set to <code>ReturnSummary</code>, or these folder names and identifiers can be found by navigating to <b>My eBay Messages</b> (Folder ID values are displayed at the end of the browser's URL when that folder is opened).
     * 						<br/><br/>
     * 						The maximum length of a folder name is 15 characters. The Inbox and Sent folders cannot be renamed.
     * 						<br/><br/>
     * 							<span class="tablenote"><b>Note: </b> If multiple folders will be renamed with one call, the user must pay close attention to the order of the <b>FolderID</b> and <b>FolderName</b> fields, as eBay will process these requests in order according to the placement of the the <b>FolderID</b> and <b>FolderName</b> fields. So, the existing folder identified by the first <b>FolderID</b> field in the request payload will get renamed to the folder name passed into the first <b>FolderName</b> field in the request payload, and so on.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Rename")
    RENAME("Rename"),

    /**
     * 
     * 						This enumeration value is used to remove one or more custom folders in <b>My eBay Messages</b>. For a 'Remove' operation, the folder(s) to remove are specified in one or more <b>FolderID</b> fields. The <b>FolderID</b> values for a <b>My eBay Messages</b> folders can be retrieved by calling <b>GetMyMessages</b> with a <b>DetailLevel</b> value set to <code>ReturnSummary</code>, or these folder IDs can be found by navigating to a specific folder in <b>My eBay Messages</b>, and the ID value for the opened folder is displayed at the end of the browser's URL.
     * 						<br/><br/>
     * 						A <b>My eBay Messages</b> folder must be empty before being removed, and an error is returned if a user tries to remove a non-empty folder.
     * 						<br/><br/>
     * 						The Inbox and Sent folders cannot be removed under any circumstance.
     * 					
     * 
     */
    @XmlEnumValue("Remove")
    REMOVE("Remove"),

    /**
     * 
     * 						Reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MyMessagesFolderOperationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MyMessagesFolderOperationCodeType fromValue(String v) {
        for (MyMessagesFolderOperationCodeType c: MyMessagesFolderOperationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
