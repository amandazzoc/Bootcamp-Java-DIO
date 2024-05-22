import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){//Se a lista estiver vazia retorna true, se for false começa o metodo
            for(Livro t : livroList){
                if(t.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(t);
                }
            }
        }
        return livrosPorAutor;
    }
}
