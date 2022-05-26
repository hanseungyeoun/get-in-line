package com.uno.getinline.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ApiAuthController {

    @GetMapping("/sign-up")
    public String singup(){
        return "done";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
