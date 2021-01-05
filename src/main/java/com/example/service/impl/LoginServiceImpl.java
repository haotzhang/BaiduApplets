package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper user;

    @Override
    public Integer addUser(String username){
        List<String> usernames = user.getAllUsers();
        Boolean flag=false;
        for(String user:usernames){
            if(username.equals(user)){
                flag=true;
                break;
            }
        }
        if(flag){
            return 0;
        }else{
            return user.addUser(username);
        }
    }
}
