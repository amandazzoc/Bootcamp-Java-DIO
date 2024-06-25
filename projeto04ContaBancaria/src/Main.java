public class Main {
    public static void main(String[] args) {
        Cliente amanda = new Cliente();
        amanda.setNome("Amanda");

        Conta cc = new ContaCorrente(amanda);
        Conta cp = new ContaPoupanca(amanda);

        cc.depositar(100);
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cp.sacar(5);
        cp.imprimirExtrato();
    }
}
