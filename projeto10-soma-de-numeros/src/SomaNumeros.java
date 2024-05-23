import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }
    
    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeroList)
            soma += numero;
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeroList.isEmpty()){
            for(Integer numero : numeroList){
                if(numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeroList.isEmpty()){
            for(Integer numero : numeroList){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) throws Exception {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        somaNumeros.exibirNumeros();

        System.out.println("O menor número da lista é: "+ somaNumeros.encontrarMenorNumero());

        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("A soma de todos os números é: " + somaNumeros.calcularSoma());
    }
}
