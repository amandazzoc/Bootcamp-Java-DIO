package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //1. Quando iniciar a aplicação crie um componente calculadora
public class MyApp implements CommandLineRunner{

    @Autowired //O container quando for inicializado já percebe que o componente precisa ser executado mas o componente MyApp precisou realizar uma injeção de dependencia para que eu tenha um objeto calculadora devidamente associado como  uma dependência
    private Calculadora calculadora; //2. Que vai receber outra calculadora
    @Override
    public void run(String... args) throws Exception {
		System.out.println("O resultado é: " + calculadora.somar(2, 7)); //3. E execute isso aqui
    }

}
