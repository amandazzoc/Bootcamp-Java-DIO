import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalInt primoMaior = numeros.stream()
        .filter(Desafio14::ehPrimo) //Filtra por números primos
        .mapToInt(Integer::intValue) //Transforma em inteiro
        .sorted() //Ordena
        .max(); //Pega o maior (optional)

        if (primoMaior.isPresent()) {
            System.out.println("O maior número primo na lista é: " + primoMaior.getAsInt());
        } else {
            System.out.println("Não foi encontrado nenhum número primo na lista.");
        }
    }

    public static boolean ehPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
