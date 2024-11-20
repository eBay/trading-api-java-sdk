
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBaySubscriptionTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EBaySubscriptionTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SellerAssistant"/>
 *     &lt;enumeration value="SellerAssistantPro"/>
 *     &lt;enumeration value="EBayStoreBasic"/>
 *     &lt;enumeration value="EBayStoreFeatured"/>
 *     &lt;enumeration value="EBayStoreAnchor"/>
 *     &lt;enumeration value="SellingManager"/>
 *     &lt;enumeration value="SellingManagerPro"/>
 *     &lt;enumeration value="PictureManagerLevel1"/>
 *     &lt;enumeration value="PictureManagerLevel2"/>
 *     &lt;enumeration value="PictureManagerLevel3"/>
 *     &lt;enumeration value="PictureManagerLevel4"/>
 *     &lt;enumeration value="PictureManagerLevel5"/>
 *     &lt;enumeration value="PictureManagerLevel6"/>
 *     &lt;enumeration value="PictureManagerLevel7"/>
 *     &lt;enumeration value="SellerReportsBasic"/>
 *     &lt;enumeration value="SellerReportsPlus"/>
 *     &lt;enumeration value="FileExchange"/>
 *     &lt;enumeration value="LocalMarketSpecialty"/>
 *     &lt;enumeration value="LocalMarketRegular"/>
 *     &lt;enumeration value="LocalMarketPremium"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "EBaySubscriptionTypeCodeType")
@XmlEnum
public enum EBaySubscriptionTypeCodeType {


    /**
     * 
     * 						This eBay subscription is no longer available.
     * 				  
     * 
     */
    @XmlEnumValue("SellerAssistant")
    SELLER_ASSISTANT("SellerAssistant"),

    /**
     * 
     * 						This eBay subscription is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("SellerAssistantPro")
    SELLER_ASSISTANT_PRO("SellerAssistantPro"),

    /**
     * 
     * 						This value indicates that the user has a Basic eBay Store membership. See the <a href="http://pages.ebay.com/sellerinformation/stores/Subscriptions.html" target="_blank">Welcome to eBay Stores</a> help page for more information on eBay Store subscriptions.
     * 					
     * 
     */
    @XmlEnumValue("EBayStoreBasic")
    E_BAY_STORE_BASIC("EBayStoreBasic"),

    /**
     * 
     * 						This value indicates that the user has a Premium eBay Store membership. See the <a href="http://pages.ebay.com/sellerinformation/stores/Subscriptions.html" target="_blank">Welcome to eBay Stores</a> help page for more information on eBay Store subscriptions.
     * 					
     * 
     */
    @XmlEnumValue("EBayStoreFeatured")
    E_BAY_STORE_FEATURED("EBayStoreFeatured"),

    /**
     * 
     * 						This value indicates that the user has a Anchor eBay Store membership. See the <a href="http://pages.ebay.com/sellerinformation/stores/Subscriptions.html" target="_blank">Welcome to eBay Stores</a> help page for more information on eBay Store subscriptions.
     * 					
     * 
     */
    @XmlEnumValue("EBayStoreAnchor")
    E_BAY_STORE_ANCHOR("EBayStoreAnchor"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					 
     * 
     */
    @XmlEnumValue("SellingManager")
    SELLING_MANAGER("SellingManager"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					 
     * 
     */
    @XmlEnumValue("SellingManagerPro")
    SELLING_MANAGER_PRO("SellingManagerPro"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed.
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel1")
    PICTURE_MANAGER_LEVEL_1("PictureManagerLevel1"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed.
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel2")
    PICTURE_MANAGER_LEVEL_2("PictureManagerLevel2"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed.
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel3")
    PICTURE_MANAGER_LEVEL_3("PictureManagerLevel3"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed.
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel4")
    PICTURE_MANAGER_LEVEL_4("PictureManagerLevel4"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed.
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel5")
    PICTURE_MANAGER_LEVEL_5("PictureManagerLevel5"),

    /**
     * 
     * 					  This value is no longer applicable because Picture Manager has been EOLed.
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel6")
    PICTURE_MANAGER_LEVEL_6("PictureManagerLevel6"),

    /**
     * 
     * 			  This value is no longer applicable because Picture Manager has been EOLed.
     * 					 
     * 
     */
    @XmlEnumValue("PictureManagerLevel7")
    PICTURE_MANAGER_LEVEL_7("PictureManagerLevel7"),

    /**
     * 
     * 						Basic Sales Reports are no longer available. Sellers should subscribe to Sales Reports Plus instead.
     * 					 
     * 
     */
    @XmlEnumValue("SellerReportsBasic")
    SELLER_REPORTS_BASIC("SellerReportsBasic"),

    /**
     * 
     * 						This value indicates that the user has a Sales Reports Plus subscription. A user can subscribe to Sales Report Plus through the <b>Subscriptions</b> section of My eBay.
     * 					 
     * 
     */
    @XmlEnumValue("SellerReportsPlus")
    SELLER_REPORTS_PLUS("SellerReportsPlus"),

    /**
     * 
     * 						This value indicates that the user has opted in to Seller Hub Reports (formerly known as File Exchange). Users can opt in to Seller Hub Reports through the <b>Reports</b> section on Seller Hub. See the <a href="https://www.ebay.com/help/selling/selling-tools/file-exchange?id=4096" target="_blank">Seller Hub Reports</a> help page for more information.
     * 					 
     * 
     */
    @XmlEnumValue("FileExchange")
    FILE_EXCHANGE("FileExchange"),

    /**
     * 
     * 						This value indicates that the Motors Dealer has a Local Market Specialty subscription. This type of account is used to sell in the Motorcycles, Powersports, and Other Vehicles and Trailers categories. Not Cars and Trucks.
     * 					 
     * 
     */
    @XmlEnumValue("LocalMarketSpecialty")
    LOCAL_MARKET_SPECIALTY("LocalMarketSpecialty"),

    /**
     * 
     * 						This value indicates that the Motors Dealer has a Local Market Regular  subscription. This type of account is used to sell in all eBay Motors categories.
     * 					 
     * 
     */
    @XmlEnumValue("LocalMarketRegular")
    LOCAL_MARKET_REGULAR("LocalMarketRegular"),

    /**
     * 
     * 						This value indicates that the Motors Dealer has a Local Market Premium  subscription. This type of account is used to sell in all eBay Motors categories.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketPremium")
    LOCAL_MARKET_PREMIUM("LocalMarketPremium"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    EBaySubscriptionTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EBaySubscriptionTypeCodeType fromValue(String v) {
        for (EBaySubscriptionTypeCodeType c: EBaySubscriptionTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
