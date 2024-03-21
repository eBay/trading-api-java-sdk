
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GalleryTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GalleryTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Featured"/>
 *     &lt;enumeration value="Gallery"/>
 *     &lt;enumeration value="Plus"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "GalleryTypeCodeType")
@XmlEnum
public enum GalleryTypeCodeType {


    /**
     * 
     * 						Gallery is supported free on all sites. So this field is useful only for removing an existing feature setting when using <b>RelistItem</b>.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Highlights the listing by randomly placing it at the top of the search results.
     * 						When the Featured First listing upgrade is selected for an item listing, the listing also automatically gets the
     * 						Gallery and Plus functionality at no extra cost.
     * 						<br><br>
     * 						A user can see if a site supports the Featured First listing upgrade by using the <b>GeteBayDetails</b> call and passing in <code>ListingFeatureDetails</code> in the <b>DetailName</b> field. In the response, the value of the <b>ListingFeatureDetails.FeaturedFirst</b> field will show a value other than <code>Disabled</code> if the eBay site supports the Featured First listing upgrade.
     * 						<br/><br/>
     * 						<span class="tablenote"><strong>Note:</strong>
     * 							The Featured First listing upgrade can no longer be used for new listings or revising existing listings in any eBay marketplace. If this value is used in an Add/Revise/Relist call, sellers will get a warning message about this value/feature being deprecated.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Featured")
    FEATURED("Featured"),

    /**
     * 
     * 						 This feature, which is free on all sites, adds a Gallery image in the search results. A Gallery image is an image that was uploaded and copied to EPS (eBay Picture Service). This copy is stored  for 30 days or until the image is associated with a listing. Once the image is associated with a listing, the period is extended to 90 days after the item's sale_end date  and is extended again if the item is relisted or used in subsequent listings.  As part of storing a copy, EPS also makes additional sizes available (thumbnail,  main image, supersize,  popup, etc.), which are used by the various Gallery enhancements.
     * 						 <br/><br/>
     * 						 All images must comply to the <a href="https://developer.ebay.com/DevZone/guides/features-guide/default.html#development/Pictures-Intro.html">Picture Requirements.</a>
     * 					
     * 
     */
    @XmlEnumValue("Gallery")
    GALLERY("Gallery"),

    /**
     * 
     * 						Adds a Gallery Plus icon to the listing.
     * 						<br/><br/>
     * 						When Plus is selected in a request that specifies at least two images (using ItemType.PictureDetailsType.PictureURL), the Gallery Plus feature automatically includes a Gallery Showcase of all the listing's images.
     * 						<br><br>
     * 						The Gallery Showcase displays when hovering over or clicking on the listing's Gallery Plus icon in the search results. The Showcase window displays a large (400px x 400px) preview image which is first image specified PictureURL, as well as up to 11 (64 px x 64 px) selectable thumbnails for the remaining EPS images. Clicking on the preview image displays the item's listing page.
     * 						<br/><br/>
     * 						If Plus is selected and the request includes only one EPS image or any self-hosted images, the listing includes a Gallery Plus icon that, when hovered over or clicked, displays a large (400px x 400px) preview image of the item. Clicking the image displays the View Item page for that listing.
     * 						<br><br>
     * 						When using RelistItem or ReviseItem (item has no bids and more than 12 hours before the listing's end), Plus can be unselected in the request. However, the Plus fee will still apply if a previous request selected Plus. There is at most one Plus fee per listing.
     * 						<br><br>
     * 						When "Plus" is included in an item listing, the listing also automatically gets the
     * 						Gallery functionality at no extra cost. "Gallery" does not need to be specified
     * 						separately in the listing.
     * 						<br><br>
     * 						Listing images that are originally smaller than 400px x 400px are centered in the
     * 						preview frame. Images that are originally larger than 400px x 400px are scaled down
     * 						to 400px on their longest side (maintaining their original aspect ratio).
     * 					
     * 
     */
    @XmlEnumValue("Plus")
    PLUS("Plus"),

    /**
     * 
     * 						Reserved for internal use <b>only</b>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GalleryTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GalleryTypeCodeType fromValue(String v) {
        for (GalleryTypeCodeType c: GalleryTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
