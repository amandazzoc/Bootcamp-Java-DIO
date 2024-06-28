package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {


    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem); //Verifica se não teve interação com a classe

        Mensagem mensagem = new Mensagem("Hello World!");
        enviarMensagem.adicionarMensagem(mensagem);

        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem); //Verifica se o enviar mensagem enviou uma mensagem

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty()); //Verifica se o enviar mensagem está vazia, se estiver vazia retorna true, se tiver com algo, retorna false
    }
}