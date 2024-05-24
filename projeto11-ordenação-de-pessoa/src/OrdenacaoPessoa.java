import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(altura, idade, nome));
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList); 
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); // Vai entender que quer ordena pelo comparator
        return pessoasPorAltura;
    }

    public void mostrarLista(){
        System.out.println(this.pessoaList);
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Amanda", 18, 1.56);
        ordenacaoPessoa.adicionarPessoa("Edgar", 24, 1.70);
        ordenacaoPessoa.adicionarPessoa("Pedro", 22, 1.87);
        ordenacaoPessoa.adicionarPessoa("Suellen", 32, 1.57);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        ordenacaoPessoa.mostrarLista();
    }
}
