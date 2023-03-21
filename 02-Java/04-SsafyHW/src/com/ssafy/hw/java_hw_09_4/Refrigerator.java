package com.ssafy.hw.java_hw_09_4;

public class Refrigerator {
	private String categroy;
	private int liter;
	private boolean freezer;
	private int year;

	public Refrigerator(String categroy, int liter, boolean freezer, int year) {
		this.categroy = categroy;
		this.liter = liter;
		this.freezer = freezer;
		this.year = year;
	}

	public Refrigerator() {
	}

	public String getCategroy() {
		return categroy;
	}

	public void setCategroy(String categroy) {
		this.categroy = categroy;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public boolean isFreezer() {
		return freezer;
	}

	public void setFreezer(boolean freezer) {
		this.freezer = freezer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Refrigerator [categroy=" + categroy + ", liter=" + liter + ", freezer=" + freezer + ", year=" + year
				+ "]";
	}
}
