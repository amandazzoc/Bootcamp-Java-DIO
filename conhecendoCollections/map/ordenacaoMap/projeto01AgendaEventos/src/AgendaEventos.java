
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
    }

    public void obterProximoEvento(){
        Set<LocalDate> dataSet = eventosMap.keySet();
    }

    public static void main(String[] args) throws Exception {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.ExibirAgenda();
    }
}
