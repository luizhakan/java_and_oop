package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();


        System.out.printf("Digite um filme para busca: ");
        String busca = leitura.nextLine();
//        busca = busca.replace(" ", "+");
        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=ef7a03d3";

//        try/catch

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

//        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
//        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println("Titulo: " + meuTituloOmdb.toString());


            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo convertido: ");
            System.out.println(meuTitulo);
        }
        catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ocorreu algum erro na busca, verifique o endereço: " + e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println("Exception criada: ");
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Programa finalizou!");
        }
    }
}
