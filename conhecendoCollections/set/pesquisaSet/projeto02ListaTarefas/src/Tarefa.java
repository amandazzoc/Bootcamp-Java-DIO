public class Tarefa {
    private String descricao;
    private boolean concluida;
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "descricao: " + descricao + ", concluida: " + concluida;
    }

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = false;
    }
    public String getDescricao() {
        return descricao;
    }
    public boolean isconcluida() {
        return concluida;
    }
    
    
}
