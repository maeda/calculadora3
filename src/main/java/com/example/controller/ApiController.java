package com.example.controller;

import com.example.service.CalculadoraService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final CalculadoraService service;

    public ApiController(CalculadoraService service){
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:3000") //TODO (maedabr) pegar a url por ambiente
    @RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String generate(@RequestParam String calculo) {
        return String.format("{\"resultado\": %s}", service.calcular(calculo));
    }

}
