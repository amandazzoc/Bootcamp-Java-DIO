import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros(){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            Collections.sort(numerosAscendente);
            return (numerosAscendente);
        }else{
            throw new RuntimeException("A lista está vazia");
        }
        
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
        System.out.println(this.numeroList);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(67);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(231);

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
