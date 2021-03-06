package com.example.controller;

import com.example.service.DmxService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dmx/")
public class DmxController{

    @Autowired
    private DmxService dmxService;

    @GetMapping("getQuestion")
    public String getQuestion(@Param("id") Integer id){
        return dmxService.getQuestion(id);
    }

    @PostMapping("getAllQuestions")
    public List<String> getAllQuestions(@Param("username") String username,@Param("level") String level){
        return dmxService.getAllQuestions(username,Integer.parseInt(level));
    }
}
