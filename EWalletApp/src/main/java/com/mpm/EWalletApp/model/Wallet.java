package com.mpm.EWalletApp.model;

public class Wallet {

	private int walletId;
	private String custName;
	
	public Wallet(int walletId, String custName) {
		super();
		this.walletId = walletId;
		this.custName = custName;
	}

	public Wallet() {
		super();
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	

}
