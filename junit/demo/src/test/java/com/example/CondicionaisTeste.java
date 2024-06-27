package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CondicionaisTeste {

    @Test
    // @EnabledIfEnvironmentVariable(named = "USER", matches = "amanda")
    // @EnabledOnOs(OS.LINUX) <--N rodou-->
    // @EnabledOnOs(OS.WINDOWS) <--rodou-->
    // @EnabledOnJre(JRE.JAVA_17) <--N rodou-->
    // @EnabledOnJre(JRE.OTHER) <--rodou-->
    // @EnabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_18)
    void validarAlgoSomenteNoUsuarioAmanda(){
        Assertions.assertEquals(10, 5 + 5); //Se sim ele vai verificar se 5 + 5 é 10
    }

}
