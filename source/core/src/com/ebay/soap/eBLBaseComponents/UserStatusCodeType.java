
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Unconfirmed"/>
 *     &lt;enumeration value="Ghost"/>
 *     &lt;enumeration value="InMaintenance"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="CreditCardVerify"/>
 *     &lt;enumeration value="AccountOnHold"/>
 *     &lt;enumeration value="Merged"/>
 *     &lt;enumeration value="RegistrationCodeMailOut"/>
 *     &lt;enumeration value="TermPending"/>
 *     &lt;enumeration value="UnconfirmedHalfOptIn"/>
 *     &lt;enumeration value="CreditCardVerifyHalfOptIn"/>
 *     &lt;enumeration value="UnconfirmedPassport"/>
 *     &lt;enumeration value="CreditCardVerifyPassport"/>
 *     &lt;enumeration value="UnconfirmedExpress"/>
 *     &lt;enumeration value="Guest"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "UserStatusCodeType")
@XmlEnum
public enum UserStatusCodeType {


    /**
     * 
     * 						This value indicates that the status of the user's eBay account is unknown. This value should seldom, if ever, be returned and typically represents a problem.
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						This value indicates that the eBay user's account is suspended. A user with a suspended account cannot participate in buying or selling activity.
     * 					
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * 
     * 						This value indicates that the eBay user's account is a confirmed, active account.
     * 					
     * 
     */
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),

    /**
     * 
     * 						This value indicates that the eBay User has completed online registration, but has either not responded to confirmation email or has not yet been sent the confirmation email. Or, if this user began registration as a seller but did not complete it, the user will have this status. A seller with this status can begin to list an item but cannot complete the listing until the seller completes seller registration.
     * 					
     * 
     */
    @XmlEnumValue("Unconfirmed")
    UNCONFIRMED("Unconfirmed"),

    /**
     * 
     * 						This value indicates that the user originally registered on AuctionWeb (pre-eBay), but that user never re-registered on eBay. Note that there are very few (if any) eBay accounts in the 'Ghost' state.
     * 					
     * 
     */
    @XmlEnumValue("Ghost")
    GHOST("Ghost"),

    /**
     * 
     * 						This value indicates that the eBay user's account is in maintenance mode.
     * 					
     * 
     */
    @XmlEnumValue("InMaintenance")
    IN_MAINTENANCE("InMaintenance"),

    /**
     * 
     * 						This value indicates that the eBay user's account has been deleted.
     * 					
     * 
     */
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),

    /**
     * 
     * 						This value indicates that the user has completed the registration and confirmation process, but needs to complete verification of credit card information. A user has this status if this user began registration as a seller but did not complete it. A seller with this status can begin to list an item but cannot complete the listing until the seller completes seller registration.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardVerify")
    CREDIT_CARD_VERIFY("CreditCardVerify"),

    /**
     * 
     * 						This value indicates that the eBay user's account is currently on hold. A common reason for a user's account to go on hold is a non-payment of the monthly eBay invoice. A user cannot sell or buy items if their account is on hold.
     * 					
     * 
     */
    @XmlEnumValue("AccountOnHold")
    ACCOUNT_ON_HOLD("AccountOnHold"),

    /**
     * 
     * 						This value indicates that the user record has been merged with another account record for the same user
     * 					
     * 
     */
    @XmlEnumValue("Merged")
    MERGED("Merged"),

    /**
     * 
     * 						This value indicates that the eBay User has completed online registration, and eBay has just sent the user a registration code in a confirmation email. The eBay user will have to respond to the confirmation email to get their account confirmed.
     * 					
     * 
     */
    @XmlEnumValue("RegistrationCodeMailOut")
    REGISTRATION_CODE_MAIL_OUT("RegistrationCodeMailOut"),

    /**
     * 
     * 						This value indicates that the user has scheduled an account closure but eBay has yet to process the closure request.
     * 					
     * 
     */
    @XmlEnumValue("TermPending")
    TERM_PENDING("TermPending"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> The Half.com site has been shut down, so this value is no longer applicable.
     * 						</span>
     * 						User has completed the registration for Half.com and opted
     * 						to automatically also be registered with eBay, but the
     * 						registration confirmation is still pending
     * 					
     * 
     */
    @XmlEnumValue("UnconfirmedHalfOptIn")
    UNCONFIRMED_HALF_OPT_IN("UnconfirmedHalfOptIn"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> The Half.com site has been shut down, so this value is no longer applicable.
     * 						</span>
     * 						User has completed the registration for Half.com and opted to automatically also be registered with eBay, but the user needs to complete verification of credit card information. A user has this status on eBay if this user began registration as a seller but did not complete it. A seller with this status can begin to list an item but cannot complete the listing until the seller completes seller registration.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardVerifyHalfOptIn")
    CREDIT_CARD_VERIFY_HALF_OPT_IN("CreditCardVerifyHalfOptIn"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("UnconfirmedPassport")
    UNCONFIRMED_PASSPORT("UnconfirmedPassport"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardVerifyPassport")
    CREDIT_CARD_VERIFY_PASSPORT("CreditCardVerifyPassport"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("UnconfirmedExpress")
    UNCONFIRMED_EXPRESS("UnconfirmedExpress"),

    /**
     * 
     * 						This value indicates that the user is a guest user. The user has not added a password and has not confirmed an email address.
     * 						The user has not signed up as a regular user, but has agreed to the User Agreement and Privacy Policy.
     * 						The user has been through the buying flow for a guest;
     * 						the user has been through checkout using the streamlined Buy-It-Now flow.
     * 					
     * 
     */
    @XmlEnumValue("Guest")
    GUEST("Guest"),

    /**
     * 
     * 						  Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UserStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserStatusCodeType fromValue(String v) {
        for (UserStatusCodeType c: UserStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
