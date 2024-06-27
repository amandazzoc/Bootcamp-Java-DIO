package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {-1,5,2,3,10};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); // Verifica se o segundo parametro está igual ao primeiro parametro
    }

    @Test
    void validarLancamentos2(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {-1,5,2,3,10};

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento); // Verifica se o segundo parametro está igual ao primeiro parametro
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Amanda", LocalDateTime.now());
        Assertions.assertNotNull(pessoa);
    }
}
