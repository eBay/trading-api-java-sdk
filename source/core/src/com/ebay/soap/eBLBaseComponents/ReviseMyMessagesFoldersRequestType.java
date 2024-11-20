
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
 * 				This call can be used to add, remove, or rename a custom folder in <b>My eBay Messages</b>. Note that the Inbox and Sent folders cannot be removed or renamed in <b>My eBay Messages</b>.
 * 				<br/><br/>
 * 				A user can have up to 10 custom folders in <b>My eBay Messages</b>, and it is possible to add, remove, or rename up to 10 custom folders with one <b>ReviseMyMessagesFolders</b> call
 * 			
 * 
 * <p>Java class for ReviseMyMessagesFoldersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseMyMessagesFoldersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Operation" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesFolderOperationCodeType" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseMyMessagesFoldersRequestType", propOrder = {
    "operation",
    "folderID",
    "folderName"
})
public class ReviseMyMessagesFoldersRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Operation")
    protected MyMessagesFolderOperationCodeType operation;
    @XmlElement(name = "FolderID", type = Long.class)
    protected List<Long> folderID;
    @XmlElement(name = "FolderName")
    protected List<String> folderName;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesFolderOperationCodeType }
     *     
     */
    public MyMessagesFolderOperationCodeType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesFolderOperationCodeType }
     *     
     */
    public void setOperation(MyMessagesFolderOperationCodeType value) {
        this.operation = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Long }
     *     
     */
    public long[] getFolderID() {
        if (this.folderID == null) {
            return new long[ 0 ] ;
        }
        long[] r = new long[this.folderID.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.folderID.get(__i).longValue();
        }
        return r;
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Long }
     *     
     */
    public long getFolderID(int idx) {
        if (this.folderID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.folderID.get(idx).longValue();
    }

    public int getFolderIDLength() {
        if (this.folderID == null) {
            return  0;
        }
        return this.folderID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Long }
     *     
     */
    public void setFolderID(long[] values) {
        this._getFolderID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.folderID.add(new Long(values[i]));
        }
    }

    protected List<Long> _getFolderID() {
        if (folderID == null) {
            folderID = new ArrayList<Long>();
        }
        return folderID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public long setFolderID(int idx, long value) {
        return this.folderID.set(idx, new Long(value)).longValue();
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getFolderName() {
        if (this.folderName == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.folderName.toArray(new String[this.folderName.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getFolderName(int idx) {
        if (this.folderName == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.folderName.get(idx);
    }

    public int getFolderNameLength() {
        if (this.folderName == null) {
            return  0;
        }
        return this.folderName.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setFolderName(String[] values) {
        this._getFolderName().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.folderName.add(values[i]);
        }
    }

    protected List<String> _getFolderName() {
        if (folderName == null) {
            folderName = new ArrayList<String>();
        }
        return folderName;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setFolderName(int idx, String value) {
        return this.folderName.set(idx, value);
    }

}
