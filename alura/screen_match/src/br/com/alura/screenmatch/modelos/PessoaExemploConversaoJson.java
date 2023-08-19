package br.com.alura.screenmatch.modelos;

public class PessoaExemploConversaoJson {
    public String nome;
    public int idade;
    public String email;

    public PessoaExemploConversaoJson(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }
}
