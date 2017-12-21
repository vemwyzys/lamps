package com.gzho.lamps.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestSpringMVC {

    @RequestMapping("jsp/index")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{

        ModelAndView mav = new ModelAndView("jsp/index");
        mav.addObject("message", "hello mvc");
        return mav;
    }
}
