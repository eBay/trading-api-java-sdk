
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 *                 Type that provides an array of one or more regulatory documents associated with a listing for Regulatory Compliance. 
 * 				<br />
 * 				<span class="tablenote"><b>Note: </b> As a part of General Product Safety Regulation (GPSR) requirements effective from December 13th, 2024, sellers operating in, or shipping to, EU-based countries or Northern Ireland are conditionally required to provide document information in their eBay listings. For more information on GPSR, see <a href = "https://www.ebay.com/sellercenter/resources/general-product-safety-regulation" target="_blank">General Product Safety Regulation (GPSR)</a>.</span>
 *             
 * 
 * <p>Java class for DocumentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{urn:ebay:apis:eBLBaseComponents}DocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsType", propOrder = {
    "document",
    "any"
})
public class DocumentsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Document")
    protected List<DocumentType> document;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DocumentType }
     *     
     */
    public DocumentType[] getDocument() {
        if (this.document == null) {
            return new DocumentType[ 0 ] ;
        }
        return ((DocumentType[]) this.document.toArray(new DocumentType[this.document.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument(int idx) {
        if (this.document == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.document.get(idx);
    }

    public int getDocumentLength() {
        if (this.document == null) {
            return  0;
        }
        return this.document.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType[] values) {
        this._getDocument().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.document.add(values[i]);
        }
    }

    protected List<DocumentType> _getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return document;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType setDocument(int idx, DocumentType value) {
        return this.document.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
