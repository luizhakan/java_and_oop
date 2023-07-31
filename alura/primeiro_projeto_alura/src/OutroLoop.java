import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        // variável
        Scanner leitura = new Scanner(System.in); // de certa forma, é um "input". essa classe é utilizada para ler dados de entrada
        double mediaAvaliacao = 0, nota = 0;
        int totalDeNotas = 0;

        // loop
        while (nota != -1) {
            System.out.printf("Digite sua avaliação (-1 pra encerrar): ");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        // print
        System.out.printf("Média de avaliação: %.2f", mediaAvaliacao / totalDeNotas);
    }
}
