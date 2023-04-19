package com.ssafy.todomvc.model.dao;

import com.ssafy.todomvc.model.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {
    private final DataSource dataSource;

    public UserDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public void insertUser(User user) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append("insert into user (userId, password, nickname) ");
        sql.append("values (?, ?, ?)");
        int cnt = 0;

        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql.toString());) {
            pstmt.setString(++cnt, user.getUserId());
            pstmt.setString(++cnt, user.getPassword());
            pstmt.setString(++cnt, user.getNickname());
            pstmt.execute();
        }
    }

    @Override
    public void deleteUser(String id) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append("delete from user ");
        sql.append("where userId = ?");
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql.toString());) {
            pstmt.setString(1, id);
            pstmt.execute();
        }
    }

    @Override
    public boolean login(String id, String pw) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append("select count(*) from user ");
        sql.append("where userId = ? and password = ?");

        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql.toString());) {
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) == 1;
                }
            }
        }
        return false;
    }
}
