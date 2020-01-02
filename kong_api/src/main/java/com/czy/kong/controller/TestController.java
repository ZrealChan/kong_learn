package com.czy.kong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试kong
 * @author czy
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping("/learn")
    @ResponseBody
    public String learn(HttpServletRequest request, HttpServletResponse response) {
        return "the api is success";
    }

    @RequestMapping("/status")
    public String status() {
        return "status";
    }
}
