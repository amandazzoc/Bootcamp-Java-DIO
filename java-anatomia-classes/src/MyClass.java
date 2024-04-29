public class MyClass { 
    public static void main (String [] args) { 
        String primeiroNome = "Amanda";
        String segundoNome = "Oliveira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}