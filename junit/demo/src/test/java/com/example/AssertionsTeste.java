package com.example;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {-1,5,2,3,10};

        assertArrayEquals(primeiroLancamento, segundoLancamento); // Verifica se o segundo parametro está igual ao primeiro parametro
    }

    @Test
    void validarLancamentos2(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {-1,5,2,3,10};

        assertNotEquals(primeiroLancamento, segundoLancamento); // Verifica se o segundo parametro está igual ao primeiro parametro
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Amanda", LocalDate.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
