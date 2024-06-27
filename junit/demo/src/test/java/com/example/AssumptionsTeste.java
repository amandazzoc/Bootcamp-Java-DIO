package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste { //Presume algo

    @Test
    void validarAlgoSomenteNoUsuarioAmanda(){
        Assumptions.assumeTrue("root".equals(System.getenv("USER"))); //Só será verdadeiro se o user for igual a Amanda
        Assertions.assertEquals(10, 5 + 5); //Se sim ele vai verificar se 5 + 5 é 10
    }

}
