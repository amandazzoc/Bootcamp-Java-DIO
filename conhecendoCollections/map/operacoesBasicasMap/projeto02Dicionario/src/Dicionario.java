import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    
    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("Não tem palavras no dicionário");
        }
    }

    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else{
            System.out.println("O dicionário está vazio");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if(!dicionarioMap.isEmpty()){
            definicaoPorPalavra = dicionarioMap.get(palavra);
            if(definicaoPorPalavra == null){
                System.out.println("Palavra não encontrada");
            }
        }else{
            System.out.println("O dicionário está vazio");
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) throws Exception {
        Dicionario dicionario = new Dicionario();
        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("java");
        dicionario.exibirPalavras();

        System.out.println("definição da palavra 'kotlin' é: "+  dicionario.pesquisarPorPalavra("kotlin"));

    }

    
}
