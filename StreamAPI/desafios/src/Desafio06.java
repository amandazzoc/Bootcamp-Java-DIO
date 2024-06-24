import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalInt maiorQue10 = numeros.stream()
        .filter(n -> n > 10) //Filtra
        .mapToInt(Integer::intValue) //Transforma em Int
        .findAny(); //Ve se algum deles é maior que 10
        
        if(maiorQue10.isPresent()){
            System.out.println("há números maiores que 10");
        }else{
            System.out.println("Não há números maiors que 10");
        }

    }
}
