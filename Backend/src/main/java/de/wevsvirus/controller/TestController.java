package de.wevsvirus.controller;

import de.wevsvirus.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    @Value( "${spring.datasource.url}" )
    private String test2;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Hello World " + test2;
    }

}
