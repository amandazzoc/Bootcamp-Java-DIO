public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("XXX Extrato Conta Corrente XXX");
        super.imprimirInfosComuns();

    }
    
}


