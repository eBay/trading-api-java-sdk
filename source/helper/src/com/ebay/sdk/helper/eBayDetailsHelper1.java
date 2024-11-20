/*
 * Copyright (c) 2024 eBay Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.ebay.sdk.helper;

import java.util.HashMap;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.call.GeteBayDetailsCall;
import com.ebay.soap.eBLBaseComponents.BuyerPaymentMethodCodeType;
import com.ebay.soap.eBLBaseComponents.CountryCodeType;
import com.ebay.soap.eBLBaseComponents.CountryDetailsType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyDetailsType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.DetailNameCodeType;
import com.ebay.soap.eBLBaseComponents.DispatchTimeMaxDetailsType;
import com.ebay.soap.eBLBaseComponents.GeteBayDetailsResponseType;
import com.ebay.soap.eBLBaseComponents.PaymentOptionDetailsType;
import com.ebay.soap.eBLBaseComponents.RegionDetailsType;
import com.ebay.soap.eBLBaseComponents.ShippingLocationDetailsType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceDetailsType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;
import com.ebay.soap.eBLBaseComponents.SiteDetailsType;
import com.ebay.soap.eBLBaseComponents.TaxJurisdictionType;
import com.ebay.soap.eBLBaseComponents.TimeZoneDetailsType;
import com.ebay.soap.eBLBaseComponents.URLDetailsType;
import com.ebay.soap.eBLBaseComponents.URLTypeCodeType;

public class eBayDetailsHelper1 {
    private static eBayDetailsHelper1 _helper;
    /* Contains site related hash maps of details arrays by detail name */
    private static HashMap _SiteRelatedDetailsByName = new HashMap(5);
    /* Contains site related hash maps of details maps by detail name */
    private static HashMap _SiteRelatedDetailsMapsByName = new HashMap(5);
    /*
     * Details about a specific country.
     * GeteBayDetails returns all countries in the system,
     * regardless of the site to which you sent the request.
     */
    private static HashMap _CountryDetailsByCountry = new HashMap();
    /*
     * Details about a specific currency that can be used for listing on an eBay site.
     * GeteBayDetails returns all site currencies in the system,
     * regardless of the site to which you sent the request
     */
    private static HashMap _CurrencyDetailsByCurrency = new HashMap();
    /*
     * Details about a specific max dispatch time.
     * A dispatch time specifies the maximum number of business days a seller commits to for shipping an item to domestic buyers after receiving a cleared payment.
     * GeteBayDetails returns all dispatch times in the system,
     * regardless of the site to which you sent the request
     */
    private static HashMap _DispatchTimeMaxDetailsByDispatchTimeMax = new HashMap();
    /*
     * Details about a location or region to which the seller is willing to ship.
     * GeteBayDetails returns all shipping locations in the system,
     * regardless of the site to which you sent the request
     */
    private static HashMap _ShippingLocationDetailsByShippingLocation = new HashMap();
    /*
     * Details about a specific eBay site.
     * GeteBayDetails returns all sites in the system,
     * regardless of the site to which you sent the request.
     */
    private static HashMap _SiteDetailsBySite = new HashMap();
    private static HashMap _TimeZoneDetails = new HashMap();
    /*
     * Details about a specific buyer payment method.
     * GeteBayDetails only returns payment methods
     * that are applicable to the site to which you sent the request
     */
    private static HashMap _PaymentOptionDetailsMapsBySite = new HashMap(); // details by payment method

    /* The following details are NOT site specific: */
    private static HashMap _PaymentOptionDetailsBySite = new HashMap();
    /*
     * Details about a specific geographical region.
     * GeteBayDetails only returns regions that are applicable to the site to which you sent the request.
     * However, you should ignore region values for all sites except China.
     */
    //	private static HashMap _RegionDetailsByRegionID = new HashMap();
    private static HashMap _RegionDetailsMapsBySite = new HashMap();
    private static HashMap _RegionDetailsBySite = new HashMap();
    /*
     * Details about a specific shipping service.
     * GeteBayDetails only returns shipping services
     * that are applicable to the site to which you sent the request.
     */
    //	private static HashMap _ShippingServiceDetailsByShippingServiceID = new HashMap();
    private static HashMap _ShippingServiceDetailsMapsBySite = new HashMap();
    private static HashMap _ShippingServiceDetailsBySite = new HashMap();
    /*
     * Details about a specific tax jurisdiction or tax region.
     * GeteBayDetails only returns jurisdictions
     * that are applicable to the site to which you sent the request.
     */
    //	private static HashMap _TaxJurisdictionDetailsByJurisdictionID = new HashMap();
    private static HashMap _TaxJurisdictionDetailsMapsBySite = new HashMap();
    private static HashMap _TaxJurisdictionDetailsBySite = new HashMap();
    /*
     * URLDetails Details about a specific eBay URL.
     * GeteBayDetails only returns URLs
     * that are applicable to the site to which you sent the request.
     */
    private static HashMap _URLDetailsMapsBySite = new HashMap();
    private static HashMap _URLDetailsBySite = new HashMap();
    private ApiContext _apiContext;
    private SiteCodeType _site;
    private DetailNameCodeType[] _siteIndependentDetailNames = {
        DetailNameCodeType.COUNTRY_DETAILS, DetailNameCodeType.CURRENCY_DETAILS,
        DetailNameCodeType.DISPATCH_TIME_MAX_DETAILS,
        DetailNameCodeType.SHIPPING_LOCATION_DETAILS,
        DetailNameCodeType.SITE_DETAILS, DetailNameCodeType.TIME_ZONE_DETAILS };

    /* The following details are site specific: */
    private DetailNameCodeType _siteRelatedDetailNames[] = {
        DetailNameCodeType.PAYMENT_OPTION_DETAILS,
        DetailNameCodeType.REGION_DETAILS,
        DetailNameCodeType.SHIPPING_SERVICE_DETAILS,
        DetailNameCodeType.TAX_JURISDICTION, DetailNameCodeType.URL_DETAILS };
    private CountryDetailsType[] _countryDetails = null;
    private CurrencyDetailsType[] _currencyDetails = null;
    private DispatchTimeMaxDetailsType[] _dispatchTimeMaxDetails = null;
    private ShippingLocationDetailsType[] _shippingLocationDetails = null;
    private SiteDetailsType[] _siteDetails = null;
    private TimeZoneDetailsType[] _timeZoneDetails = null;
    private RegionDetailsType[] _regionDetails = null;
    private ShippingServiceDetailsType[] _shippingServiceDetails = null;
    private TaxJurisdictionType[] _taxJurisdictionDetails = null;

    private eBayDetailsHelper1() {
    }

    private eBayDetailsHelper1(ApiContext context)
        throws SdkException, Exception {
        _apiContext = context;
        _site = _apiContext.getSite();
        loadSiteIndependentDetails();
        initializeHashMaps();
        loadSiteRelatedDetailsForSite(_site);
    }

    public static eBayDetailsHelper1 getInstance(ApiContext context)
        throws SdkException, Exception {
        if (_helper == null) {
            _helper = new eBayDetailsHelper1(context);
        }
        return _helper;
    }

    public PaymentOptionDetailsType[] getPaymentOptionDetailsForSite(
        SiteCodeType site) throws SdkException, Exception {
        HashMap detalisMap = (HashMap) _SiteRelatedDetailsByName.get(
            DetailNameCodeType.PAYMENT_OPTION_DETAILS);
        if (!detalisMap.containsKey(site)) {
            loadPaymentOptionsDetailsForSite(site);
        }
        return (PaymentOptionDetailsType[]) detalisMap.get(site);
    }

    public PaymentOptionDetailsType getPaymentOptionDetailsBySiteAndPaymentMethod(
        SiteCodeType site, BuyerPaymentMethodCodeType paymentMethod)
        throws SdkException, Exception {
        HashMap detailsMap = (HashMap) _SiteRelatedDetailsMapsByName.get(
            DetailNameCodeType.PAYMENT_OPTION_DETAILS);
        if (!detailsMap.containsKey(site)) {
            loadPaymentOptionsDetailsForSite(site);
        }
        HashMap byPaymentMethodMap = (HashMap) detailsMap.get(site);
        return (PaymentOptionDetailsType) byPaymentMethodMap.get(paymentMethod);
    }

    private void loadPaymentOptionsDetailsForSite(
        GeteBayDetailsResponseType resp, SiteCodeType site)
        throws SdkException, Exception {
        if (resp == null) {
            DetailNameCodeType[] detailNames = {
                DetailNameCodeType.PAYMENT_OPTION_DETAILS };
            resp = makeApiCall(detailNames, site);
        }
        PaymentOptionDetailsType[] details = resp.getPaymentOptionDetails();
        if (details != null) {
            _PaymentOptionDetailsBySite.put(site, details);
            HashMap detailsByPaymentMethodMap = new HashMap(details.length);
            for (int i = 0; i < details.length; i++) {
                PaymentOptionDetailsType detail = details[i];
                detailsByPaymentMethodMap.put(detail.getPaymentOption(),
                    detail);
            }
            _PaymentOptionDetailsMapsBySite.put(site,
                detailsByPaymentMethodMap);
        }
    }

    private void loadPaymentOptionsDetailsForSite(SiteCodeType site)
        throws SdkException, Exception {
        loadPaymentOptionsDetailsForSite(null, site);
    }

    public RegionDetailsType[] getRegionDetailsForSite(SiteCodeType site)
        throws SdkException, Exception {
        return null;
    }

    public RegionDetailsType getRegionDetailsBySiteAndRegionID(
        SiteCodeType site, String regionId) throws SdkException, Exception {
        return null;
    }

    public ShippingServiceDetailsType[] getShippingServiceDetailsForSite(
        SiteCodeType site) throws SdkException, Exception {
        return null;
    }

    public ShippingServiceDetailsType getShippingServiceDetailsBySiteAndShippingServiceID(
        SiteCodeType site, Integer shippingServiceID)
        throws SdkException, Exception {
        return null;
    }

    public TaxJurisdictionType[] getTaxJurisdictionDetailsForSite(
        SiteCodeType site) throws SdkException, Exception {
        return null;
    }

    public TaxJurisdictionType getTaxJurisdictionDetailsBySiteAndJurisdictionID(
        SiteCodeType site, String jurisdictionID)
        throws SdkException, Exception {
        return null;
    }

    public URLDetailsType[] getURLDetailsForSite(SiteCodeType site)
        throws SdkException, Exception {
        HashMap detalisMap = (HashMap) _SiteRelatedDetailsByName.get(
            DetailNameCodeType.URL_DETAILS);
        if (!detalisMap.containsKey(site)) {
            loadURLDetailsForSite(site);
        }
        return (URLDetailsType[]) detalisMap.get(site);
    }

    public URLDetailsType getURLDetailsBySiteAndURLType(SiteCodeType site,
        URLTypeCodeType URLType) throws SdkException, Exception {
        HashMap detailsMap = (HashMap) _SiteRelatedDetailsMapsByName.get(
            DetailNameCodeType.URL_DETAILS);
        if (!detailsMap.containsKey(site)) {
            loadURLDetailsForSite(site);
        }
        HashMap byCodeTypeMap = (HashMap) detailsMap.get(site);
        return (URLDetailsType) byCodeTypeMap.get(URLType);
    }

    private void loadURLDetailsForSite(GeteBayDetailsResponseType resp,
        SiteCodeType site) throws SdkException, Exception {
        if (resp == null) {
            DetailNameCodeType[] detailNames = {
                DetailNameCodeType.URL_DETAILS };
            resp = makeApiCall(detailNames, site);
        }
        URLDetailsType[] urlDetails = resp.getURLDetails();
        if (urlDetails != null) {
            _URLDetailsBySite.put(site, urlDetails);
            HashMap detailsByURLTypeMap = new HashMap(urlDetails.length);
            for (int i = 0; i < urlDetails.length; i++) {
                URLDetailsType detail = urlDetails[i];
                detailsByURLTypeMap.put(detail.getURLType(), detail);
            }
            _URLDetailsMapsBySite.put(site, detailsByURLTypeMap);
        }
    }

    private void loadURLDetailsForSite(SiteCodeType site)
        throws SdkException, Exception {
        loadURLDetailsForSite(null, site);
    }

    private void loadSiteRelatedDetailsForSite(SiteCodeType site)
        throws SdkException, Exception {
        GeteBayDetailsResponseType resp = makeApiCall(_siteRelatedDetailNames,
            site);
        _taxJurisdictionDetails = resp.getTaxJurisdiction();
        _shippingServiceDetails = resp.getShippingServiceDetails();
        _regionDetails = resp.getRegionDetails();

        loadPaymentOptionsDetailsForSite(resp, site);
        loadURLDetailsForSite(resp, site);
        loadTaxJurisdictionDetailsForSite(resp, site);
        loadShippingServiceDetailsForSite(resp, site);
        loadRegionDetailsForSite(resp, site);
    }

    private void loadTaxJurisdictionDetailsForSite(
        GeteBayDetailsResponseType resp, SiteCodeType site)
        throws SdkException, Exception {
    }

    private void loadShippingServiceDetailsForSite(
        GeteBayDetailsResponseType resp, SiteCodeType site)
        throws SdkException, Exception {
    }

    private void loadRegionDetailsForSite(GeteBayDetailsResponseType resp,
        SiteCodeType site) throws SdkException, Exception {
    }

    private GeteBayDetailsResponseType makeApiCall(
        DetailNameCodeType[] detailNames, SiteCodeType site)
        throws SdkException, Exception {
        SiteCodeType savedSite = _site;
        if (site != null) {
            _apiContext.setSite(site);
        }
        GeteBayDetailsCall api = new GeteBayDetailsCall(_apiContext);
        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        api.setDetailLevel(detailLevels);
        if (detailNames != null) {
            api.setDetailName(detailNames);
        }
        api.geteBayDetails();
        _apiContext.setSite(savedSite);

        return api.getReturnedeBayDetails();
    }

    private void loadSiteIndependentDetails() throws SdkException, Exception {
        GeteBayDetailsResponseType resp = makeApiCall(
            _siteIndependentDetailNames, null);
        _countryDetails = resp.getCountryDetails();
        loadCountryDetails(_countryDetails);
        _currencyDetails = resp.getCurrencyDetails();
        loadCurrencyDetails(_currencyDetails);
        _dispatchTimeMaxDetails = resp.getDispatchTimeMaxDetails();
        loadDispatchTimeMaxDetails(_dispatchTimeMaxDetails);
        _shippingLocationDetails = resp.getShippingLocationDetails();
        loadShippingLocationDetails(_shippingLocationDetails);
        _siteDetails = resp.getSiteDetails();
        loadSiteDetails(_siteDetails);
        _timeZoneDetails = resp.getTimeZoneDetails();
        loadTimeZoneDetails(_timeZoneDetails);
    }

    public CountryDetailsType getTimeZoneDetailsByZone(String zoneId) {
        return (CountryDetailsType) _TimeZoneDetails.get(zoneId);
    }

    public TimeZoneDetailsType[] getTimeZoneDetails() {
        return _timeZoneDetails;
    }

    private void loadTimeZoneDetails(TimeZoneDetailsType[] details) {
        if (_TimeZoneDetails.isEmpty()) {
            for (int i = 0; i < details.length; i++) {
                TimeZoneDetailsType detail = details[i];
                _TimeZoneDetails.put(detail.getTimeZoneID(), detail);
            }
        }
    }

    public ShippingLocationDetailsType loadShippingLocationDetailsByShippingLocation(
        String shippingLocation) {
        return (ShippingLocationDetailsType) _ShippingLocationDetailsByShippingLocation.get(
            shippingLocation);
    }

    public ShippingLocationDetailsType[] getShippingLocationDetails() {
        return _shippingLocationDetails;
    }

    private void loadShippingLocationDetails(
        ShippingLocationDetailsType[] details) {
        if (_ShippingLocationDetailsByShippingLocation.isEmpty()) {
            for (int i = 0; i < details.length; i++) {
                ShippingLocationDetailsType detail = details[i];
                _ShippingLocationDetailsByShippingLocation.put(
                    detail.getShippingLocation(), detail);
            }
        }
    }

    public SiteDetailsType getSiteDetailsBySite(SiteCodeType site) {
        return (SiteDetailsType) _SiteDetailsBySite.get(site);
    }

    public SiteDetailsType[] getSiteDetails() {
        return _siteDetails;
    }

    private void loadSiteDetails(SiteDetailsType[] details) {
        if (_SiteDetailsBySite.isEmpty()) {
            for (int i = 0; i < details.length; i++) {
                SiteDetailsType site = details[i];
                _SiteDetailsBySite.put(site.getSite(), site);
            }
        }
    }

    public DispatchTimeMaxDetailsType getDispatchTimeMaxDetailsByDispatchTimeMax(
        Integer dispatchTimeMax) {
        return (DispatchTimeMaxDetailsType) _DispatchTimeMaxDetailsByDispatchTimeMax.get(
            dispatchTimeMax);
    }

    public DispatchTimeMaxDetailsType[] getDispatchTimeMaxDetails() {
        return _dispatchTimeMaxDetails;
    }

    private void loadDispatchTimeMaxDetails(
        DispatchTimeMaxDetailsType[] details) {
        if (_DispatchTimeMaxDetailsByDispatchTimeMax.isEmpty()) {
            for (int i = 0; i < details.length; i++) {
                DispatchTimeMaxDetailsType dispatch = details[i];
                _DispatchTimeMaxDetailsByDispatchTimeMax.put(
                    dispatch.getDispatchTimeMax(), dispatch);
            }
        }
    }

    public CurrencyDetailsType getCurrencyDetailsByCurrencyCode(
        CurrencyCodeType currencyCode) {
        return (CurrencyDetailsType) _CurrencyDetailsByCurrency.get(
            currencyCode);
    }

    public CurrencyDetailsType[] getCurrencyDetails() {
        return _currencyDetails;
    }

    private void loadCurrencyDetails(CurrencyDetailsType[] details) {
        if (_CurrencyDetailsByCurrency.isEmpty()) {
            for (int i = 0; i < details.length; i++) {
                CurrencyDetailsType currency = details[i];
                _CurrencyDetailsByCurrency.put(currency.getCurrency(),
                    currency);
            }
        }
    }

    public CountryDetailsType getCountryDetailsByCountryCode(
        CountryCodeType countryCode) {
        return (CountryDetailsType) _CountryDetailsByCountry.get(countryCode);
    }

    public CountryDetailsType[] getCountryDetails() {
        return _countryDetails;
    }

    private void loadCountryDetails(CountryDetailsType[] details) {
        if (_CountryDetailsByCountry.isEmpty()) {
            for (int i = 0; i < details.length; i++) {
                CountryDetailsType detail = details[i];
                _CountryDetailsByCountry.put(detail.getCountry(), detail);
            }
        }
    }

    private void initializeHashMaps() {
        _SiteRelatedDetailsByName.put(DetailNameCodeType.PAYMENT_OPTION_DETAILS,
            _PaymentOptionDetailsBySite);
        _SiteRelatedDetailsMapsByName.put(
            DetailNameCodeType.PAYMENT_OPTION_DETAILS,
            _PaymentOptionDetailsMapsBySite);
        //
        _SiteRelatedDetailsByName.put(DetailNameCodeType.REGION_DETAILS,
            _RegionDetailsBySite);
        _SiteRelatedDetailsMapsByName.put(DetailNameCodeType.REGION_DETAILS,
            _RegionDetailsMapsBySite);
        //
        _SiteRelatedDetailsByName.put(
            DetailNameCodeType.SHIPPING_SERVICE_DETAILS,
            _ShippingServiceDetailsBySite);
        _SiteRelatedDetailsMapsByName.put(
            DetailNameCodeType.SHIPPING_SERVICE_DETAILS,
            _ShippingServiceDetailsMapsBySite);
        //
        _SiteRelatedDetailsByName.put(DetailNameCodeType.TAX_JURISDICTION,
            _TaxJurisdictionDetailsBySite);
        _SiteRelatedDetailsMapsByName.put(DetailNameCodeType.TAX_JURISDICTION,
            _TaxJurisdictionDetailsMapsBySite);
        //
        _SiteRelatedDetailsByName.put(DetailNameCodeType.URL_DETAILS,
            _URLDetailsBySite);
        _SiteRelatedDetailsMapsByName.put(DetailNameCodeType.URL_DETAILS,
            _URLDetailsMapsBySite);
    }

}
