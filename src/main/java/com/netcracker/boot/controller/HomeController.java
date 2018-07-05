package com.netcracker.boot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/{id}",  method = RequestMethod.GET)
    public String index(@PathVariable(value = "id") int id) {
        return "Congratulations from " + id;
    }
}
