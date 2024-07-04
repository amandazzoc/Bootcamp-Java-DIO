package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Responsavel por designar o bean de component que suporta requisições HTTP com base na arquitetura REST
public class WelcomeController {
     @GetMapping //Determina que o método aceitara requisições HTTP do tipo GET
    public String welcome(){
        return "Welcome to My Spring Boot WEB API";
    }
}
