import br.luiz.spotijava.Musica;

public class Main {
    public static void main(String[] args) {
        // atribuicoes
        Musica minhaMusica = new Musica();

        // métodos
        minhaMusica.setTitulo("Música bonita");
        minhaMusica.setDuracao(3);
        minhaMusica.reproduzir(1);
        minhaMusica.reproduzir(1);
        minhaMusica.reproduzir(1);
        minhaMusica.curtir(1);
        minhaMusica.curtir(1);
        minhaMusica.curtir(1);


        // print
        System.out.println(minhaMusica.getTotalDeReproducoes());
        System.out.println(minhaMusica.getCurtidas());
        minhaMusica.ficha();
    }
}