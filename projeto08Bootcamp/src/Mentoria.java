import java.time.LocalDate;

public class Mentoria extends Conteudo{ //O Mentoria extende da classe conteúdo, o mentoria é filha da classe conteudo, tudo o que tiver no conteudo terá na mentoria mas nem tudo que estiver na mentoria vai estar no conteudo
    
    private LocalDate data;
    
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + getTitulo() + "\nDescricao:" + getDescricao() + "\nData: " + getData();
    }

    @Override
    public double calcularXp() {
       return XP_PADRAO + 20d;
    }

    
}
