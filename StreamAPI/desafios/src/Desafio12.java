import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoDosNumeros = numeros.stream()
        .reduce(1, (a, b) -> a * b); //O 1 é euqivalente a "produto = 1", emtão se o valor inicial for 0, todo número multiplicado por 0 é 0, logo o resultado será 0

        System.out.println("O produto de todos os números da lista é: " + produtoDosNumeros);
    }
}
