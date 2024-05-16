
public class Carro extends Veiculo{
    
    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO"); // Agora ele verifica o cambio e o combustivel antes de ligar
    }
    /*
     * public void confereCombustivel(){
     * System.out.println("CONFERINDO COMBUSTÍVEL");
     * }
     * public void confereCambio(){
     * System.out.println("CONFERINDO CAMBIO EM P");
     * }
     * Não é boa pratica todos os métodos serem publicos, então faremos o
     * encapsulamento
     */

    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }

    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO EM P");
    }

    
}
