package com.ssafy.sample.model.service;

import com.ssafy.sample.model.Product;
import com.ssafy.sample.model.dao.ProductDao;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> list() throws SQLException {
        return productDao.selectProduct();
    }

    @Override
    public Product detail(String code) throws Exception {
        return productDao.selectProductByPK(code);
    }

    @Override
    public void delete(String code) throws SQLException {
        productDao.deleteProduct(code);
    }

    @Override
    public void write(Product product) throws Exception {
        productDao.insertProduct(product);
    }

    @Override
    public void multiDelete(List<String> codeList) throws SQLException {
        for (String code : codeList) {
            productDao.deleteProduct(code);
        }
    }
}