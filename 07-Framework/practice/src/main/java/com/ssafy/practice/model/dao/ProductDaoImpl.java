package com.ssafy.practice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ssafy.practice.model.Product;
import com.ssafy.practice.util.DBUtil;

@Repository
public class ProductDaoImpl implements ProductDao {
	private DataSource dataSource;
	private DBUtil dbUtil;

	public ProductDaoImpl(DataSource dataSource, DBUtil dbUtil) {
		super();
		this.dataSource = dataSource;
		this.dbUtil = dbUtil;
	}

	@Override
	public List<Product> selectProduct() throws SQLException {
		List<Product> list = new ArrayList<>();

		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement("select code, model, price from product")) {
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
	public void insertProduct(Product product) throws SQLException {
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection
						.prepareStatement("insert into product(code, model, price) values(?, ?, ?) ");) {
			int cnt = 1;
			pstmt.setString(cnt++, product.getCode());
			pstmt.setString(cnt++, product.getModel());
			pstmt.setInt(cnt++, product.getPrice());
			pstmt.executeUpdate();
		}
	}

	@Override
	public void deleteProduct(String code) throws SQLException {
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement("delete from product where code = ?");) {

			pstmt.setString(1, code);
			pstmt.executeUpdate();
		}
	}

}
