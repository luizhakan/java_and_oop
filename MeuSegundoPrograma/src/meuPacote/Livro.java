package meuPacote;

public class Livro {
    private boolean temAutor() {
        return this.autor != null;
    };

    protected String nome;
    protected String descricao;
    protected double valor;
    protected String isbn;
    protected Autor autor;

    protected void setNome(String nome) {
        this.nome = nome;
        ;
    }

    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    protected void setValor(double valor) {
        this.valor = valor;
    };

    protected void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    protected double getValor() {
        return this.valor;
    }

    protected boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        } else {
            valor -= this.valor * porcentagem;
            return true;
        }
    }

    protected void mostrarDetalhes() {
        System.out.printf("O livro %s identificado pelo ISBN: %s, custa R$%.2f.", nome, isbn, valor);
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        } else {
            System.out.printf("\nNão tem detalhe do autor%n--\n");
        }
        ;
    };

    public static void main(String[] args) {
        String nome = "Luiz";
        String info = String.format("Eu sou %s", nome);
        System.out.println(info);
    }
}
