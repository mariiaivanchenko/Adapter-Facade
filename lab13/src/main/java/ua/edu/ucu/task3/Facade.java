package ua.edu.ucu.task3;

import org.json.JSONObject;

import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public class Facade {
    private static String brand;
    private static Reader reader;

    public Facade(Reader reader, String brand) {
        this.reader = reader;
        this.brand = brand;
    }

    @SneakyThrows
    public Brand extractFacade() {
        JSONObject result = reader.extract(brand);
        String name = result.optString("name");
        String description = result.optString("description");
        String logo = result.optJSONArray("logos").getJSONObject(0).optJSONArray("formats").getJSONObject(0).getString("src");

        return Brand.builder()
                .name(name)
                .description(description)
                .logo(logo)
                .build();
    }
}
