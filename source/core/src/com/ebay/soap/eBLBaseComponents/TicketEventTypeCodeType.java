
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketEventTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketEventTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="DE_ComedyAndKabarett"/>
 *     &lt;enumeration value="DE_FreizeitAndEvents"/>
 *     &lt;enumeration value="DE_KonzerteAndFestivals"/>
 *     &lt;enumeration value="DE_KulturAndKlassik"/>
 *     &lt;enumeration value="DE_MusicalsAndShows"/>
 *     &lt;enumeration value="DE_Sportveranstaltungen"/>
 *     &lt;enumeration value="DE_Sonstige"/>
 *     &lt;enumeration value="UK_AmusementParks"/>
 *     &lt;enumeration value="UK_Comedy"/>
 *     &lt;enumeration value="UK_ConcertsAndGigs"/>
 *     &lt;enumeration value="UK_ConferencesAndSeminars"/>
 *     &lt;enumeration value="UK_ExhibitionsAndShows"/>
 *     &lt;enumeration value="UK_Experiences"/>
 *     &lt;enumeration value="UK_SportingEvents"/>
 *     &lt;enumeration value="UK_TheatreCinemaAndCircus"/>
 *     &lt;enumeration value="UK_Other"/>
 *     &lt;enumeration value="US_Concerts"/>
 *     &lt;enumeration value="US_Movies"/>
 *     &lt;enumeration value="US_SportingEvents"/>
 *     &lt;enumeration value="US_Theater"/>
 *     &lt;enumeration value="US_Other"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TicketEventTypeCodeType")
@XmlEnum
public enum TicketEventTypeCodeType {


    /**
     * 
     * 						(in) Any event (applicable to US, UK, and DE)
     * 					
     * 
     */
    @XmlEnumValue("Any")
    ANY("Any"),

    /**
     * 
     * 						(in) Comedy & Kabarett (Comedy and Cabaret)
     * 					
     * 
     */
    @XmlEnumValue("DE_ComedyAndKabarett")
    DE_COMEDY_AND_KABARETT("DE_ComedyAndKabarett"),

    /**
     * 
     * 						(in) Freizeit & Events (Leisure and Events)
     * 					
     * 
     */
    @XmlEnumValue("DE_FreizeitAndEvents")
    DE_FREIZEIT_AND_EVENTS("DE_FreizeitAndEvents"),

    /**
     * 
     * 						(in) Konzerte & Festivals (Concerts and Festivals)
     * 					
     * 
     */
    @XmlEnumValue("DE_KonzerteAndFestivals")
    DE_KONZERTE_AND_FESTIVALS("DE_KonzerteAndFestivals"),

    /**
     * 
     * 						(in) Kultur & Klassik (Culture and Classical)
     * 					
     * 
     */
    @XmlEnumValue("DE_KulturAndKlassik")
    DE_KULTUR_AND_KLASSIK("DE_KulturAndKlassik"),

    /**
     * 
     * 						(in) Musicals & Shows
     * 					
     * 
     */
    @XmlEnumValue("DE_MusicalsAndShows")
    DE_MUSICALS_AND_SHOWS("DE_MusicalsAndShows"),

    /**
     * 
     * 						(in) Sportveranstaltungen (Sporting Events)
     * 					
     * 
     */
    @XmlEnumValue("DE_Sportveranstaltungen")
    DE_SPORTVERANSTALTUNGEN("DE_Sportveranstaltungen"),

    /**
     * 
     * 						(in) Other events that are not the above Germany event types
     * 						(applicable to listings on the DE site)
     * 					
     * 
     */
    @XmlEnumValue("DE_Sonstige")
    DE_SONSTIGE("DE_Sonstige"),

    /**
     * 
     * 						(in) Amusement Parks (applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_AmusementParks")
    UK_AMUSEMENT_PARKS("UK_AmusementParks"),

    /**
     * 
     * 						(in) Comedy (applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_Comedy")
    UK_COMEDY("UK_Comedy"),

    /**
     * 
     * 						(in) Concerts/Gigs (applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_ConcertsAndGigs")
    UK_CONCERTS_AND_GIGS("UK_ConcertsAndGigs"),

    /**
     * 
     * 						(in) Conferences/Seminars (applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_ConferencesAndSeminars")
    UK_CONFERENCES_AND_SEMINARS("UK_ConferencesAndSeminars"),

    /**
     * 
     * 						(in) Exhibitions/Shows (applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_ExhibitionsAndShows")
    UK_EXHIBITIONS_AND_SHOWS("UK_ExhibitionsAndShows"),

    /**
     * 
     * 						(in) Experiences (applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_Experiences")
    UK_EXPERIENCES("UK_Experiences"),

    /**
     * 
     * 						(in) Sporting events (applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_SportingEvents")
    UK_SPORTING_EVENTS("UK_SportingEvents"),

    /**
     * 
     * 						(in) Theatre/Cinema/Circus (applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_TheatreCinemaAndCircus")
    UK_THEATRE_CINEMA_AND_CIRCUS("UK_TheatreCinemaAndCircus"),

    /**
     * 
     * 						(in) Other. Events that are not the above UK types
     * 						(applicable to listings on the UK site)
     * 					
     * 
     */
    @XmlEnumValue("UK_Other")
    UK_OTHER("UK_Other"),

    /**
     * 
     * 						(in) Concerts (applicable to listings on the US site)
     * 					
     * 
     */
    @XmlEnumValue("US_Concerts")
    US_CONCERTS("US_Concerts"),

    /**
     * 
     * 						(in) Movies (applicable to listings on the US site)
     * 					
     * 
     */
    @XmlEnumValue("US_Movies")
    US_MOVIES("US_Movies"),

    /**
     * 
     * 						(in) Sporting events (applicable to listings on the US site)
     * 					
     * 
     */
    @XmlEnumValue("US_SportingEvents")
    US_SPORTING_EVENTS("US_SportingEvents"),

    /**
     * 
     * 						(in) Theater (applicable to listings on the US site)
     * 					
     * 
     */
    @XmlEnumValue("US_Theater")
    US_THEATER("US_Theater"),

    /**
     * 
     * 						(in) Events that are not concerts,
     * 						movies, sporting events, or theater events
     * 						(applicable to listings on the US site)
     * 					
     * 
     */
    @XmlEnumValue("US_Other")
    US_OTHER("US_Other"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TicketEventTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketEventTypeCodeType fromValue(String v) {
        for (TicketEventTypeCodeType c: TicketEventTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
