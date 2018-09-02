package com.mpm.EWalletApp.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Transactions {
	
	private int txnCount = 0 ;
	private int txnId;
	private static final DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy hh.mma");
	private Date txnDateTime;
	private Product product;
	private String type;
	
	public Transactions(Date txnDateTime, Product product, String type) {
		this.txnId = txnCount++;
		this.txnDateTime = txnDateTime;
		this.product = product;
		this.type = type;
	}

	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	public Date getTxnDateTime() {
		return txnDateTime;
	}

	public void setTxnDateTime(Date txnDateTime) {
		this.txnDateTime = txnDateTime;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public static DateFormat getDateformat() {
		return dateFormat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	

}
