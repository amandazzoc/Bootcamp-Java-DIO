import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
        .distinct() //Remove números repetidos
        .sorted((n1,n2) -> n2 - n1) //Ordem decrescente
        .skip(1) //Pula o primeiro item
        .findFirst(); //Pega o "primeiro item" pois o primeiro mesmo foi pulado

        System.out.println("O segundo maior número da lista é: "+ segundoMaior.get());
    }
}
