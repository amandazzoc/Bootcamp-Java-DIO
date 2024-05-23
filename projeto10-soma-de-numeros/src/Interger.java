public class Interger {
    public static final int MIN_VALUE = 0;
    private int numero;

    @Override
    public String toString() {
        return "numeros: "+ numero;
    }

    public Interger(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
