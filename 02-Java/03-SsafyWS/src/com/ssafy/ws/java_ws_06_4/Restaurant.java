package com.ssafy.ws.java_ws_06_4;

public class Restaurant {
	int resId;
	String name;
	String address;
	String signatureMenu;
	int rate;

	public Restaurant() {

	}

	public Restaurant(int resId, String name, String address, String signatureMenu, int rate) {
		super();
		this.resId = resId;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getSignatureMenue() {
		return signatureMenu;
	}

	public void setSignatureMenu(String signatureMenu) {
		this.signatureMenu = signatureMenu;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
