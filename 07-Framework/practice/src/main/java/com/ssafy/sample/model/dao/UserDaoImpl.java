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
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("select user_id, user_name, user_password from members where user_id = ? and user_password = ?");) {
            pstmt.setString(1, user.getUser_id());
            pstmt.setString(2, user.getUser_password());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                User userInfo = new User();
                userInfo.setUser_id(rs.getString("user_id"));
                userInfo.setUser_password(rs.getString("user_password"));
                userInfo.setUser_name(rs.getString("user_name"));
                return userInfo;
            }
        }
        return null;
    }
}
