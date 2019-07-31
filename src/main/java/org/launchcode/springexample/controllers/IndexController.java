package org.launchcode.springexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="")
public class IndexController {

    @GetMapping(value="")
    public String getIndex() {
        return "index";
    }

    @GetMapping(value="home")
    public String getHome() {
        int a = 1;
        int b = 5;
        for(int c = 0; c < 10; c++){
            a += b;
        }
        System.out.println(a);
        return "home/index";
    }
}
