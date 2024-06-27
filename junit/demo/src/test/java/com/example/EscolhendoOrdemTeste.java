package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// @TestMethodOrder(MethodOrderer.Random.class) Executa aleatóriamente
// @TestMethodOrder(MethodOrderer.OrderAnnotation.class) Executa por ordem da notação
// @TestMethodOrder(MethodOrderer.MethodName.class) Executa por ordem alfabetica
// @TestMethodOrder(MethodOrderer.DisplayName.class) Executa pelo nome do Display
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTeste {

    @DisplayName("Teste A")
    @Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }
    
    @DisplayName("Teste B")
    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("Teste D")
    @Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("Teste C")
    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
