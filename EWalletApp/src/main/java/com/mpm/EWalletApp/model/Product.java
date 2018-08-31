package com.mpm.EWalletApp.model;

public class Product {

	private int prodId;
	private String prodName;
	private double prodPrice;
	private String prodDes;
	private String imgSrc;
	private String qrCode;
	private String merchant;
	
	public Product() {
		super();
	}

	public Product(int prodId, String prodName, double prodPrice, String prodDes, String imgFileName, String qrCodeName,
			String merchant) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodDes = prodDes;
		this.imgSrc = "images/products/pictures" + imgFileName;
		this.qrCode = "images/products/qrcodes" + qrCodeName;
		this.merchant = merchant;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdDes() {
		return prodDes;
	}

	public void setProdDes(String prodDes) {
		this.prodDes = prodDes;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	
	
	
}
