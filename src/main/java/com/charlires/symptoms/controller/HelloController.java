package com.charlires.symptoms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by carlos_andonaegui on 10/20/14.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello!";
    }

}
