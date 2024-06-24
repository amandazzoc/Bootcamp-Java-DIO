import java.util.Arrays;
import java.util.List;

public class Desafio09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Boolean numerosDistintos = numeros.stream()
        .distinct() //Retira os números repetidos
        .count() == numeros.size(); //Compara se o tamanho da lista pós retirar os repetidos, é o mesmo tamanho da lista original

        System.out.println("Os números são distintos?: " + numerosDistintos);
    }
}
