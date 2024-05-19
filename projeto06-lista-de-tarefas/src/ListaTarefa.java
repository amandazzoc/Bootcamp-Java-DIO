import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // Atributo
    private List<Tarefa> tarefaList;

    // Construtor para sempre que eu chamar o tarefa list ele já ter sido criado uma lista vazia
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Metodo adicionar tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Metodo remover tarefa
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>()
        for(Tarefa t : tarefaList){// Posso ter dois elementos com a mesma descrição, por isso foi feito um laço de repetição, ele vai percorrer cada item e comparar se a descrição passada é a mesma que tem no array, se sim, vai ser removido
            if(t.getDescricao().equalsIgnoreCase(descricao));{
                tarefasParaRemover.add(t);
            }

        } 
    }
}
