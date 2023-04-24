package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.UserInfoDto;
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
    public UserInfoDto selectLogin(UserInfoDto user) throws SQLException {
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("select userid, userpw from userinfo where userid = ? and userpw = ?");) {
            pstmt.setString(1, user.getUserid());
            pstmt.setString(2, user.getUserpw());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                UserInfoDto userInfo = new UserInfoDto();
                userInfo.setUserid(rs.getString("userid"));
                userInfo.setUserpw(rs.getString("userpw"));
                return userInfo;
            }
        }
        return null;
    }

    @Override
    public UserInfoDto selectUser(String id) throws SQLException {
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("select userid, userpw, name, rclass, rname from userinfo where userid = ?");) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                UserInfoDto userInfo = new UserInfoDto();
                userInfo.setUserid(rs.getString("userid"));
                userInfo.setUserpw(rs.getString("userpw"));
                userInfo.setName(rs.getString("name"));
                userInfo.setRclass(Integer.parseInt(rs.getString("rclass")));
                userInfo.setRname(rs.getString("rname"));
                return userInfo;
            }
        }
        return null;
    }
}
