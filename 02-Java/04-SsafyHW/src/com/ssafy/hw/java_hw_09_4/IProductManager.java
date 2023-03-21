package com.ssafy.hw.java_hw_09_4;

import java.util.List;

public interface IProductManager {
	boolean addProduct(Product product);

	boolean updateProduct(Product product);

	boolean removeProduct(String pCode);

	int sell(String pCode, int cnt);

	Product[] getProductList();

	Product searchByCode(String pCode);

	boolean addReview(Review review);

	boolean removeReview(Review review);

	List<Review> getProductReivew(String name);

	Product[] searchByName(String name);

	long getTotalPrice();

	Product[] getProducts();
}
