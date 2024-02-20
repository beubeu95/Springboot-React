package com.example.demo.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ApiController {

    @GetMapping("test")
    public String hello(){
        return "테스트입니다.";
    }



}
