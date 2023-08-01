import java.util.Scanner;

public class ContaBancaria {
    public static void main (String args[]) {
        // variável
        String nomeDoCliente = "Luiz Hakan";
        String tipoDeConta = "corrente";
        double saldo = 0;
        Scanner leitura = new Scanner(System.in);
        boolean validador = true;
        double receber = 0, enviar = 0;

        // print
        System.out.println(".........................");
        System.out.printf("Nome do cliente: %s\n", nomeDoCliente);
        System.out.printf("Saldo: R$%.2f\n", saldo);
        System.out.printf("Tipo de conta: %s\n", tipoDeConta);
        System.out.println(".........................\n");

        // loop e condicional
        while (validador) {
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.printf("Escolha uma opção: ");

            int opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.printf("\nO seu saldo é: R$%.2f\n", saldo);
            } else if (opcao == 2) {
                System.out.printf("Digite o valor que receberá: R$");
                receber = leitura.nextDouble();
                saldo += receber;
            } else if (opcao == 3) {
                System.out.printf("Digite o valor que irá enviar: R$");
                enviar = leitura.nextDouble();
                if (enviar > saldo) {
                    System.out.printf("Você não tem saldo suficiente, seu saldo é: R$%.2f\n", saldo);
                } else {
                    System.out.println("Transferência realizada com sucesso!");
                    saldo -= enviar;
                }
            } else if (opcao == 4) {
                validador = false;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
