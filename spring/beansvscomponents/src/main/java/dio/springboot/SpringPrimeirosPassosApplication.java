package dio.springboot;

import com.google.gson.Gson;
import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception { // interface usada para executar um código quando a aplicação Spring Boot é inicializada Este bean recebe um ConversorJson como parâmetro e o usa para converter um JSON em um objeto ViaCepResponse. Depois, imprime os dados desse objeto.
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}"; // um json
			ViaCepResponse response = conversor.converter(json); // o via cep response vai converter o json passado
			System.out.println("Dados do CEP: " + response); // mostra a conversão
		};
	}

}