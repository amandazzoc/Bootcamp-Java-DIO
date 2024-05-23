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
        int maiorNumero = Interger.MIN_VALUE;
        if(!numeroList.isEmpty()){

        }
    }

    public static void main(String[] args) throws Exception {

    }
}
