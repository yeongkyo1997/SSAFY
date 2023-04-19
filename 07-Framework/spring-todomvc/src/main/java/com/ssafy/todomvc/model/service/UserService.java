package com.ssafy.todomvc.model.service;

import com.ssafy.todomvc.model.User;

public interface UserService {
    void registUser(User user) throws Exception;

    void deleteUser(String id) throws Exception;

    boolean login(String id, String pw) throws Exception;
}
