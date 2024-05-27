import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois); // Chama o método 'contar'
        } catch (ParametrosInvalidosException e) { 
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage()); //Captura a mensagem
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException { // O método contar possui uma exceção que ficara armazenada no método
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro"); //Se o parametro um for maior ou igual ao parametro dois, irá aparecer uma mensagem de aviso
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i); //O i começa no 1, enquanto o i for menor ou igual ao resultado do parametrodois menos paramentroum, o i vai somar mais 1
        }
    }
}
