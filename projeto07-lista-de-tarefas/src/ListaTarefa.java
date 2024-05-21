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
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){// Posso ter dois elementos com a mesma descrição, por isso foi feito um laço de repetição, ele vai percorrer cada item e comparar se a descrição passada é a mesma que tem no array, se sim, vai ser removido
            if(t.getDescricao().equalsIgnoreCase(descricao)){ //Se a descrição da tarefa for igual a descrição que está sendo passada de parâmetro no remover tarefa, vai adicionar a tarefa no "tarefas para remover"
                tarefasParaRemover.add(t);
            }
        } 
        tarefaList.removeAll(tarefasParaRemover); //Remove do tarefa list tudo que estiver dentro do tarefas para remover
    }

    // Metodo obter numeros totais de tarefa
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
