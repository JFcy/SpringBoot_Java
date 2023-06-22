package com.example.springboot_java.controller.pk;
//author:Fcy
// @File: indexController.py
// @Time: 2023/6/22 14:54
// @description:

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk/")
public class indexController {

    @RequestMapping("index")
    public String index(){
        return "pk/index.html";
    }
}
