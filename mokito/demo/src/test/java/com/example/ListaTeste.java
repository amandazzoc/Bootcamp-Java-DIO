package com.example;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock // "Mockito, mocka para mim essa lista"
    private List<String> letras; //Aqui, @Mock cria um mock para o objeto letras, que é uma lista de strings (List<String>). Em vez de instanciar uma lista real, o Mockito cria uma lista simulada (mockada) para ser usada nos testes.

    @Test
    void adicionarItemNaLista(){
        Mockito.when(letras.get(0)).thenReturn("B"); //diz ao Mockito que, quando o método get(0) for chamado na lista letras, ele deve retornar "B". Note que, sem essa configuração, o mock retornaria null ou lançaria uma exceção, pois os mocks do Mockito não têm comportamento padrão a menos que sejam explicitamente configurados.

        Assertions.assertEquals("B", letras.get(0)); //Esta linha verifica se a chamada letras.get(0) realmente retorna "B". A asserção garante que o comportamento configurado do mock está funcionando conforme o esperado.
    }
}
