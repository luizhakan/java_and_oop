package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        // atribuições
        Filme meuFilme = new Filme("O poderoso chefão", 1972, 175);
        Serie lost = new Serie("Lost", 2004, 6);
        Filme outroFilme = new Filme("Avatar", 2009, 100);
        var filmeDoLuiz = new Filme("Rambo: Até o fim", 2019, 89);
        ArrayList<Titulo> lista = new ArrayList<>(); // utilizando ArrayList para armazenar uma lista de filmes
        Filme f1 = filmeDoLuiz;
        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Luiz Hakan");
        buscaPorArtista.add("Jason Stathan");
        buscaPorArtista.add("Sylvester Stallone");

        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoLuiz);
        lista.add(lost);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        // print
        System.out.println("Testando f1: " + f1.getNome());
        System.out.println(buscaPorArtista);
        System.out.println("Filmes: " + lista);

        // metodo
        Collections.sort(buscaPorArtista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        // print excessão
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        System.out.println("Depois da ordenação por ano de lançamento: " + lista);

        // loop
        lista.forEach(nome -> System.out.println(nome.getNome()));

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            }
    }
}