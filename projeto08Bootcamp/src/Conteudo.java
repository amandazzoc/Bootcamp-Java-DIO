public abstract class Conteudo { //Foi criada para que possa criar os atributos e o calcularXP nas classes filhas, mas não vai ser instanciada
    protected static final double XP_PADRAO = 10d;
    
    private String titulo;
    private String descricao;

    public abstract double calcularXp(); //O abstract diz que eu não consigo criar um conteudo sem calcular o XP

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
