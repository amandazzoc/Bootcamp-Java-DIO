public class Usuario {
    public static void main(String[] args) throws Exception {
        // Cria um objeto
        SmartTv smartTv = new SmartTv();

        // Mudar canal
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual: " + smartTv.canal);
        
        // Apertei 3 vezes em diminuir volume e 1 vez em aumentar
        smartTv.diminuirVolume(); // 24
        smartTv.diminuirVolume(); // 23
        smartTv.diminuirVolume(); // 22
        smartTv.aumentarVolume(); // 23
        System.out.println("Volume Atual : " + smartTv.volume);

        // Padrão de quando ligar a tv
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // Chamando o método
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

    }
}
