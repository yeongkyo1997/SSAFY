package com.ssafy.practice.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.practice.model.Product;
import com.ssafy.practice.model.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	public ProductServiceImpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> listProduct() throws SQLException {
		return productDao.selectProduct();
	}

	@Override
	public void regist(Product product) throws SQLException {
		productDao.insertProduct(product);
	}

	@Override
	public void multiDelete(List<String> codeList) throws SQLException {
		for (String code : codeList) {
			productDao.deleteProduct(code);
		}
	}
}
