package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.UserInfoDto;

import java.sql.SQLException;

public interface UserDao {
    UserInfoDto selectLogin(UserInfoDto user) throws SQLException;

    UserInfoDto selectUser(String id) throws SQLException;
}
