public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Amanda " + "de " + "Oliveira " + "Costa"; //O + alem de adição, também é usado para concatenação
        // System.out.print(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao  = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
