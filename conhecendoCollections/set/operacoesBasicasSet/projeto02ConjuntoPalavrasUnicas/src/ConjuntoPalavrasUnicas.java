import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private final Set<PalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        PalavrasUnicas palavrasParaRemover = null;
        for(PalavrasUnicas c : palavrasUnicasSet){
            palavrasParaRemover = c;
            break;
        }
        palavrasUnicasSet.remove(palavrasParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(new PalavrasUnicas(palavra));
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Kotlin");
        conjuntoPalavrasUnicas.adicionarPalavra("Kotlin");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Java");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Python"));
    }
}

