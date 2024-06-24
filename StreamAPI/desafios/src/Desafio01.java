import java.util.Arrays;
import java.util.List;

public class Desafio01 {

    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream()
        .sorted() //Ordena
        .toList(); //Faz uma nova lista

        numerosOrdenados.forEach(System.out::println);
    }
}
