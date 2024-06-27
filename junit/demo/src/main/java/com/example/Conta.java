package com.example;

public class Conta {
    private final String numeroConta;
    private final int saldo;

    public Conta(String numeroConta, int saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }
}
