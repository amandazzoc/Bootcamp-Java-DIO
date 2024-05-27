public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // A tv liga e desliga
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // O volume aumenta em +1 e diminui em -1
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    // A tv deve mudar o canal de 1 em 1 ou digitando o número correspondente
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal){ // O usuário vai informar o novo canal então deve ser um parâmetro
        canal = novoCanal;
    }
}