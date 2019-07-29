package com.itheima.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class XxxController {

    @RequestMapping("/test")
    public ModelAndView test(ModelAndView modelAndView){
        modelAndView.addObject("str","你好,vue");
        modelAndView.setViewName("hello.html");
        return modelAndView;
    }
}
