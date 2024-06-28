/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;


public class DadosLocalizacao {

    private String uf;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String bairro;

    public DadosLocalizacao(final String uf, final String cidade, final String logradouro, final String complemento, final String bairro) {
        this.uf = uf;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

}