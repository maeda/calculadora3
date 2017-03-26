package com.example.controller;

import com.example.service.LeroLeroService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final LeroLeroService service;

    public ApiController(LeroLeroService service){
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:3000") //TODO (maedabr) pegar a url por ambiente
    @RequestMapping(name = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String generate() {
        return service.generate();
    }

}
