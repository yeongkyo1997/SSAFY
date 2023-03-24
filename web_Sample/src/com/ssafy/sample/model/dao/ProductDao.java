package com.ssafy.sample.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.sample.dto.ProductDto;

public interface ProductDao {
	void insertProduct(ProductDto productDto) throws SQLException;

	List<ProductDto> selectProduct() throws SQLException;

	void deleteProduct(String code) throws SQLException;

	ProductDto selectProductByCode(String code) throws SQLException;
}
