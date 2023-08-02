public class Principal {
    public static void main(String[] args) {
        // atribuicoes
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;

        // funcoes
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        // print
        System.out.println("\n" + meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        meuFilme.pegaMedia();
        System.out.println(meuFilme);
    }
}