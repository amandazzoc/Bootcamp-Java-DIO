
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void ExibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = eventosMap.keySet(); //Retorna todos os keys
        Collection<Evento> values = eventosMap.values(); //Retorna todos os valores */
        //eventosMap.get();

        LocalDate dataAtual = LocalDate.now(); //Metodo now retona a data atual
        LocalDate proximaData = null; //variaveis
        Evento proximoEvento = null; //variaveis

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        if(!eventosMap.isEmpty()){
            for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) { //O entry vai retornar um set que cada elemento é do tipo Map.Entry e apartir desse metodo ele retorna a chave e o valor
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento é o: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
                }
                
            }
        }else{
            System.out.println("A agenda está vazia");
        }

        
    }


    public static void main(String[] args) throws Exception {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.ExibirAgenda();
        
        agendaEventos.adicionarEvento(LocalDate.of(2024, 06, 22), "Não sei", "Não sei também");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 04, 9), "Aniversário Amanda", "Amanda");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 9), "Aniversário Edgar", "Edgar");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 05, 4), "Aniversário Camila", "Camila");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 06, 23), "Quermesse", "Bingo");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 06, 22), "Show", "Antony e Gabriel");

        agendaEventos.ExibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
