package com.ssafy.sample.model.service;

import com.ssafy.sample.model.UserInfoDto;

public interface UserService {
    UserInfoDto login(UserInfoDto user) throws Exception;

    UserInfoDto selectUser(String id) throws Exception;
}
