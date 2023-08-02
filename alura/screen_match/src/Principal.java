import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        // atribuicoes
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);

        // funcoes
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        // print
//        System.out.println("\n" + meuFilme.somaDasAvaliacoes);
        System.out.printf("\nTotal de avaliações: %d\n", meuFilme.getTotalAvaliacoes());
        meuFilme.pegaMedia();
    }
}