package com.example.controller;

import com.example.mapper.CustomZxhMapper;
import com.example.service.CustomZxhService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customzxh/")
public class CustomZxhController {

    @Autowired
    private CustomZxhService customZxhService;

    @PostMapping("addQuestion")
    public String addQuestion(@Param("username") String username, @Param("question") String question){
        if(!question.isEmpty()){
            customZxhService.addCustomQuestion(username,question);
        }
        return "提交成功";
    }

    @PostMapping("getAllCustomQuestion")
    public List<String> getAllCustomQuestion(@RequestBody String username){
        return customZxhService.getAllCustomQuestion(username);
    }
}
