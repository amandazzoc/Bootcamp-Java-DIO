public abstract class Conta implements InterfaceConta{

    protected static int 
    protected int agencia;
    protected int numero;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
       
    }
    @Override
    public void depositar(double valor) {
        
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        
    }

}
