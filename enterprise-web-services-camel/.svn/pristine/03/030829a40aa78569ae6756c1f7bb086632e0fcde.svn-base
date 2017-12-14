package hmh.rs.pojo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SaleLineItem {

    protected String lineNo;
    
    /*
	 * Added to Handle Line Number in Simulate Order
	 */
    protected String higherLevelItemNo;
    protected String backOfficeLineNo;
    
    protected String materialID;
    protected Long quantity;
    
    //@Digits(integer=10,fraction=2) 
    protected BigDecimal netPrice;
    
    protected Boolean substituted;
    protected Boolean freeGoodsIndicator;
    protected SubscriptionTerm subscriptionTerm;
    protected String overrideShipping;
    protected BigDecimal overrideItemPrice;
    
	public String getLineNo() {
		return lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	public String getMaterialID() {
		return materialID;
	}
	public void setMaterialID(String materialID) {
		this.materialID = materialID;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public SubscriptionTerm getSubscriptionTerm() {
		return subscriptionTerm;
	}
	public void setSubscriptionTerm(SubscriptionTerm subscriptionTerm) {
		this.subscriptionTerm = subscriptionTerm;
	}
	public String getOverrideShipping() {
		return overrideShipping;
	}
	public void setOverrideShipping(String overrideShipping) {
		this.overrideShipping = overrideShipping;
	}
	public BigDecimal getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}
	public Boolean getSubstituted() {
		return substituted;
	}
	public void setSubstituted(Boolean substituted) {
		this.substituted = substituted;
	}
	public Boolean getFreeGoodsIndicator() {
		return freeGoodsIndicator;
	}
	public void setFreeGoodsIndicator(Boolean freeGoodsIndicator) {
		this.freeGoodsIndicator = freeGoodsIndicator;
	}
	public BigDecimal getOverrideItemPrice() {
		return overrideItemPrice;
	}
	public void setOverrideItemPrice(BigDecimal overrideItemPrice) {
		this.overrideItemPrice = overrideItemPrice;
	}
	/*
	 * Added to Handle Line Number in Simulate Order
	 */
	public String getBackOfficeLineNo() {
		return backOfficeLineNo;
	}
	public void setBackOfficeLineNo(String backOfficeLineNo) {
		this.backOfficeLineNo = backOfficeLineNo;
	}
	public String getHigherLevelItemNo() {
		return higherLevelItemNo;
	}
	public void setHigherLevelItemNo(String higherLevelItemNo) {
		this.higherLevelItemNo = higherLevelItemNo;
	}

}
