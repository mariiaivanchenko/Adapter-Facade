package ua.edu.ucu.task3;

import org.json.JSONObject;
import lombok.SneakyThrows;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class BrandReader implements Reader {
    private String key;

    public BrandReader(String key) {
        this.key = key;
    }

    @Override
    @SneakyThrows
    public JSONObject extract(String brand){
        String apiUrl = "https://api.brandfetch.io/v2/brands/" + brand;
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer " +  this.key);
        connection.setRequestProperty("accept", "application/json");
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);
        return jsonObject;
    };
}