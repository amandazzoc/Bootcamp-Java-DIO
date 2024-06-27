package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    public void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        assertEquals(4, pessoa.getIdade()); // Ajuste a idade conforme o ano atual
    }
    
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa amanda = new Pessoa("Amanda", LocalDate.of(2006, 4, 9));

        Assertions.assertEquals(18, amanda.getIdade()); //O Assertions espera o que for colocado do lado esquerdo e o que é chamado do lado direito
    }

    @Test // Anotação Primordial
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa amanda = new Pessoa("Amanda", LocalDate.of(2006, 4, 9)); // Cria um cenário para teste
        Assertions.assertTrue(amanda.ehMaiorDeIdade()); // Executa a validação

        Pessoa julia = new Pessoa("Julia", LocalDate.of(2006, 8, 22));
        Assertions.assertTrue(julia.ehMaiorDeIdade());
    }
}
