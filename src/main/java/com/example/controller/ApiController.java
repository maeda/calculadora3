package com.example.controller;

import com.example.service.LeroLeroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final LeroLeroService service;

    public ApiController(LeroLeroService service){
        this.service = service;
    }

    @RequestMapping("/api")
    @ResponseBody
    public String generate() {
        return service.generate();
    }

}
