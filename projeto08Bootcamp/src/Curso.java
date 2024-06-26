public class Curso extends Conteudo{
    
    private int cargaHoraria;
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "\nTitulo: " + getTitulo() + "\nDescricao:" + getDescricao() + "\nData: " + cargaHoraria;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    
}
