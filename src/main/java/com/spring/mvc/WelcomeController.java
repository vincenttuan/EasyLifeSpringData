package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    
    @RequestMapping("/")
    public String index() {
        return "welcome_page";
    }
}
