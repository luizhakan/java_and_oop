package meuPacote;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    void autorAdicionaNome(String nome) {
        this.nome = nome;
    };

    void autorAdicionaEmail(String email) {
        this.email = email;
    };

    void autorAdicionaCpf(String cpf) {
        this.cpf = cpf;
    }

    void mostrarDetalhes() {
        System.out.printf("\nO livro foi escrito por %s, cujo CPF é: %s e email é: %s %n--\n", nome, cpf, email);
    };
}