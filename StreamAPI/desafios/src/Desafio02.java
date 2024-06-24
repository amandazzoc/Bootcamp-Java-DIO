import java.util.Arrays;
import java.util.List;

public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int numerosParesSomados = numeros.stream()
        .filter(n -> n % 2 == 0) //Filtra
        .mapToInt(Integer::intValue) //Converte para int
        .sum(); //Soma

        System.out.println("A soma dos números pares é: " + numerosParesSomados);
    }
}
