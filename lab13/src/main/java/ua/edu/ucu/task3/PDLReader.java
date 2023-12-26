package ua.edu.ucu.task3;

import org.json.JSONObject;

import lombok.SneakyThrows;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader implements Reader {
    @SneakyThrows
    public JSONObject extract(String brand) {
        String API_KEY = "";
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + brand);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);
        return jsonObject;
    }
}
