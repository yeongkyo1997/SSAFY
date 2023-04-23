package com.ssafy.sample.controller;

import com.ssafy.sample.model.User;
import com.ssafy.sample.model.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:/";
    }

    @PostMapping("login")
    public String login(User user, HttpSession httpSession) throws Exception {
        User userInfo = userService.login(user);
        if (userInfo != null) httpSession.setAttribute("userInfo", userInfo);
        return "redirect:/";
    }
}
