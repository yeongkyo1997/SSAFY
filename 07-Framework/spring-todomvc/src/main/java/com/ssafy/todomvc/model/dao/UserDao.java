package com.ssafy.todomvc.model.dao;

import com.ssafy.todomvc.model.User;

public interface UserDao {
    void insertUser(User user) throws Exception;

    void deleteUser(String id) throws Exception;

    boolean login(String id, String pw) throws Exception;
}
