package com.netcracker.boot.controller;

import com.netcracker.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    PersonService personService;

    private String dbValue = "From database";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Congratulations " ;
    }

    @RequestMapping(value = "/response", method = RequestMethod.GET)
    public String response() {
        return "Congratulations from " + dbValue;
    }
}
