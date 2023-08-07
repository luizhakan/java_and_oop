import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // atribuicoes
        Filme meuFilme = new Filme();
        Serie lost = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        Filme outroFilme = new Filme();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Episodio episodio = new Episodio();
        var filmeDoLuiz = new Filme();
        ArrayList<Filme> listaDeFilmes = new ArrayList<>(); // utilizando ArrayList para armazenar uma lista de filmes

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2009);
        outroFilme.setDuracaoEmMinutos(100);

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);

        // funcoes
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        filtro.filtra(meuFilme);
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        filmeDoLuiz.setNome("Rambo: Até o fim");
        filmeDoLuiz.setAnoDeLancamento(2019);
        filmeDoLuiz.avalia(10);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoLuiz);

        // print
        System.out.printf("\nTotal de avaliações: %d\n", meuFilme.getTotalAvaliacoes());
        meuFilme.pegaMedia();
        lost.exibeFichaTecnica();
        System.out.printf("\nDuração em horas para maratonar %s: %dh\n", lost.getNome(), lost.getDuracaoEmMinutos());
        System.out.println(calculadora.getTempoTotal());
        System.out.println(listaDeFilmes);

        // loop
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            listaDeFilmes.get(i).exibeFichaTecnica();
        }
    }
}