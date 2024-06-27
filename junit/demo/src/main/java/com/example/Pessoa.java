package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;

    private final LocalDate nascimento;

    public Pessoa(String nome, LocalDate localDate) {
        this.nome = nome;
        this.nascimento = localDate;
    }

    public Pessoa(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(
            this.nascimento, LocalDate.now());
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() >= 18;
    }
}