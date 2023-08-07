package br.com.alura.screenmatch.modelos;

public abstract class Titulo {
    // modelo
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    // constructor


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    // get
    public int getTotalAvaliacoes () {
        return totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // métodos

    public void exibeFichaTecnica () {
        System.out.printf("O filme: '%s' foi lançado em %d e tem %d minutos\n", nome, anoDeLancamento, getDuracaoEmMinutos());
    }

    public void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public void pegaMedia () {
        System.out.printf("Média: %.2f\n", somaDasAvaliacoes / totalAvaliacoes);
    }

    public static void main(String[] args) {

    }
}
