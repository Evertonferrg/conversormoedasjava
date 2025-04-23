import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateService {
    private static final String API_KEY = "d20e75eb07b8cf5edf7bdfea"; // Sua chave da exchangerate-api

    public static JsonObject getRates(String moedaBase) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

        if (!jsonObject.has("conversion_rates")) {
            throw new RuntimeException("Resposta inválida: campo 'conversion_rates' não encontrado.");
        }

        return jsonObject.getAsJsonObject("conversion_rates");
    }
}