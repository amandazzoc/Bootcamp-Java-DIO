package com.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("Finalizou conexao");
    }

    public static void inserirDados(Pessoa pessoa){
        //insete pessoa no BD
        LOGGER.info("Inseriu Dados");
    }

    public static void removerDados(Pessoa pessoa){
        //insete pessoa no BD
        LOGGER.info("Removeu Dados");
    }
}
