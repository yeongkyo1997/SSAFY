package com.ssafy.ws.java_ws_06_4;

public class KoreanRestaurant extends Restaurant {
	private String number;
	private String breakTime;

	public KoreanRestaurant() {

	}

	public KoreanRestaurant(int resId, String name, String address, String signatureMenu, int rate, String number,
			String breakTime) {
		super(resId, name, address, signatureMenu, rate);
		this.number = number;
		this.breakTime = breakTime;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}

	@Override
	public String toString() {

	}
}
