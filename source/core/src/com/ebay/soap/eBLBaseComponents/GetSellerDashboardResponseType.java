
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
 * 				The base response type for the <b>GetSellerDashboard</b> call. This call retrieves seller performance data, including seller standards level, Power Seller status, Buyer Satisfaction status, eBay Search standing, and any seller fee discounts.
 * 			
 * 
 * <p>Java class for GetSellerDashboardResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerDashboardResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SearchStanding" type="{urn:ebay:apis:eBLBaseComponents}SearchStandingDashboardType" minOccurs="0"/>
 *         &lt;element name="SellerFeeDiscount" type="{urn:ebay:apis:eBLBaseComponents}SellerFeeDiscountDashboardType" minOccurs="0"/>
 *         &lt;element name="PowerSellerStatus" type="{urn:ebay:apis:eBLBaseComponents}PowerSellerDashboardType" minOccurs="0"/>
 *         &lt;element name="PolicyCompliance" type="{urn:ebay:apis:eBLBaseComponents}PolicyComplianceDashboardType" minOccurs="0"/>
 *         &lt;element name="BuyerSatisfaction" type="{urn:ebay:apis:eBLBaseComponents}BuyerSatisfactionDashboardType" minOccurs="0"/>
 *         &lt;element name="SellerAccount" type="{urn:ebay:apis:eBLBaseComponents}SellerAccountDashboardType" minOccurs="0"/>
 *         &lt;element name="Performance" type="{urn:ebay:apis:eBLBaseComponents}PerformanceDashboardType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerDashboardResponseType", propOrder = {
    "searchStanding",
    "sellerFeeDiscount",
    "powerSellerStatus",
    "policyCompliance",
    "buyerSatisfaction",
    "sellerAccount",
    "performance"
})
public class GetSellerDashboardResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SearchStanding")
    protected SearchStandingDashboardType searchStanding;
    @XmlElement(name = "SellerFeeDiscount")
    protected SellerFeeDiscountDashboardType sellerFeeDiscount;
    @XmlElement(name = "PowerSellerStatus")
    protected PowerSellerDashboardType powerSellerStatus;
    @XmlElement(name = "PolicyCompliance")
    protected PolicyComplianceDashboardType policyCompliance;
    @XmlElement(name = "BuyerSatisfaction")
    protected BuyerSatisfactionDashboardType buyerSatisfaction;
    @XmlElement(name = "SellerAccount")
    protected SellerAccountDashboardType sellerAccount;
    @XmlElement(name = "Performance")
    protected List<PerformanceDashboardType> performance;

    /**
     * Gets the value of the searchStanding property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStandingDashboardType }
     *     
     */
    public SearchStandingDashboardType getSearchStanding() {
        return searchStanding;
    }

    /**
     * Sets the value of the searchStanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStandingDashboardType }
     *     
     */
    public void setSearchStanding(SearchStandingDashboardType value) {
        this.searchStanding = value;
    }

    /**
     * Gets the value of the sellerFeeDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SellerFeeDiscountDashboardType }
     *     
     */
    public SellerFeeDiscountDashboardType getSellerFeeDiscount() {
        return sellerFeeDiscount;
    }

    /**
     * Sets the value of the sellerFeeDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerFeeDiscountDashboardType }
     *     
     */
    public void setSellerFeeDiscount(SellerFeeDiscountDashboardType value) {
        this.sellerFeeDiscount = value;
    }

    /**
     * Gets the value of the powerSellerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSellerDashboardType }
     *     
     */
    public PowerSellerDashboardType getPowerSellerStatus() {
        return powerSellerStatus;
    }

    /**
     * Sets the value of the powerSellerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSellerDashboardType }
     *     
     */
    public void setPowerSellerStatus(PowerSellerDashboardType value) {
        this.powerSellerStatus = value;
    }

    /**
     * Gets the value of the policyCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyComplianceDashboardType }
     *     
     */
    public PolicyComplianceDashboardType getPolicyCompliance() {
        return policyCompliance;
    }

    /**
     * Sets the value of the policyCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyComplianceDashboardType }
     *     
     */
    public void setPolicyCompliance(PolicyComplianceDashboardType value) {
        this.policyCompliance = value;
    }

    /**
     * Gets the value of the buyerSatisfaction property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerSatisfactionDashboardType }
     *     
     */
    public BuyerSatisfactionDashboardType getBuyerSatisfaction() {
        return buyerSatisfaction;
    }

    /**
     * Sets the value of the buyerSatisfaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerSatisfactionDashboardType }
     *     
     */
    public void setBuyerSatisfaction(BuyerSatisfactionDashboardType value) {
        this.buyerSatisfaction = value;
    }

    /**
     * Gets the value of the sellerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SellerAccountDashboardType }
     *     
     */
    public SellerAccountDashboardType getSellerAccount() {
        return sellerAccount;
    }

    /**
     * Sets the value of the sellerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerAccountDashboardType }
     *     
     */
    public void setSellerAccount(SellerAccountDashboardType value) {
        this.sellerAccount = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PerformanceDashboardType }
     *     
     */
    public PerformanceDashboardType[] getPerformance() {
        if (this.performance == null) {
            return new PerformanceDashboardType[ 0 ] ;
        }
        return ((PerformanceDashboardType[]) this.performance.toArray(new PerformanceDashboardType[this.performance.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PerformanceDashboardType }
     *     
     */
    public PerformanceDashboardType getPerformance(int idx) {
        if (this.performance == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.performance.get(idx);
    }

    public int getPerformanceLength() {
        if (this.performance == null) {
            return  0;
        }
        return this.performance.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PerformanceDashboardType }
     *     
     */
    public void setPerformance(PerformanceDashboardType[] values) {
        this._getPerformance().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.performance.add(values[i]);
        }
    }

    protected List<PerformanceDashboardType> _getPerformance() {
        if (performance == null) {
            performance = new ArrayList<PerformanceDashboardType>();
        }
        return performance;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceDashboardType }
     *     
     */
    public PerformanceDashboardType setPerformance(int idx, PerformanceDashboardType value) {
        return this.performance.set(idx, value);
    }

}
