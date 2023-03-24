package com.ssafy.sample.model.service;

import java.util.List;

import com.ssafy.sample.dto.ProductDto;

public interface ProductService {
	void regist(ProductDto productDto) throws Exception;

	List<ProductDto> list() throws Exception;

	ProductDto detail(String code) throws Exception;

	void delete(String code) throws Exception;
}
