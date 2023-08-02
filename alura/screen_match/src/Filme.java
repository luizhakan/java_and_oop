public class Filme {
    // modelo
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    // métodos
    void exibeFichaTecnica () {
        System.out.printf("O filme: '%s' foi lançado em %d e tem %d minutos", nome, anoDeLancamento, duracaoEmMinutos);
    }

    void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    void pegaMedia () {
        System.out.printf("Média: %.2f", somaDasAvaliacoes / totalAvaliacoes);
    }
    public static void main(String[] args) {

    }
}
