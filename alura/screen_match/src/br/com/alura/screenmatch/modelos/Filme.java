package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;
    public Filme (String nome, int anoDeLancamento, int duracaoEmMinutos) {
        super(nome, anoDeLancamento);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
    }

    // get e set
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public static void main(String[] args) {

    }

    @Override
    public int getClassificacao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
