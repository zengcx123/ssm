package com.ssm.test.controller;

import com.ssm.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by zeng on 2017/6/28.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String model(Model model){
        model.addAttribute("test",testService.findTestList());
        return "index";
    }

}
