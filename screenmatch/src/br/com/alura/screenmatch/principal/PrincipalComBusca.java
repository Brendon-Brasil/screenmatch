package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    static void main() throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        var busca = sc.nextLine();

        String pesquisar = "https://www.omdbapi.com/?t=" + busca + "&apikey=3d0f9078";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(pesquisar))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        sc.close();
    }
}
