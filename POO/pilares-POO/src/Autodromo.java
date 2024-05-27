
public class Autodromo {
    public static void main(String[] args){
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("54534");
        // jeep.confereCambio();
        // jeep.confereCombustivel();
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("45346");
        //z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
