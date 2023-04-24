package com.ssafy.sample.model.service;

import com.ssafy.sample.model.UserInfoDto;
import com.ssafy.sample.model.dao.UserDao;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserInfoDto login(UserInfoDto user) throws SQLException {
        return userDao.selectLogin(user);
    }

    @Override
    public UserInfoDto selectUser(String id) throws Exception {
        return userDao.selectUser(id);
    }
}
