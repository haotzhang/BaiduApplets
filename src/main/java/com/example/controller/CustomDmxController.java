package com.example.controller;

import com.example.service.CustomDmxService;
import com.example.service.CustomZxhService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customdmx/")
public class CustomDmxController {
    @Autowired
    private CustomDmxService customDmxService;

    @PostMapping("addQuestion")
    public String addQuestion(@Param("username") String username, @Param("question") String question){
        if(!question.isEmpty()){
            customDmxService.addCustomQuestion(username,question);
        }

        return "提交成功";
    }

    @PostMapping("getAllCustomQuestion")
    public List<String> getAllCustomQuestion(@RequestBody String username){
        return customDmxService.getAllCustomQuestion(username);
    }
}
