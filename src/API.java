import com.google.gson.Gson;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class API {
    String respuesta;
    String monedaConversora;

    public API(String respuesta, String monedaConversora) {
        this.respuesta = respuesta;
        this.monedaConversora = monedaConversora;
    }

    public float consultaAPI() throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/a00cea7582ddba1c4024b931/latest/" + respuesta;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

//        JsonElement jsonElement = gson.fromJson(response.body(), JsonElement.class);
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//        JsonObject monedas = jsonObject.getAsJsonObject("conversion_rates");

        ExchangeRates monedas = gson.fromJson(response.body(),ExchangeRates.class);

        float factor = monedas.conversion_rates().get(monedaConversora);


        return factor;
    }
}
