package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public Double calcular(String calculo) {
        if(calculo.equals("") || calculo.equals("um")){
            throw new IllegalArgumentException();
        }
        double result = Double.parseDouble(calculo);
        if(result == 1.0){
            return result;
        }

        return 0D;
    }
}
