public class ContaCorrente extends Conta{
    
    private static final int SEQUENCIAL = 1;

    public ContaCorrente(){
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
    
}


