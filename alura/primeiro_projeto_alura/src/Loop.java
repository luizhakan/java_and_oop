import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // variável
        Scanner leitura = new Scanner(System.in); // de certa forma, é um "input". essa classe é utilizada para ler dados de entrada
        double mediaAvaliacao = 0, nota = 0;

        // loop
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite sua avaliação %d/3: ", i);
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        // print
        System.out.printf("Média de avaliação: %.2f", mediaAvaliacao / 3);
    }
}
