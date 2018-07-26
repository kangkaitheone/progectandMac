package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peng on 2018/7/25.
 */
@Controller
public class UserController {
    @RequestMapping(value = "login")
    public String login() {
        System.out.println("login");
        return "login";
    }

}
