import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0; // O saldo vai somando ou subtraindo ao decorrer do programa então ele deve iniciar com valor = 0

        while (true) { // Enquanto o while for verdadeiro ele vai repetir a estrutura infinitamente
            System.out.println("1. Depositar \n2. Sacar \n3. Consultar Saldo \n0. Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) { 
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado; // Saldo = saldo + valorDepositado
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado");
                    double valorSacado = scanner.nextDouble();

                    if (valorSacado > saldo) { // Se o valor for menor que o saldo disponível, o programa vai dizer que tem saldo insuficiente
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSacado; // Saldo = saldo - valorDepositado
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 0:
                    System.out.println("Saldo atual: R$" + saldo + "\n Programa encerrado.");
                    return; // Fecha o while
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            scanner.close();
        }
    }
}
