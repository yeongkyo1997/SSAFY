package com.ssafy.practice.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.practice.model.Product;

public interface ProductDao {

	List<Product> selectProduct() throws SQLException;

	void insertProduct(Product product) throws SQLException;

	void deleteProduct(String code) throws SQLException;

}
