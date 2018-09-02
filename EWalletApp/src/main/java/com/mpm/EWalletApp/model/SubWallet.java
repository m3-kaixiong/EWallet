package com.mpm.EWalletApp.model;

import java.util.List;

import com.mpm.EWalletApp.Controller.EWalletAppController;

public class SubWallet extends Wallet {

	private int subId;
	private double balance;
	private List<CreditCardDetails> ccDetails;
	private List<Transactions> txnHistory;

	public SubWallet(int walletId, String custName) {
		super(walletId, custName);
	}


	public SubWallet(int walletId, String custName, int subId, double balance, List<CreditCardDetails> ccDetails,
			List<Transactions> txnHistory) {
		super(walletId, custName);
		this.subId = subId;
		this.balance = balance;
		this.ccDetails = ccDetails;
		this.txnHistory = txnHistory;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<CreditCardDetails> getCcDetails() {
		return ccDetails;
	}
	public void setCcDetails(List<CreditCardDetails> ccDetails) {
		this.ccDetails = ccDetails;
	}
	public List<Transactions> getTxnHistory() {
		return txnHistory;
	}
	public void setTxnHistory(List<Transactions> txnHistory) {
		this.txnHistory = txnHistory;
	}


	public boolean addTxn(Transactions txn) {
		double productPrice = txn.getProduct().getProdPrice();


		if(this.balance < productPrice) {
			return false;
		}

		if(this.balance >= productPrice) {
			this.balance -= productPrice;
			addToTxnHistory(txn);
			return true;
		}
		return false;


	}

	public void addToTxnHistory(Transactions txn) {
		this.txnHistory.add(txn);
	}

	public Transactions getLastTxn() {
		if(txnHistory.size() > 0) {
			int count = 1;
			while (true) {
				Transactions lastTxn = txnHistory.get(txnHistory.size()-count);
				if(lastTxn.getType().equals("purchase")) {
					return lastTxn;
				}
				count++;
			}
		}

		return null;
	}
}




