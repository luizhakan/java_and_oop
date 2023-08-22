import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        List<JsonObject> enderecos = new ArrayList<>();

        JsonParser jsonParser = new JsonParser();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.printf("Digite um CEP (sem pontuações) ou digite sair para sair: ");
            busca = leitura.nextLine();
            String endereco = "https://viacep.com.br/ws/" + busca + "/json";

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            JsonObject jsonObject = jsonParser.parse(json).getAsJsonObject();
            System.out.println(json);

            // Imprimir os campos do JSON diretamente
            System.out.println("CEP: " + jsonObject.get("cep"));
            System.out.println("Logradouro: " + jsonObject.get("logradouro"));
            System.out.println("Complemento: " + jsonObject.get("complemento"));
            System.out.println("Bairro: " + jsonObject.get("bairro"));
            System.out.println("Localidade: " + jsonObject.get("localidade"));
            System.out.println("UF: " + jsonObject.get("uf"));
            System.out.println("IBGE: " + jsonObject.get("ibge"));
            System.out.println("GIA: " + jsonObject.get("gia"));
            System.out.println("DDD: " + jsonObject.get("ddd"));
            System.out.println("SIAFI: " + jsonObject.get("siafi"));

            System.out.println("jsonObject:\n");
            System.out.println(jsonObject);

            enderecos.add(jsonObject);
        }

        FileWriter escrita = new FileWriter("enderecos.json");
        escrita.write(gson.toJson(enderecos));
        escrita.close();

        System.out.println("Fim do programa!");
    }
}
