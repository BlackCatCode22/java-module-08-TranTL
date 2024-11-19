package com.tran.tues.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String getMyGreeting() {
        String myReturnMessage;
        myReturnMessage = "\n\n Welcome to my website \n \n" + "<b> This is in bold <b>" + "<i> and this is italics </i>";
        return "\n **** Hello from my Website! **** \n";
    }
}
