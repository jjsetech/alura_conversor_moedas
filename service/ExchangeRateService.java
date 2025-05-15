package service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateService {

    private static final String API_KEY = "62725e03ea3c96a0276e0989"; //
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double convertCurrency(String from, String to, double amount) throws IOException {
        String endpoint = BASE_URL + API_KEY + "/latest/" + from;
        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("Falha na requisição: Código HTTP " + responseCode);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder jsonBuffer = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            jsonBuffer.append(line);
        }
        reader.close();

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonBuffer.toString(), JsonObject.class);
        double rate = jsonObject.getAsJsonObject("conversion_rates").get(to).getAsDouble();

        return amount * rate;
    }
}
