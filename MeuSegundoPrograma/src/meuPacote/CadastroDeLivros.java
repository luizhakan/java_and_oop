package meuPacote;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.autorAdicionaNome("Luiz Hakan");
        autor.autorAdicionaEmail("luizhakan2@protonmail.com");
        autor.autorAdicionaCpf("132.456.789-10");

        Livro livro = new Livro();
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.autor = autor;

        Livro outroLivro = new Livro();
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");
        // outroLivro.autor = autor;
    }
}