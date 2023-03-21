package com.ssafy.ws.java_ws_06_4;

public class RestaurantManager extends Restaurant {
	private final int MAX_RESTAURANT_SIZE = 100;
	private final int MAX_REVEIW_SIZE = 100;
	private Restaurant[] restaurants;
	private Review[] reviews;
	private int reatuarantSize;
	private int reviewSize;

	public Restaurant[] getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(Restaurant[] restaurants) {
		this.restaurants = restaurants;
	}

	public Review[] getReviews() {
		return reviews;
	}

	public void setReviews(Review[] reviews) {
		this.reviews = reviews;
	}

	public int getReatuarantSize() {
		return reatuarantSize;
	}

	public void setReatuarantSize(int reatuarantSize) {
		this.reatuarantSize = reatuarantSize;
	}

	public int getReviewSize() {
		return reviewSize;
	}

	public void setReviewSize(int reviewSize) {
		this.reviewSize = reviewSize;
	}

	public int getMAX_RESTAURANT_SIZE() {
		return MAX_RESTAURANT_SIZE;
	}

	public int getMAX_REVEIW_SIZE() {
		return MAX_REVEIW_SIZE;
	}

}