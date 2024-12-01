package task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BrandFetchReader {

    public String BRAND_FETCH_URL = "https://api.brandfetch.io/v2/brands/";
    public String API_KEY = "";

    public Company fetch(String companyName) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(BRAND_FETCH_URL + companyName))
                .header("Authorization","Bearer " + API_KEY)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.body(), Company.class);
    }

}
