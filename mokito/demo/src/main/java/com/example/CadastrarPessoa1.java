package com.example;

import java.time.LocalDate;

public class CadastrarPessoa1 {
    
    private ApiDosCorreios apiDosCorreios;

    public CadastrarPessoa1(final ApiDosCorreios apiDosCorreios){
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(cep);
        pessoa.adicionaDadosDeEndereco(dadosLocalizacao);
        return pessoa;
    }
}
