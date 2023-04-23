package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.Product;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    private final DataSource dataSource;

    public ProductDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> selectProduct() throws SQLException {
        List<Product> list = new ArrayList<>();

        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("select code, model, price from product order by code desc")) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setCode(rs.getString("code"));
                product.setModel(rs.getString("model"));
                product.setPrice(rs.getInt("price"));
                list.add(product);
            }
        }
        return list;
    }

    @Override
    public Product selectProductByPK(String code) throws Exception {
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("select code, model, price " + "from  product " + " where code = ? ");) {

            pstmt.setString(1, code);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Product product = new Product();
                product.setCode(rs.getString("code"));
                product.setModel(rs.getString("model"));
                product.setPrice(rs.getInt("price"));
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteProduct(String code) throws SQLException {
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("delete from product where code = ?");) {

            pstmt.setString(1, code);
            pstmt.executeUpdate();
        }
    }

    @Override
    public void insertProduct(Product product) throws SQLException {
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("insert into product(code, model, price) values(?, ?, ?) ");) {
            int cnt = 1;
            pstmt.setString(cnt++, product.getCode());
            pstmt.setString(cnt++, product.getModel());
            pstmt.setInt(cnt, product.getPrice());
            pstmt.executeUpdate();
        }
    }
}
