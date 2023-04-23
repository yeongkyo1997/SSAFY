package com.ssafy.practice.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.practice.model.Product;

public interface ProductService {
	List<Product> listProduct() throws SQLException;

	void regist(Product product) throws SQLException;

	void multiDelete(List<String> codeList) throws SQLException;

}
