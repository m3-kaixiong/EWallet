package com.mpm.EWalletApp.model;

public class CreditCardDetails {

	private int ccNumber;
	private String ccName;
	private String ccExpiryDate;
	
	public CreditCardDetails(int ccNumber, String ccName, String ccExpiryDate) {
		this.ccNumber = ccNumber;
		this.ccName = ccName;
		this.ccExpiryDate = ccExpiryDate;
	}
	public CreditCardDetails() {

	}
	public int getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getCcExpiryDate() {
		return ccExpiryDate;
	}
	public void setCcExpiryDate(String ccExpiryDate) {
		this.ccExpiryDate = ccExpiryDate;
	}
	
	
	
}
