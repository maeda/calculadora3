package com.example.controller;

import com.example.service.CalculadoraService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ApiControllerIntegrationTest {

    @Mock
    private CalculadoraService calculadoraService;

    @InjectMocks
    private ApiController controller;

    @Test(expected = Exception.class)
    public void test() {
        Mockito.when(controller.generate(Mockito.anyString())).thenThrow(Exception.class);
        controller.generate("1+1");
    }
}
