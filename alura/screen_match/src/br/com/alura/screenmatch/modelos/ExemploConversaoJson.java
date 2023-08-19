package br.com.alura.screenmatch.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExemploConversaoJson {
    public static void main(String[] args) {
        String json = """
                {
                    "nome": "Luiz",
                    "idade": 30,
                    "email": "luiz@email.com"
                }
                """;

        System.out.println(json);

        Gson gsonFrom = new Gson();

        PessoaExemploConversaoJson pessoa = gsonFrom.fromJson(json, PessoaExemploConversaoJson.class);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getEmail());

        // convertendo de objeto para json
        Gson gsonTo = new GsonBuilder().setPrettyPrinting().create();

        PessoaExemploConversaoJson luizHakan = new PessoaExemploConversaoJson("Luiz Hakan", 21, "luizhakan2@email.com");

        System.out.println(luizHakan);

        String luizHakanJson = gsonTo.toJson(luizHakan, PessoaExemploConversaoJson.class);
        System.out.println(luizHakanJson);
    }
}
