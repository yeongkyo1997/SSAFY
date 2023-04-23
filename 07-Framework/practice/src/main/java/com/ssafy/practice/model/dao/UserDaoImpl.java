package com.ssafy.practice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ssafy.practice.model.User;
import com.ssafy.practice.util.DBUtil;

@Repository
public class UserDaoImpl implements UserDao {
	private DataSource dataSource;
	private DBUtil dbUtil;

	public UserDaoImpl(DataSource dataSource, DBUtil dbUtil) {
		super();
		this.dataSource = dataSource;
		this.dbUtil = dbUtil;
	}

	@Override
	public User selectLogin(User user) throws SQLException {
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection
						.prepareStatement("select user_id, user_password from members where user_id = ? and user_password = ?");) {
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPassword());
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				User userInfo = new User();
				userInfo.setUserId(rs.getString("user_id"));
				userInfo.setPassword(rs.getString("user_password"));
				return userInfo;
			}
		}
		return null;
	}

}
