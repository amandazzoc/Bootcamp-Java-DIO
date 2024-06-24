import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble mediaMaioresQue5 = numeros.stream()
        .filter(n -> n > 5) //Filtra
        .mapToInt(Integer::intValue) //Transforma para int
        .average(); //Faz a média
         //.reduce(0, (num1, num2) -> (num1 + num2)/2)Não é recomendado

        if(mediaMaioresQue5.isPresent()){
            System.out.println("A media dos números maiores que 5 é: " + mediaMaioresQue5.getAsDouble());
        }else{
            System.out.println("Nenhum número maior que 5 foi encontrado");
        }
        
    }
}
