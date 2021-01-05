package com.example.controller;

import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("adduser")
    public Integer addUser(@RequestBody String username){
        return loginService.addUser(username);
    }
}
