
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Decimal"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="ISBN"/>
 *     &lt;enumeration value="UPC"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="CodiceFiscale"/>
 *     &lt;enumeration value="DNI"/>
 *     &lt;enumeration value="RussianPassport"/>
 *     &lt;enumeration value="CPFTaxID"/>
 *     &lt;enumeration value="TurkeyID"/>
 *     &lt;enumeration value="NIE"/>
 *     &lt;enumeration value="NIF"/>
 *     &lt;enumeration value="CEDULA"/>
 *     &lt;enumeration value="NIT"/>
 *     &lt;enumeration value="DriverLicense"/>
 *     &lt;enumeration value="CNPJ"/>
 *     &lt;enumeration value="VATIN"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ValueTypeCodeType")
@XmlEnum
public enum ValueTypeCodeType {


    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Text")
    TEXT("Text"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    ISBN("ISBN"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    UPC("UPC"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    EAN("EAN"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Date")
    DATE("Date"),

    /**
     * 
     * 						This value indicates that the tax ID in the <b>ID</b> field is a Codice Fiscale ID, which is an identifier used by the Italian government to identify taxpayers in Italy.
     * 					
     * 
     */
    @XmlEnumValue("CodiceFiscale")
    CODICE_FISCALE("CodiceFiscale"),

    /**
     * 
     * 						 This value indicates that the tax ID in the <b>ID</b> field is a Spanish National Identity Number, which is one identifier used by the Spanish government to identify taxpayers in Spain. In Spanish, this ID is known as the 'Documento nacional de identidad'. The other tax identifier for Spanish residents is the NIE number, or 'Numero de Identidad de Extranjero'.
     * 					
     * 
     */
    DNI("DNI"),

    /**
     * 
     * 						This value indicates that the tax ID in the <b>ID</b> field is a Russian Passport number.
     * 					
     * 
     */
    @XmlEnumValue("RussianPassport")
    RUSSIAN_PASSPORT("RussianPassport"),

    /**
     * 
     * 							This value indicates that the tax ID in the <b>ID</b> field is a Tax Registration Number, which is an identifier used by the Brazilian government to identify taxpayers in Brazil. In Portuguese, this ID is known as the 'Cadastro de Pessoas Fisicas', or 'CPF'.
     * 						
     * 
     */
    @XmlEnumValue("CPFTaxID")
    CPF_TAX_ID("CPFTaxID"),

    /**
     * 
     * 							This value indicates that the tax ID in the <b>ID</b> field is a Turkish Identification Number, which is an identifier used by the Turkish government to identify taxpayers in Turkey. In Turkish, this ID is known as the 'Turkiye Cumhuriyeti Kimlik Numarasi', often abbreviated as T.C. Kimlik No.
     * 					
     * 
     */
    @XmlEnumValue("TurkeyID")
    TURKEY_ID("TurkeyID"),

    /**
     * 
     * 							This value indicates that the tax ID in the <b>ID</b> field is a NIE Number, which is one identifier used by the Spanish government to identify taxpayers in Spain. 'NIE' stands for 'Numero de Identidad de Extranjero'. The other tax identifier for Spanish residents is the DNI number, or 'Documento nacional de identidad'. Spanish residents can also be identified by their Spanish VAT (Value-Added Tax) number, which is also called the 'Numero de Identificacion Fiscal' or NIF.
     * 						
     * 
     */
    NIE("NIE"),

    /**
     * 
     * 							This value indicates that the ID in the <b>ID</b> field is an NIF Number, which is also known as their Spanish VAT (Value-Added Tax) number. 'NIF' stands for 'Numero de Identificacion Fiscal'. Spanish residents can also be identified by their DNI ('Documento nacional de identidad') number or their NIE ('Numero de Identidad de Extranjero') number.
     * 						
     * 
     */
    NIF("NIF"),

    /**
     * 
     * 							 	This value indicates that the tax ID in the <b>ID</b> field is a Cedula number, which is an identifier used by the Chilean, Columbian, and Dominican Republic governments to identify taxpayers in those countries. This ID is sometimes referred to as a 'Cedula de Identidad'.
     * 							
     * 
     */
    CEDULA("CEDULA"),

    /**
     * 
     * 						 This value indicates that the tax ID in the <b>ID</b> field is a NIT number, which is an identifier used by the Guatemalan government to identify taxpayers in Guatemala. In Spanish, this ID is known as the 'Numero de identificacion tributaria'.
     * 					
     * 
     */
    NIT("NIT"),

    /**
     * 
     * 						 This value indicates that the identifier in the <b>ID</b> field is a driver's license number.
     * 					
     * 
     */
    @XmlEnumValue("DriverLicense")
    DRIVER_LICENSE("DriverLicense"),

    /**
     * 
     * 						This value indicates that the tax ID in the <b>ID</b> field is a CNPJ number, which is an identifier used by the Brazilian government to identify taxpayers in Brazil. In Portuguese, this ID is known as the 'Cadastro Nacional da Pessoa Juridica'.
     * 					
     * 
     */
    CNPJ("CNPJ"),

    /**
     * 
     * 						This value indicates that the tax ID in the <b>ID</b> field is a VAT Identification Number for the buyer.
     * 					
     * 
     */
    VATIN("VATIN"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ValueTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueTypeCodeType fromValue(String v) {
        for (ValueTypeCodeType c: ValueTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
