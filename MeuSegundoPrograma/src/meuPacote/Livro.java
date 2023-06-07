package meuPacote;

public class Livro {
    public static class Autor {
        String nome;
        String email;
        String cpf;

        void mostrarDetalhes(){
            System.out.printf("\nO livro foi escrito por %s, cujo CPF é: %s e email é: %s %n--\n", nome, cpf, email);
        };
    }

//    public meuPacote.Livro(){
//        System.out.printf("Novo livro criado\n");
//    }

    boolean temAutor(){
        return this.autor != null;
    };

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.3){
            System.out.println("Desconto não pode ser maior que 30%");
            return false;
        } else {
            valor -= this.valor * porcentagem;
            return true;
        }
    }

    void mostrarDetalhes(){
        System.out.printf("O livro %s identificado pelo ISBN: %s, custa R$%.2f.",  nome, isbn, valor);
        if (this.temAutor()){
          autor.mostrarDetalhes();
        } else {
            System.out.printf("\nNão tem detalhe do autor%n--\n");
        };
    };

    public static void main(String[] args){
        /* meuPacote.Livro livro1 = new meuPacote.Livro();
        meuPacote.Livro livro2 = new meuPacote.Livro();
        meuPacote.Livro livro3 = new meuPacote.Livro(); */

        Autor autor = new Autor();
        autor.nome = "Luiz Hakan";
        autor.email = "luizhakan2@protonmail.com";
        autor.cpf = "132.456.789-10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;

        String nome = "Luiz";
        String info = String.format("Eu sou %s", nome);
        System.out.println(info);

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";
        //  outroLivro.autor = autor;

        livro.mostrarDetalhes();
        outroLivro.mostrarDetalhes();
    }
}
