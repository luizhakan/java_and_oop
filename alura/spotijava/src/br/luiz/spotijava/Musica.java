package br.luiz.spotijava;

public class Musica extends Audio {
    public static void main(String[] args) {

    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes += reproduzir(1);
    }

    @Override
    public int reproduzir(int reproducoes) {
        totalDeReproducoes += reproducoes;
        return totalDeReproducoes;
    }

    @Override
    public int curtir (int curtir) {
        curtidas += curtir;
        return curtidas;
    }

}
