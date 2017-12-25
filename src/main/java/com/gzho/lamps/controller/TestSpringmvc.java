package com.gzho.lamps.controller;

import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author :gzho
 */

@Controller
public class TestSpringmvc {

    /*@RequestMapping("/")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "hello mvc");
        return mav;
    }*/

    /*private final Log logger = (Log) LogFactory.getLog(TestSpringmvc.class);

    //处理HEAD类型的"/"请求
    @RequestMapping(value = "abc",method = {RequestMethod.HEAD})
    public String head(){
        return "/index.jsp";
    }*/

}
