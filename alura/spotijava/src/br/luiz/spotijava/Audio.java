package br.luiz.spotijava;

public abstract class Audio implements Metodos {
    // modelo
    private String titulo;
    private int duracao;
    protected int totalDeReproducoes;
    protected int curtidas;

    // get e set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes += reproduzir(1);
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    @Override
    public int reproduzir() {
        return 0;
    }

    // métodos da interface
    public abstract int reproduzir(int reproducao);

    @Override
    public int curtir() {
        return 0;
    }

    @Override
    public void ficha() {
        System.out.printf("A música '%s' já tem %d curtidas!", titulo, curtidas);
    }

    public abstract int curtir(int curtir);
}
