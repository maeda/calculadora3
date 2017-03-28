package com.example.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraServiceImplTest {
    private CalculadoraService service;

    @Before
    public void SetUp(){
        service = new CalculadoraServiceImpl();

    }

    @Test(expected = IllegalArgumentException.class)
    public void deveriaValidarStringVazia() {



        service.calcular("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveriaValidarNumeroPorExtenso() {


        service.calcular("um");
    }

    @Test
    public void deveriaConverteStringParaInteiro() {


        double resultado = service.calcular("1");

        assertEquals(1.0, resultado, 0.01);

    }



    @Test(expected = IllegalArgumentException.class)
    public void deveriaSomar() {


        service.calcular("um");
    }
}