package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.User;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDaoImpl implements UserDao {
    private DataSource dataSource;


    public UserDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
    public User selectLogin(User user) throws SQLException {
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(
                        "select id, name, password from user where id = ? and password = ?"
                );
        ) {
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getPassword());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                User userInfo = new User();
                userInfo.setId(rs.getString("id"));
                userInfo.setPassword(rs.getString("password"));
                userInfo.setName(rs.getString("name"));
                return userInfo;
            }
        }
        return null;
    }
}
