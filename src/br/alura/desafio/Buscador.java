package br.alura.desafio;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscador {
        private String key = "";
    public Moeda busca (Moeda moeda){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/"+key+"/latest/"+ moeda.getPalavraChave()))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
           return  gson.fromJson(response.body(), Moeda.class);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro na busca");;
        }return null;
    }

}
