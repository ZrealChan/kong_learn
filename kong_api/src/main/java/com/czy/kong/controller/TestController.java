package com.czy.kong.controller;

import com.alibaba.fastjson.JSONObject;
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
        String arg = request.getParameter("key");
        JSONObject result = new JSONObject();
        if (arg != null && arg.length() > 0) {
            result.put("result", 0);
        } else {
            result.put("result", -1);
        }
        result.put("msg", "the api is success, and key is " + arg);
        return result.toJSONString();
    }

    @RequestMapping("/status")
    public String status() {
        return "status";
    }
}
