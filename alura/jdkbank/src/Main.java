import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // atribuições
        Scanner leitura = new Scanner(System.in);
        boolean condicao = true;
        ArrayList<String> itens = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>(); // Adicionamos um ArrayList para armazenar os valores dos itens
        System.out.printf("Digite o limite do seu cartão: R$");
        double limite = leitura.nextDouble();
        double saldo = limite;

        while (condicao) {
            // print
            System.out.printf("Saldo disponível: R$%.2f\n", saldo);

            // item a comprar
            System.out.printf("Item a comprar: ");
            String item = leitura.next();

            // valor do item
            System.out.printf("Valor do %s: R$", item);
            double valor = leitura.nextDouble();

            // print de confirmação
            System.out.printf("Você deseja realmente comprar um %s no valor de %.2f? (1) Sim - (2) Não: ", item, valor);
            int confirmacao = leitura.nextInt();

            switch (confirmacao) {
                case 1:
                    System.out.printf("Analisando o cartão...\n");
                    break;
                case 2:
                    System.out.printf("Compra cancelada!\n");
                    continue; // Volta para o início do loop sem adicionar na fatura
                default:
                    System.out.printf("Opção inválida!\n");
                    continue; // Volta para o início do loop sem adicionar na fatura
            }

            if (saldo < valor) {
                System.out.printf("Saldo insuficiente!\n");
            } else {
                System.out.printf("Compra realizada com sucesso!\n");
                itens.add(item);
                valores.add(valor); // Adiciona o valor do item ao ArrayList de valores
                saldo -= valor;
            }

            // opção de saída
            if (saldo == 0) {
                condicao = false;
            } else {
                System.out.printf("Digite 0 pra sair ou 1 para continuar: ");
                int saida = leitura.nextInt();

                if (saida != 1) {
                    condicao = false;
                }
            }
        }

        System.out.printf("------------------------\n");
        System.out.printf("Fatura:\n");

        // Itera sobre os itens e valores para mostrar a fatura
        for (int i = 0; i < itens.size(); i++) {
            System.out.printf("%s - R$%.2f\n", itens.get(i), valores.get(i));
        }

        System.out.printf("Saldo: R$", saldo);
    }
}
