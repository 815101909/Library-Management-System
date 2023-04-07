package com.imooc.reader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    @PostMapping("/t/test1")
    @ResponseBody
    public Map text1(String content){
        Map result = new HashMap();
        result.put("test", "测试:" + content);
        return result;
    }
}
