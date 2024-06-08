package co.develhope.Deploy_es.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @Autowired
    Environment environment;

    @GetMapping
    public String getDevName(){
        String authCode = environment.getProperty("app.authCode");
        String devName = environment.getProperty("app.devName");
        return authCode + devName;
    }
}