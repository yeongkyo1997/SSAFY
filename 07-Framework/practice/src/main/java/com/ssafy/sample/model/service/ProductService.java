package com.ssafy.sample.model.service;

import com.ssafy.sample.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {
	List<Product> list() throws SQLException;

	Product detail(String code) throws Exception;

	void delete(String code) throws SQLException;

	void write(Product product) throws Exception;

	void multiDelete(List<String> noList) throws SQLException;
}
