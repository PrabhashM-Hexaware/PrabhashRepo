package com.vodafone.azuremigration.migration.model;

import java.util.List;
import lombok.Data;

@Data
public class _4000 {
  
	    private String macAddress; 
	    private List<String> ipAddresses = null;   
	    private Integer megabytesPerSecondReceived;  
	    private Integer megabytesPerSecondReceivedDataPointsExpected;   
	    private Integer megabytesPerSecondOfReadDataPointsReceived;    
	    private Integer megabytesPerSecondTransmitted;    
	    private Integer megabytesPerSecondTransmittedDataPointsExpected;   
	    private Integer megabytesPerSecondTransmittedDataPointsReceived;   
	    private Integer monthlyBandwidthCosts;  
	    private Integer netGigabytesTransmittedPerMonth;  
	    private String suitability;   
	    private String suitabilityExplanation;
	    private String displayName;
	    private String suitabilityDetail;
		/**
		 * @return the macAddress
		 */
		public String getMacAddress() {
			return macAddress;
		}
		/**
		 * @param macAddress the macAddress to set
		 */
		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}
		/**
		 * @return the ipAddresses
		 */
		public List<String> getIpAddresses() {
			return ipAddresses;
		}
		/**
		 * @param ipAddresses the ipAddresses to set
		 */
		public void setIpAddresses(List<String> ipAddresses) {
			this.ipAddresses = ipAddresses;
		}
		/**
		 * @return the megabytesPerSecondReceived
		 */
		public Integer getMegabytesPerSecondReceived() {
			return megabytesPerSecondReceived;
		}
		/**
		 * @param megabytesPerSecondReceived the megabytesPerSecondReceived to set
		 */
		public void setMegabytesPerSecondReceived(Integer megabytesPerSecondReceived) {
			this.megabytesPerSecondReceived = megabytesPerSecondReceived;
		}
		/**
		 * @return the megabytesPerSecondReceivedDataPointsExpected
		 */
		public Integer getMegabytesPerSecondReceivedDataPointsExpected() {
			return megabytesPerSecondReceivedDataPointsExpected;
		}
		/**
		 * @param megabytesPerSecondReceivedDataPointsExpected the megabytesPerSecondReceivedDataPointsExpected to set
		 */
		public void setMegabytesPerSecondReceivedDataPointsExpected(Integer megabytesPerSecondReceivedDataPointsExpected) {
			this.megabytesPerSecondReceivedDataPointsExpected = megabytesPerSecondReceivedDataPointsExpected;
		}
		/**
		 * @return the megabytesPerSecondOfReadDataPointsReceived
		 */
		public Integer getMegabytesPerSecondOfReadDataPointsReceived() {
			return megabytesPerSecondOfReadDataPointsReceived;
		}
		/**
		 * @param megabytesPerSecondOfReadDataPointsReceived the megabytesPerSecondOfReadDataPointsReceived to set
		 */
		public void setMegabytesPerSecondOfReadDataPointsReceived(Integer megabytesPerSecondOfReadDataPointsReceived) {
			this.megabytesPerSecondOfReadDataPointsReceived = megabytesPerSecondOfReadDataPointsReceived;
		}
		/**
		 * @return the megabytesPerSecondTransmitted
		 */
		public Integer getMegabytesPerSecondTransmitted() {
			return megabytesPerSecondTransmitted;
		}
		/**
		 * @param megabytesPerSecondTransmitted the megabytesPerSecondTransmitted to set
		 */
		public void setMegabytesPerSecondTransmitted(Integer megabytesPerSecondTransmitted) {
			this.megabytesPerSecondTransmitted = megabytesPerSecondTransmitted;
		}
		/**
		 * @return the megabytesPerSecondTransmittedDataPointsExpected
		 */
		public Integer getMegabytesPerSecondTransmittedDataPointsExpected() {
			return megabytesPerSecondTransmittedDataPointsExpected;
		}
		/**
		 * @param megabytesPerSecondTransmittedDataPointsExpected the megabytesPerSecondTransmittedDataPointsExpected to set
		 */
		public void setMegabytesPerSecondTransmittedDataPointsExpected(
				Integer megabytesPerSecondTransmittedDataPointsExpected) {
			this.megabytesPerSecondTransmittedDataPointsExpected = megabytesPerSecondTransmittedDataPointsExpected;
		}
		/**
		 * @return the megabytesPerSecondTransmittedDataPointsReceived
		 */
		public Integer getMegabytesPerSecondTransmittedDataPointsReceived() {
			return megabytesPerSecondTransmittedDataPointsReceived;
		}
		/**
		 * @param megabytesPerSecondTransmittedDataPointsReceived the megabytesPerSecondTransmittedDataPointsReceived to set
		 */
		public void setMegabytesPerSecondTransmittedDataPointsReceived(
				Integer megabytesPerSecondTransmittedDataPointsReceived) {
			this.megabytesPerSecondTransmittedDataPointsReceived = megabytesPerSecondTransmittedDataPointsReceived;
		}
		/**
		 * @return the monthlyBandwidthCosts
		 */
		public Integer getMonthlyBandwidthCosts() {
			return monthlyBandwidthCosts;
		}
		/**
		 * @param monthlyBandwidthCosts the monthlyBandwidthCosts to set
		 */
		public void setMonthlyBandwidthCosts(Integer monthlyBandwidthCosts) {
			this.monthlyBandwidthCosts = monthlyBandwidthCosts;
		}
		/**
		 * @return the netGigabytesTransmittedPerMonth
		 */
		public Integer getNetGigabytesTransmittedPerMonth() {
			return netGigabytesTransmittedPerMonth;
		}
		/**
		 * @param netGigabytesTransmittedPerMonth the netGigabytesTransmittedPerMonth to set
		 */
		public void setNetGigabytesTransmittedPerMonth(Integer netGigabytesTransmittedPerMonth) {
			this.netGigabytesTransmittedPerMonth = netGigabytesTransmittedPerMonth;
		}
		/**
		 * @return the suitability
		 */
		public String getSuitability() {
			return suitability;
		}
		/**
		 * @param suitability the suitability to set
		 */
		public void setSuitability(String suitability) {
			this.suitability = suitability;
		}
		/**
		 * @return the suitabilityExplanation
		 */
		public String getSuitabilityExplanation() {
			return suitabilityExplanation;
		}
		/**
		 * @param suitabilityExplanation the suitabilityExplanation to set
		 */
		public void setSuitabilityExplanation(String suitabilityExplanation) {
			this.suitabilityExplanation = suitabilityExplanation;
		}
	    
	    
    
}
