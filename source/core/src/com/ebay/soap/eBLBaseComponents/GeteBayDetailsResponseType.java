
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Details about a specified site in response to <b>GeteBayDetailsRequest</b>. If no <b>DetailName</b> field is identified in the request, all elements of <b>GeteBayDetailsResponse</b> are returned. Otherwise, eBay returns only the elements corresponding to the specified <b>DetailName</b> fields. <b>UpdateTime</b> gives the time of modification of the most recently modified <b>DetailName</b>.
 * 			
 * 
 * <p>Java class for GeteBayDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeteBayDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CountryDetails" type="{urn:ebay:apis:eBLBaseComponents}CountryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrencyDetails" type="{urn:ebay:apis:eBLBaseComponents}CurrencyDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DispatchTimeMaxDetails" type="{urn:ebay:apis:eBLBaseComponents}DispatchTimeMaxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentOptionDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentOptionDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegionDetails" type="{urn:ebay:apis:eBLBaseComponents}RegionDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingLocationDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingLocationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingServiceDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SiteDetails" type="{urn:ebay:apis:eBLBaseComponents}SiteDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxJurisdiction" type="{urn:ebay:apis:eBLBaseComponents}TaxJurisdictionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="URLDetails" type="{urn:ebay:apis:eBLBaseComponents}URLDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeZoneDetails" type="{urn:ebay:apis:eBLBaseComponents}TimeZoneDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemSpecificDetails" type="{urn:ebay:apis:eBLBaseComponents}ItemSpecificDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasurementDetails" type="{urn:ebay:apis:eBLBaseComponents}UnitOfMeasurementDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegionOfOriginDetails" type="{urn:ebay:apis:eBLBaseComponents}RegionOfOriginDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingPackageDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingCarrierDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingCarrierDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyDetails" type="{urn:ebay:apis:eBLBaseComponents}ReturnPolicyDetailsType" minOccurs="0"/>
 *         &lt;element name="InternationalReturnPolicyDetails" type="{urn:ebay:apis:eBLBaseComponents}ReturnPolicyDetailsType" minOccurs="0"/>
 *         &lt;element name="ListingStartPriceDetails" type="{urn:ebay:apis:eBLBaseComponents}ListingStartPriceDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyerRequirementDetails" type="{urn:ebay:apis:eBLBaseComponents}SiteBuyerRequirementDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListingFeatureDetails" type="{urn:ebay:apis:eBLBaseComponents}ListingFeatureDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariationDetails" type="{urn:ebay:apis:eBLBaseComponents}VariationDetailsType" minOccurs="0"/>
 *         &lt;element name="ExcludeShippingLocationDetails" type="{urn:ebay:apis:eBLBaseComponents}ExcludeShippingLocationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RecoupmentPolicyDetails" type="{urn:ebay:apis:eBLBaseComponents}RecoupmentPolicyDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingCategoryDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingCategoryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductDetails" type="{urn:ebay:apis:eBLBaseComponents}ProductDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeteBayDetailsResponseType", propOrder = {
    "countryDetails",
    "currencyDetails",
    "dispatchTimeMaxDetails",
    "paymentOptionDetails",
    "regionDetails",
    "shippingLocationDetails",
    "shippingServiceDetails",
    "siteDetails",
    "taxJurisdiction",
    "urlDetails",
    "timeZoneDetails",
    "itemSpecificDetails",
    "unitOfMeasurementDetails",
    "regionOfOriginDetails",
    "shippingPackageDetails",
    "shippingCarrierDetails",
    "returnPolicyDetails",
    "internationalReturnPolicyDetails",
    "listingStartPriceDetails",
    "buyerRequirementDetails",
    "listingFeatureDetails",
    "variationDetails",
    "excludeShippingLocationDetails",
    "updateTime",
    "recoupmentPolicyDetails",
    "shippingCategoryDetails",
    "productDetails"
})
public class GeteBayDetailsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CountryDetails")
    protected List<CountryDetailsType> countryDetails;
    @XmlElement(name = "CurrencyDetails")
    protected List<CurrencyDetailsType> currencyDetails;
    @XmlElement(name = "DispatchTimeMaxDetails")
    protected List<DispatchTimeMaxDetailsType> dispatchTimeMaxDetails;
    @XmlElement(name = "PaymentOptionDetails")
    protected List<PaymentOptionDetailsType> paymentOptionDetails;
    @XmlElement(name = "RegionDetails")
    protected List<RegionDetailsType> regionDetails;
    @XmlElement(name = "ShippingLocationDetails")
    protected List<ShippingLocationDetailsType> shippingLocationDetails;
    @XmlElement(name = "ShippingServiceDetails")
    protected List<ShippingServiceDetailsType> shippingServiceDetails;
    @XmlElement(name = "SiteDetails")
    protected List<SiteDetailsType> siteDetails;
    @XmlElement(name = "TaxJurisdiction")
    protected List<TaxJurisdictionType> taxJurisdiction;
    @XmlElement(name = "URLDetails")
    protected List<URLDetailsType> urlDetails;
    @XmlElement(name = "TimeZoneDetails")
    protected List<TimeZoneDetailsType> timeZoneDetails;
    @XmlElement(name = "ItemSpecificDetails")
    protected List<ItemSpecificDetailsType> itemSpecificDetails;
    @XmlElement(name = "UnitOfMeasurementDetails")
    protected List<UnitOfMeasurementDetailsType> unitOfMeasurementDetails;
    @XmlElement(name = "RegionOfOriginDetails")
    protected List<RegionOfOriginDetailsType> regionOfOriginDetails;
    @XmlElement(name = "ShippingPackageDetails")
    protected List<ShippingPackageDetailsType> shippingPackageDetails;
    @XmlElement(name = "ShippingCarrierDetails")
    protected List<ShippingCarrierDetailsType> shippingCarrierDetails;
    @XmlElement(name = "ReturnPolicyDetails")
    protected ReturnPolicyDetailsType returnPolicyDetails;
    @XmlElement(name = "InternationalReturnPolicyDetails")
    protected ReturnPolicyDetailsType internationalReturnPolicyDetails;
    @XmlElement(name = "ListingStartPriceDetails")
    protected List<ListingStartPriceDetailsType> listingStartPriceDetails;
    @XmlElement(name = "BuyerRequirementDetails")
    protected List<SiteBuyerRequirementDetailsType> buyerRequirementDetails;
    @XmlElement(name = "ListingFeatureDetails")
    protected List<ListingFeatureDetailsType> listingFeatureDetails;
    @XmlElement(name = "VariationDetails")
    protected VariationDetailsType variationDetails;
    @XmlElement(name = "ExcludeShippingLocationDetails")
    protected List<ExcludeShippingLocationDetailsType> excludeShippingLocationDetails;
    @XmlElement(name = "UpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updateTime;
    @XmlElement(name = "RecoupmentPolicyDetails")
    protected List<RecoupmentPolicyDetailsType> recoupmentPolicyDetails;
    @XmlElement(name = "ShippingCategoryDetails")
    protected List<ShippingCategoryDetailsType> shippingCategoryDetails;
    @XmlElement(name = "ProductDetails")
    protected ProductDetailsType productDetails;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CountryDetailsType }
     *     
     */
    public CountryDetailsType[] getCountryDetails() {
        if (this.countryDetails == null) {
            return new CountryDetailsType[ 0 ] ;
        }
        return ((CountryDetailsType[]) this.countryDetails.toArray(new CountryDetailsType[this.countryDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CountryDetailsType }
     *     
     */
    public CountryDetailsType getCountryDetails(int idx) {
        if (this.countryDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.countryDetails.get(idx);
    }

    public int getCountryDetailsLength() {
        if (this.countryDetails == null) {
            return  0;
        }
        return this.countryDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CountryDetailsType }
     *     
     */
    public void setCountryDetails(CountryDetailsType[] values) {
        this._getCountryDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.countryDetails.add(values[i]);
        }
    }

    protected List<CountryDetailsType> _getCountryDetails() {
        if (countryDetails == null) {
            countryDetails = new ArrayList<CountryDetailsType>();
        }
        return countryDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDetailsType }
     *     
     */
    public CountryDetailsType setCountryDetails(int idx, CountryDetailsType value) {
        return this.countryDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CurrencyDetailsType }
     *     
     */
    public CurrencyDetailsType[] getCurrencyDetails() {
        if (this.currencyDetails == null) {
            return new CurrencyDetailsType[ 0 ] ;
        }
        return ((CurrencyDetailsType[]) this.currencyDetails.toArray(new CurrencyDetailsType[this.currencyDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CurrencyDetailsType }
     *     
     */
    public CurrencyDetailsType getCurrencyDetails(int idx) {
        if (this.currencyDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.currencyDetails.get(idx);
    }

    public int getCurrencyDetailsLength() {
        if (this.currencyDetails == null) {
            return  0;
        }
        return this.currencyDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CurrencyDetailsType }
     *     
     */
    public void setCurrencyDetails(CurrencyDetailsType[] values) {
        this._getCurrencyDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.currencyDetails.add(values[i]);
        }
    }

    protected List<CurrencyDetailsType> _getCurrencyDetails() {
        if (currencyDetails == null) {
            currencyDetails = new ArrayList<CurrencyDetailsType>();
        }
        return currencyDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetailsType }
     *     
     */
    public CurrencyDetailsType setCurrencyDetails(int idx, CurrencyDetailsType value) {
        return this.currencyDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DispatchTimeMaxDetailsType }
     *     
     */
    public DispatchTimeMaxDetailsType[] getDispatchTimeMaxDetails() {
        if (this.dispatchTimeMaxDetails == null) {
            return new DispatchTimeMaxDetailsType[ 0 ] ;
        }
        return ((DispatchTimeMaxDetailsType[]) this.dispatchTimeMaxDetails.toArray(new DispatchTimeMaxDetailsType[this.dispatchTimeMaxDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DispatchTimeMaxDetailsType }
     *     
     */
    public DispatchTimeMaxDetailsType getDispatchTimeMaxDetails(int idx) {
        if (this.dispatchTimeMaxDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.dispatchTimeMaxDetails.get(idx);
    }

    public int getDispatchTimeMaxDetailsLength() {
        if (this.dispatchTimeMaxDetails == null) {
            return  0;
        }
        return this.dispatchTimeMaxDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DispatchTimeMaxDetailsType }
     *     
     */
    public void setDispatchTimeMaxDetails(DispatchTimeMaxDetailsType[] values) {
        this._getDispatchTimeMaxDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.dispatchTimeMaxDetails.add(values[i]);
        }
    }

    protected List<DispatchTimeMaxDetailsType> _getDispatchTimeMaxDetails() {
        if (dispatchTimeMaxDetails == null) {
            dispatchTimeMaxDetails = new ArrayList<DispatchTimeMaxDetailsType>();
        }
        return dispatchTimeMaxDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DispatchTimeMaxDetailsType }
     *     
     */
    public DispatchTimeMaxDetailsType setDispatchTimeMaxDetails(int idx, DispatchTimeMaxDetailsType value) {
        return this.dispatchTimeMaxDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PaymentOptionDetailsType }
     *     
     */
    public PaymentOptionDetailsType[] getPaymentOptionDetails() {
        if (this.paymentOptionDetails == null) {
            return new PaymentOptionDetailsType[ 0 ] ;
        }
        return ((PaymentOptionDetailsType[]) this.paymentOptionDetails.toArray(new PaymentOptionDetailsType[this.paymentOptionDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PaymentOptionDetailsType }
     *     
     */
    public PaymentOptionDetailsType getPaymentOptionDetails(int idx) {
        if (this.paymentOptionDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.paymentOptionDetails.get(idx);
    }

    public int getPaymentOptionDetailsLength() {
        if (this.paymentOptionDetails == null) {
            return  0;
        }
        return this.paymentOptionDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PaymentOptionDetailsType }
     *     
     */
    public void setPaymentOptionDetails(PaymentOptionDetailsType[] values) {
        this._getPaymentOptionDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.paymentOptionDetails.add(values[i]);
        }
    }

    protected List<PaymentOptionDetailsType> _getPaymentOptionDetails() {
        if (paymentOptionDetails == null) {
            paymentOptionDetails = new ArrayList<PaymentOptionDetailsType>();
        }
        return paymentOptionDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOptionDetailsType }
     *     
     */
    public PaymentOptionDetailsType setPaymentOptionDetails(int idx, PaymentOptionDetailsType value) {
        return this.paymentOptionDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RegionDetailsType }
     *     
     */
    public RegionDetailsType[] getRegionDetails() {
        if (this.regionDetails == null) {
            return new RegionDetailsType[ 0 ] ;
        }
        return ((RegionDetailsType[]) this.regionDetails.toArray(new RegionDetailsType[this.regionDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RegionDetailsType }
     *     
     */
    public RegionDetailsType getRegionDetails(int idx) {
        if (this.regionDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.regionDetails.get(idx);
    }

    public int getRegionDetailsLength() {
        if (this.regionDetails == null) {
            return  0;
        }
        return this.regionDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RegionDetailsType }
     *     
     */
    public void setRegionDetails(RegionDetailsType[] values) {
        this._getRegionDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.regionDetails.add(values[i]);
        }
    }

    protected List<RegionDetailsType> _getRegionDetails() {
        if (regionDetails == null) {
            regionDetails = new ArrayList<RegionDetailsType>();
        }
        return regionDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDetailsType }
     *     
     */
    public RegionDetailsType setRegionDetails(int idx, RegionDetailsType value) {
        return this.regionDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingLocationDetailsType }
     *     
     */
    public ShippingLocationDetailsType[] getShippingLocationDetails() {
        if (this.shippingLocationDetails == null) {
            return new ShippingLocationDetailsType[ 0 ] ;
        }
        return ((ShippingLocationDetailsType[]) this.shippingLocationDetails.toArray(new ShippingLocationDetailsType[this.shippingLocationDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingLocationDetailsType }
     *     
     */
    public ShippingLocationDetailsType getShippingLocationDetails(int idx) {
        if (this.shippingLocationDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingLocationDetails.get(idx);
    }

    public int getShippingLocationDetailsLength() {
        if (this.shippingLocationDetails == null) {
            return  0;
        }
        return this.shippingLocationDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingLocationDetailsType }
     *     
     */
    public void setShippingLocationDetails(ShippingLocationDetailsType[] values) {
        this._getShippingLocationDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingLocationDetails.add(values[i]);
        }
    }

    protected List<ShippingLocationDetailsType> _getShippingLocationDetails() {
        if (shippingLocationDetails == null) {
            shippingLocationDetails = new ArrayList<ShippingLocationDetailsType>();
        }
        return shippingLocationDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingLocationDetailsType }
     *     
     */
    public ShippingLocationDetailsType setShippingLocationDetails(int idx, ShippingLocationDetailsType value) {
        return this.shippingLocationDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingServiceDetailsType }
     *     
     */
    public ShippingServiceDetailsType[] getShippingServiceDetails() {
        if (this.shippingServiceDetails == null) {
            return new ShippingServiceDetailsType[ 0 ] ;
        }
        return ((ShippingServiceDetailsType[]) this.shippingServiceDetails.toArray(new ShippingServiceDetailsType[this.shippingServiceDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingServiceDetailsType }
     *     
     */
    public ShippingServiceDetailsType getShippingServiceDetails(int idx) {
        if (this.shippingServiceDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingServiceDetails.get(idx);
    }

    public int getShippingServiceDetailsLength() {
        if (this.shippingServiceDetails == null) {
            return  0;
        }
        return this.shippingServiceDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingServiceDetailsType }
     *     
     */
    public void setShippingServiceDetails(ShippingServiceDetailsType[] values) {
        this._getShippingServiceDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingServiceDetails.add(values[i]);
        }
    }

    protected List<ShippingServiceDetailsType> _getShippingServiceDetails() {
        if (shippingServiceDetails == null) {
            shippingServiceDetails = new ArrayList<ShippingServiceDetailsType>();
        }
        return shippingServiceDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceDetailsType }
     *     
     */
    public ShippingServiceDetailsType setShippingServiceDetails(int idx, ShippingServiceDetailsType value) {
        return this.shippingServiceDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SiteDetailsType }
     *     
     */
    public SiteDetailsType[] getSiteDetails() {
        if (this.siteDetails == null) {
            return new SiteDetailsType[ 0 ] ;
        }
        return ((SiteDetailsType[]) this.siteDetails.toArray(new SiteDetailsType[this.siteDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SiteDetailsType }
     *     
     */
    public SiteDetailsType getSiteDetails(int idx) {
        if (this.siteDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.siteDetails.get(idx);
    }

    public int getSiteDetailsLength() {
        if (this.siteDetails == null) {
            return  0;
        }
        return this.siteDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SiteDetailsType }
     *     
     */
    public void setSiteDetails(SiteDetailsType[] values) {
        this._getSiteDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.siteDetails.add(values[i]);
        }
    }

    protected List<SiteDetailsType> _getSiteDetails() {
        if (siteDetails == null) {
            siteDetails = new ArrayList<SiteDetailsType>();
        }
        return siteDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDetailsType }
     *     
     */
    public SiteDetailsType setSiteDetails(int idx, SiteDetailsType value) {
        return this.siteDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link TaxJurisdictionType }
     *     
     */
    public TaxJurisdictionType[] getTaxJurisdiction() {
        if (this.taxJurisdiction == null) {
            return new TaxJurisdictionType[ 0 ] ;
        }
        return ((TaxJurisdictionType[]) this.taxJurisdiction.toArray(new TaxJurisdictionType[this.taxJurisdiction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link TaxJurisdictionType }
     *     
     */
    public TaxJurisdictionType getTaxJurisdiction(int idx) {
        if (this.taxJurisdiction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.taxJurisdiction.get(idx);
    }

    public int getTaxJurisdictionLength() {
        if (this.taxJurisdiction == null) {
            return  0;
        }
        return this.taxJurisdiction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link TaxJurisdictionType }
     *     
     */
    public void setTaxJurisdiction(TaxJurisdictionType[] values) {
        this._getTaxJurisdiction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.taxJurisdiction.add(values[i]);
        }
    }

    protected List<TaxJurisdictionType> _getTaxJurisdiction() {
        if (taxJurisdiction == null) {
            taxJurisdiction = new ArrayList<TaxJurisdictionType>();
        }
        return taxJurisdiction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionType }
     *     
     */
    public TaxJurisdictionType setTaxJurisdiction(int idx, TaxJurisdictionType value) {
        return this.taxJurisdiction.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link URLDetailsType }
     *     
     */
    public URLDetailsType[] getURLDetails() {
        if (this.urlDetails == null) {
            return new URLDetailsType[ 0 ] ;
        }
        return ((URLDetailsType[]) this.urlDetails.toArray(new URLDetailsType[this.urlDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link URLDetailsType }
     *     
     */
    public URLDetailsType getURLDetails(int idx) {
        if (this.urlDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.urlDetails.get(idx);
    }

    public int getURLDetailsLength() {
        if (this.urlDetails == null) {
            return  0;
        }
        return this.urlDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link URLDetailsType }
     *     
     */
    public void setURLDetails(URLDetailsType[] values) {
        this._getURLDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.urlDetails.add(values[i]);
        }
    }

    protected List<URLDetailsType> _getURLDetails() {
        if (urlDetails == null) {
            urlDetails = new ArrayList<URLDetailsType>();
        }
        return urlDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link URLDetailsType }
     *     
     */
    public URLDetailsType setURLDetails(int idx, URLDetailsType value) {
        return this.urlDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link TimeZoneDetailsType }
     *     
     */
    public TimeZoneDetailsType[] getTimeZoneDetails() {
        if (this.timeZoneDetails == null) {
            return new TimeZoneDetailsType[ 0 ] ;
        }
        return ((TimeZoneDetailsType[]) this.timeZoneDetails.toArray(new TimeZoneDetailsType[this.timeZoneDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link TimeZoneDetailsType }
     *     
     */
    public TimeZoneDetailsType getTimeZoneDetails(int idx) {
        if (this.timeZoneDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.timeZoneDetails.get(idx);
    }

    public int getTimeZoneDetailsLength() {
        if (this.timeZoneDetails == null) {
            return  0;
        }
        return this.timeZoneDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link TimeZoneDetailsType }
     *     
     */
    public void setTimeZoneDetails(TimeZoneDetailsType[] values) {
        this._getTimeZoneDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.timeZoneDetails.add(values[i]);
        }
    }

    protected List<TimeZoneDetailsType> _getTimeZoneDetails() {
        if (timeZoneDetails == null) {
            timeZoneDetails = new ArrayList<TimeZoneDetailsType>();
        }
        return timeZoneDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneDetailsType }
     *     
     */
    public TimeZoneDetailsType setTimeZoneDetails(int idx, TimeZoneDetailsType value) {
        return this.timeZoneDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ItemSpecificDetailsType }
     *     
     */
    public ItemSpecificDetailsType[] getItemSpecificDetails() {
        if (this.itemSpecificDetails == null) {
            return new ItemSpecificDetailsType[ 0 ] ;
        }
        return ((ItemSpecificDetailsType[]) this.itemSpecificDetails.toArray(new ItemSpecificDetailsType[this.itemSpecificDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemSpecificDetailsType }
     *     
     */
    public ItemSpecificDetailsType getItemSpecificDetails(int idx) {
        if (this.itemSpecificDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.itemSpecificDetails.get(idx);
    }

    public int getItemSpecificDetailsLength() {
        if (this.itemSpecificDetails == null) {
            return  0;
        }
        return this.itemSpecificDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemSpecificDetailsType }
     *     
     */
    public void setItemSpecificDetails(ItemSpecificDetailsType[] values) {
        this._getItemSpecificDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.itemSpecificDetails.add(values[i]);
        }
    }

    protected List<ItemSpecificDetailsType> _getItemSpecificDetails() {
        if (itemSpecificDetails == null) {
            itemSpecificDetails = new ArrayList<ItemSpecificDetailsType>();
        }
        return itemSpecificDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSpecificDetailsType }
     *     
     */
    public ItemSpecificDetailsType setItemSpecificDetails(int idx, ItemSpecificDetailsType value) {
        return this.itemSpecificDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link UnitOfMeasurementDetailsType }
     *     
     */
    public UnitOfMeasurementDetailsType[] getUnitOfMeasurementDetails() {
        if (this.unitOfMeasurementDetails == null) {
            return new UnitOfMeasurementDetailsType[ 0 ] ;
        }
        return ((UnitOfMeasurementDetailsType[]) this.unitOfMeasurementDetails.toArray(new UnitOfMeasurementDetailsType[this.unitOfMeasurementDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link UnitOfMeasurementDetailsType }
     *     
     */
    public UnitOfMeasurementDetailsType getUnitOfMeasurementDetails(int idx) {
        if (this.unitOfMeasurementDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.unitOfMeasurementDetails.get(idx);
    }

    public int getUnitOfMeasurementDetailsLength() {
        if (this.unitOfMeasurementDetails == null) {
            return  0;
        }
        return this.unitOfMeasurementDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link UnitOfMeasurementDetailsType }
     *     
     */
    public void setUnitOfMeasurementDetails(UnitOfMeasurementDetailsType[] values) {
        this._getUnitOfMeasurementDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.unitOfMeasurementDetails.add(values[i]);
        }
    }

    protected List<UnitOfMeasurementDetailsType> _getUnitOfMeasurementDetails() {
        if (unitOfMeasurementDetails == null) {
            unitOfMeasurementDetails = new ArrayList<UnitOfMeasurementDetailsType>();
        }
        return unitOfMeasurementDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurementDetailsType }
     *     
     */
    public UnitOfMeasurementDetailsType setUnitOfMeasurementDetails(int idx, UnitOfMeasurementDetailsType value) {
        return this.unitOfMeasurementDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RegionOfOriginDetailsType }
     *     
     */
    public RegionOfOriginDetailsType[] getRegionOfOriginDetails() {
        if (this.regionOfOriginDetails == null) {
            return new RegionOfOriginDetailsType[ 0 ] ;
        }
        return ((RegionOfOriginDetailsType[]) this.regionOfOriginDetails.toArray(new RegionOfOriginDetailsType[this.regionOfOriginDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RegionOfOriginDetailsType }
     *     
     */
    public RegionOfOriginDetailsType getRegionOfOriginDetails(int idx) {
        if (this.regionOfOriginDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.regionOfOriginDetails.get(idx);
    }

    public int getRegionOfOriginDetailsLength() {
        if (this.regionOfOriginDetails == null) {
            return  0;
        }
        return this.regionOfOriginDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RegionOfOriginDetailsType }
     *     
     */
    public void setRegionOfOriginDetails(RegionOfOriginDetailsType[] values) {
        this._getRegionOfOriginDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.regionOfOriginDetails.add(values[i]);
        }
    }

    protected List<RegionOfOriginDetailsType> _getRegionOfOriginDetails() {
        if (regionOfOriginDetails == null) {
            regionOfOriginDetails = new ArrayList<RegionOfOriginDetailsType>();
        }
        return regionOfOriginDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RegionOfOriginDetailsType }
     *     
     */
    public RegionOfOriginDetailsType setRegionOfOriginDetails(int idx, RegionOfOriginDetailsType value) {
        return this.regionOfOriginDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingPackageDetailsType }
     *     
     */
    public ShippingPackageDetailsType[] getShippingPackageDetails() {
        if (this.shippingPackageDetails == null) {
            return new ShippingPackageDetailsType[ 0 ] ;
        }
        return ((ShippingPackageDetailsType[]) this.shippingPackageDetails.toArray(new ShippingPackageDetailsType[this.shippingPackageDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingPackageDetailsType }
     *     
     */
    public ShippingPackageDetailsType getShippingPackageDetails(int idx) {
        if (this.shippingPackageDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingPackageDetails.get(idx);
    }

    public int getShippingPackageDetailsLength() {
        if (this.shippingPackageDetails == null) {
            return  0;
        }
        return this.shippingPackageDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingPackageDetailsType }
     *     
     */
    public void setShippingPackageDetails(ShippingPackageDetailsType[] values) {
        this._getShippingPackageDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingPackageDetails.add(values[i]);
        }
    }

    protected List<ShippingPackageDetailsType> _getShippingPackageDetails() {
        if (shippingPackageDetails == null) {
            shippingPackageDetails = new ArrayList<ShippingPackageDetailsType>();
        }
        return shippingPackageDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageDetailsType }
     *     
     */
    public ShippingPackageDetailsType setShippingPackageDetails(int idx, ShippingPackageDetailsType value) {
        return this.shippingPackageDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingCarrierDetailsType }
     *     
     */
    public ShippingCarrierDetailsType[] getShippingCarrierDetails() {
        if (this.shippingCarrierDetails == null) {
            return new ShippingCarrierDetailsType[ 0 ] ;
        }
        return ((ShippingCarrierDetailsType[]) this.shippingCarrierDetails.toArray(new ShippingCarrierDetailsType[this.shippingCarrierDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingCarrierDetailsType }
     *     
     */
    public ShippingCarrierDetailsType getShippingCarrierDetails(int idx) {
        if (this.shippingCarrierDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingCarrierDetails.get(idx);
    }

    public int getShippingCarrierDetailsLength() {
        if (this.shippingCarrierDetails == null) {
            return  0;
        }
        return this.shippingCarrierDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingCarrierDetailsType }
     *     
     */
    public void setShippingCarrierDetails(ShippingCarrierDetailsType[] values) {
        this._getShippingCarrierDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingCarrierDetails.add(values[i]);
        }
    }

    protected List<ShippingCarrierDetailsType> _getShippingCarrierDetails() {
        if (shippingCarrierDetails == null) {
            shippingCarrierDetails = new ArrayList<ShippingCarrierDetailsType>();
        }
        return shippingCarrierDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCarrierDetailsType }
     *     
     */
    public ShippingCarrierDetailsType setShippingCarrierDetails(int idx, ShippingCarrierDetailsType value) {
        return this.shippingCarrierDetails.set(idx, value);
    }

    /**
     * Gets the value of the returnPolicyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnPolicyDetailsType }
     *     
     */
    public ReturnPolicyDetailsType getReturnPolicyDetails() {
        return returnPolicyDetails;
    }

    /**
     * Sets the value of the returnPolicyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPolicyDetailsType }
     *     
     */
    public void setReturnPolicyDetails(ReturnPolicyDetailsType value) {
        this.returnPolicyDetails = value;
    }

    /**
     * Gets the value of the internationalReturnPolicyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnPolicyDetailsType }
     *     
     */
    public ReturnPolicyDetailsType getInternationalReturnPolicyDetails() {
        return internationalReturnPolicyDetails;
    }

    /**
     * Sets the value of the internationalReturnPolicyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPolicyDetailsType }
     *     
     */
    public void setInternationalReturnPolicyDetails(ReturnPolicyDetailsType value) {
        this.internationalReturnPolicyDetails = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ListingStartPriceDetailsType }
     *     
     */
    public ListingStartPriceDetailsType[] getListingStartPriceDetails() {
        if (this.listingStartPriceDetails == null) {
            return new ListingStartPriceDetailsType[ 0 ] ;
        }
        return ((ListingStartPriceDetailsType[]) this.listingStartPriceDetails.toArray(new ListingStartPriceDetailsType[this.listingStartPriceDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ListingStartPriceDetailsType }
     *     
     */
    public ListingStartPriceDetailsType getListingStartPriceDetails(int idx) {
        if (this.listingStartPriceDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listingStartPriceDetails.get(idx);
    }

    public int getListingStartPriceDetailsLength() {
        if (this.listingStartPriceDetails == null) {
            return  0;
        }
        return this.listingStartPriceDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ListingStartPriceDetailsType }
     *     
     */
    public void setListingStartPriceDetails(ListingStartPriceDetailsType[] values) {
        this._getListingStartPriceDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.listingStartPriceDetails.add(values[i]);
        }
    }

    protected List<ListingStartPriceDetailsType> _getListingStartPriceDetails() {
        if (listingStartPriceDetails == null) {
            listingStartPriceDetails = new ArrayList<ListingStartPriceDetailsType>();
        }
        return listingStartPriceDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ListingStartPriceDetailsType }
     *     
     */
    public ListingStartPriceDetailsType setListingStartPriceDetails(int idx, ListingStartPriceDetailsType value) {
        return this.listingStartPriceDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SiteBuyerRequirementDetailsType }
     *     
     */
    public SiteBuyerRequirementDetailsType[] getBuyerRequirementDetails() {
        if (this.buyerRequirementDetails == null) {
            return new SiteBuyerRequirementDetailsType[ 0 ] ;
        }
        return ((SiteBuyerRequirementDetailsType[]) this.buyerRequirementDetails.toArray(new SiteBuyerRequirementDetailsType[this.buyerRequirementDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SiteBuyerRequirementDetailsType }
     *     
     */
    public SiteBuyerRequirementDetailsType getBuyerRequirementDetails(int idx) {
        if (this.buyerRequirementDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.buyerRequirementDetails.get(idx);
    }

    public int getBuyerRequirementDetailsLength() {
        if (this.buyerRequirementDetails == null) {
            return  0;
        }
        return this.buyerRequirementDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SiteBuyerRequirementDetailsType }
     *     
     */
    public void setBuyerRequirementDetails(SiteBuyerRequirementDetailsType[] values) {
        this._getBuyerRequirementDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.buyerRequirementDetails.add(values[i]);
        }
    }

    protected List<SiteBuyerRequirementDetailsType> _getBuyerRequirementDetails() {
        if (buyerRequirementDetails == null) {
            buyerRequirementDetails = new ArrayList<SiteBuyerRequirementDetailsType>();
        }
        return buyerRequirementDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SiteBuyerRequirementDetailsType }
     *     
     */
    public SiteBuyerRequirementDetailsType setBuyerRequirementDetails(int idx, SiteBuyerRequirementDetailsType value) {
        return this.buyerRequirementDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ListingFeatureDetailsType }
     *     
     */
    public ListingFeatureDetailsType[] getListingFeatureDetails() {
        if (this.listingFeatureDetails == null) {
            return new ListingFeatureDetailsType[ 0 ] ;
        }
        return ((ListingFeatureDetailsType[]) this.listingFeatureDetails.toArray(new ListingFeatureDetailsType[this.listingFeatureDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ListingFeatureDetailsType }
     *     
     */
    public ListingFeatureDetailsType getListingFeatureDetails(int idx) {
        if (this.listingFeatureDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listingFeatureDetails.get(idx);
    }

    public int getListingFeatureDetailsLength() {
        if (this.listingFeatureDetails == null) {
            return  0;
        }
        return this.listingFeatureDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ListingFeatureDetailsType }
     *     
     */
    public void setListingFeatureDetails(ListingFeatureDetailsType[] values) {
        this._getListingFeatureDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.listingFeatureDetails.add(values[i]);
        }
    }

    protected List<ListingFeatureDetailsType> _getListingFeatureDetails() {
        if (listingFeatureDetails == null) {
            listingFeatureDetails = new ArrayList<ListingFeatureDetailsType>();
        }
        return listingFeatureDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ListingFeatureDetailsType }
     *     
     */
    public ListingFeatureDetailsType setListingFeatureDetails(int idx, ListingFeatureDetailsType value) {
        return this.listingFeatureDetails.set(idx, value);
    }

    /**
     * Gets the value of the variationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VariationDetailsType }
     *     
     */
    public VariationDetailsType getVariationDetails() {
        return variationDetails;
    }

    /**
     * Sets the value of the variationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationDetailsType }
     *     
     */
    public void setVariationDetails(VariationDetailsType value) {
        this.variationDetails = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ExcludeShippingLocationDetailsType }
     *     
     */
    public ExcludeShippingLocationDetailsType[] getExcludeShippingLocationDetails() {
        if (this.excludeShippingLocationDetails == null) {
            return new ExcludeShippingLocationDetailsType[ 0 ] ;
        }
        return ((ExcludeShippingLocationDetailsType[]) this.excludeShippingLocationDetails.toArray(new ExcludeShippingLocationDetailsType[this.excludeShippingLocationDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ExcludeShippingLocationDetailsType }
     *     
     */
    public ExcludeShippingLocationDetailsType getExcludeShippingLocationDetails(int idx) {
        if (this.excludeShippingLocationDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.excludeShippingLocationDetails.get(idx);
    }

    public int getExcludeShippingLocationDetailsLength() {
        if (this.excludeShippingLocationDetails == null) {
            return  0;
        }
        return this.excludeShippingLocationDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ExcludeShippingLocationDetailsType }
     *     
     */
    public void setExcludeShippingLocationDetails(ExcludeShippingLocationDetailsType[] values) {
        this._getExcludeShippingLocationDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.excludeShippingLocationDetails.add(values[i]);
        }
    }

    protected List<ExcludeShippingLocationDetailsType> _getExcludeShippingLocationDetails() {
        if (excludeShippingLocationDetails == null) {
            excludeShippingLocationDetails = new ArrayList<ExcludeShippingLocationDetailsType>();
        }
        return excludeShippingLocationDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludeShippingLocationDetailsType }
     *     
     */
    public ExcludeShippingLocationDetailsType setExcludeShippingLocationDetails(int idx, ExcludeShippingLocationDetailsType value) {
        return this.excludeShippingLocationDetails.set(idx, value);
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(Calendar value) {
        this.updateTime = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RecoupmentPolicyDetailsType }
     *     
     */
    public RecoupmentPolicyDetailsType[] getRecoupmentPolicyDetails() {
        if (this.recoupmentPolicyDetails == null) {
            return new RecoupmentPolicyDetailsType[ 0 ] ;
        }
        return ((RecoupmentPolicyDetailsType[]) this.recoupmentPolicyDetails.toArray(new RecoupmentPolicyDetailsType[this.recoupmentPolicyDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RecoupmentPolicyDetailsType }
     *     
     */
    public RecoupmentPolicyDetailsType getRecoupmentPolicyDetails(int idx) {
        if (this.recoupmentPolicyDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recoupmentPolicyDetails.get(idx);
    }

    public int getRecoupmentPolicyDetailsLength() {
        if (this.recoupmentPolicyDetails == null) {
            return  0;
        }
        return this.recoupmentPolicyDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RecoupmentPolicyDetailsType }
     *     
     */
    public void setRecoupmentPolicyDetails(RecoupmentPolicyDetailsType[] values) {
        this._getRecoupmentPolicyDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.recoupmentPolicyDetails.add(values[i]);
        }
    }

    protected List<RecoupmentPolicyDetailsType> _getRecoupmentPolicyDetails() {
        if (recoupmentPolicyDetails == null) {
            recoupmentPolicyDetails = new ArrayList<RecoupmentPolicyDetailsType>();
        }
        return recoupmentPolicyDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RecoupmentPolicyDetailsType }
     *     
     */
    public RecoupmentPolicyDetailsType setRecoupmentPolicyDetails(int idx, RecoupmentPolicyDetailsType value) {
        return this.recoupmentPolicyDetails.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingCategoryDetailsType }
     *     
     */
    public ShippingCategoryDetailsType[] getShippingCategoryDetails() {
        if (this.shippingCategoryDetails == null) {
            return new ShippingCategoryDetailsType[ 0 ] ;
        }
        return ((ShippingCategoryDetailsType[]) this.shippingCategoryDetails.toArray(new ShippingCategoryDetailsType[this.shippingCategoryDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingCategoryDetailsType }
     *     
     */
    public ShippingCategoryDetailsType getShippingCategoryDetails(int idx) {
        if (this.shippingCategoryDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingCategoryDetails.get(idx);
    }

    public int getShippingCategoryDetailsLength() {
        if (this.shippingCategoryDetails == null) {
            return  0;
        }
        return this.shippingCategoryDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingCategoryDetailsType }
     *     
     */
    public void setShippingCategoryDetails(ShippingCategoryDetailsType[] values) {
        this._getShippingCategoryDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingCategoryDetails.add(values[i]);
        }
    }

    protected List<ShippingCategoryDetailsType> _getShippingCategoryDetails() {
        if (shippingCategoryDetails == null) {
            shippingCategoryDetails = new ArrayList<ShippingCategoryDetailsType>();
        }
        return shippingCategoryDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCategoryDetailsType }
     *     
     */
    public ShippingCategoryDetailsType setShippingCategoryDetails(int idx, ShippingCategoryDetailsType value) {
        return this.shippingCategoryDetails.set(idx, value);
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsType }
     *     
     */
    public ProductDetailsType getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsType }
     *     
     */
    public void setProductDetails(ProductDetailsType value) {
        this.productDetails = value;
    }

}
