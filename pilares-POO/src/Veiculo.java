
public abstract class Veiculo { //É abstrato pois ele não sabe como as coisas funcionam
    private String chassi;
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();
}
