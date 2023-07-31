// importação
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // variável
        Scanner leitura = new Scanner(System.in); // de certa forma, é um "input". essa classe é utilizada para ler dados de entrada

        // prints e inputs
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); // essa variável filme vai receber o dado que o usuário inserir
        System.out.println("Digite o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.printf("O filme %s foi lançado em %d", filme, anoDeLancamento);
    }
}
