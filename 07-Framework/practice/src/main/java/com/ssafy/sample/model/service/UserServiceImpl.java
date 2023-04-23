package com.ssafy.sample.model.service;

import com.ssafy.sample.model.User;
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
    public User login(User user) throws SQLException {
        return userDao.selectLogin(user);
    }
}
