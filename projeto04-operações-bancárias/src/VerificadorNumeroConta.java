import java.util.Scanner; 

public class VerificadorNumeroConta 
{ 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        try { // O programa vai tentar executar o código
            System.out.println("Digite o número da sua conta");
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta); // Chama o método para verificar o número da conta
        } catch (IllegalArgumentException e) { // Caso tenha uma excessão (+ ou - que 8 digitos) ele vai pegar a excessão e mandar uma mensagem de erro
            System.out.println("Erro: Numero de conta invalido.\nDigite exatamente 8 digitos.");; 
        } finally { // Finalmente ele vai fechar o scanner após verificar tudo
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException{ 
        if (numeroConta.length() != 8){ // Se o tamanho do numeroConta for diferente de 8, vai ativar a excessão
            throw new IllegalArgumentException(); // Chamando a excessão que vai apontar para a mensagem da linha 14
        }else{
            System.out.println("Numero de conta valido.");
        }
        }
}
