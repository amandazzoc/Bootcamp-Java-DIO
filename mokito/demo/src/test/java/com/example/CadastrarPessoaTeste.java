package com.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
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

    @Test 
    void validarDadosDeCadastro(){
        
    }

}
