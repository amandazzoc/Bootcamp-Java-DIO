package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoasTeste {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configuraConexao");
    }

    @BeforeEach //Executa antes e depois de cada teste que tem na classe
    void inserirDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("Amanda", LocalDate.of(2006, 04, 9)));
    }

    @AfterEach //Executa antes e depois de cada teste que tem na classe
    void removerDadosDoTeste(){
        BancoDeDados.removerDados(new Pessoa("Amanda", LocalDate.of(2006, 04, 9)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizarConexao");
    }


}
