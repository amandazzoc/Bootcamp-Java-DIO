import java.util.Arrays;
import java.util.List;

public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .mapToInt(Desafio08::somarDigitos)
                .sum();

        System.out.println("A soma dos dígitos de todos os números é: " + somaDigitos);
    }

    private static int somarDigitos(int numero){
        int soma = 0;
        while (numero != 0){
            soma += numero % 10; //Adiciona o último dígito à soma
            numero /= 10; //Remove o último dígito do número
        }
        return soma;
    }
}
