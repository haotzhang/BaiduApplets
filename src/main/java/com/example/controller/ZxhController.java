package com.example.controller;


import com.example.service.DmxService;
import com.example.service.ZxhService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zxh/")
public class ZxhController {

    @Autowired
    private ZxhService zxhService;

    @GetMapping("getQuestion")
    public String getQuestion(@Param("id") Integer id){
        return zxhService.getQuestion(id);
    }

    @PostMapping("getAllQuestions")
    public List<String> getAllQuestions(@RequestBody String level){
        return zxhService.getAllQuestions(Integer.parseInt(level));
    }

}
