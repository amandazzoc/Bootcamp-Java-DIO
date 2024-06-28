package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    // @BeforeAll
    // void setup(){
    //     MockitoAnnotations.initMocks(this);
    // }

    // private ApiDosCorreios apiDosCorreios = Mockito.mock(ApiDosCorreios.class);
    @Mock
    private ApiDosCorreios apiDosCorreios; //Mockou a API dos correios

    @InjectMocks //Injetandoo mock da API dos correios na classe
    private CadastrarPessoa1 cadastrarPessoa1;

    @Test 
    void validarDadosDeCadastro(){
        DadosLocalizacao dados = new DadosLocalizacao("SP", "Sete Barras", "Rua Hum", "Frente ao posto", "Ribeirão da Serra");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("11910000")).thenReturn(dados); //Quando a API dos correios for chamada, ao invés de buscar informações da API, me retorna esses dados aqui (dados)
        Pessoa pessoa = cadastrarPessoa1.cadastrarPessoa("Amanda", "3472842", LocalDate.now(), "11910000");

        Assertions.assertEquals("Amanda", pessoa.getNome());
        Assertions.assertEquals("3472842", pessoa.getDocumento());
        Assertions.assertEquals("SP", pessoa.getEndereco().getUf());
        Assertions.assertEquals("Sete Barras", pessoa.getEndereco().getCidade());
    }

}
