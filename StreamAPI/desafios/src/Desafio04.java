import java.util.Arrays;
import java.util.List;

public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosSemImpares = numeros.stream()
        .filter(n -> n % 2 == 0) //Filtra
        .toList(); //Transforma em Lista

        numerosSemImpares.forEach(System.out::println);
    }
}
