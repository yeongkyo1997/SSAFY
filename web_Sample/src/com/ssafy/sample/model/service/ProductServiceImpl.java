package com.ssafy.sample.model.service;

import java.util.List;

import com.ssafy.sample.dto.ProductDto;
import com.ssafy.sample.model.dao.ProductDao;
import com.ssafy.sample.model.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	private static ProductService instance = new ProductServiceImpl();

	private ProductServiceImpl() {
		productDao = ProductDaoImpl.getInstance();
	}

	public static ProductService getInstance() {
		return instance;
	}

	@Override
	public void regist(ProductDto productDto) throws Exception {
		productDao.insertProduct(productDto);
	}

	@Override
	public List<ProductDto> list() throws Exception {

		return productDao.selectProduct();
	}

	@Override
	public ProductDto detail(String code) throws Exception {
		return productDao.selectProductByCode(code);
	}

	@Override
	public void delete(String code) throws Exception {
		productDao.deleteProduct(code);
	}

}
