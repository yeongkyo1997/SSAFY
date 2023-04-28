package com.ssafy.todomvc.controller;

import com.ssafy.todomvc.model.service.UserService;
import com.ssafy.todomvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/regist")
    public String registUser(User user) {
        try {
            userService.registUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "user/regist";
    }
}
