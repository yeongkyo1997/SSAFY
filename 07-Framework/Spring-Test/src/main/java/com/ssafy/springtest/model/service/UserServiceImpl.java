package com.ssafy.springtest.model.service;

import com.ssafy.springtest.model.User;
import com.ssafy.springtest.model.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User login(User user) throws Exception {
        return userDao.selectLogin(user);
    }

}









