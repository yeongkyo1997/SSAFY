package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    List<Product> selectProduct() throws SQLException;

    Product selectProductByPK(String code) throws Exception;

    void deleteProduct(String code) throws SQLException;

    void insertProduct(Product product) throws SQLException;
}
