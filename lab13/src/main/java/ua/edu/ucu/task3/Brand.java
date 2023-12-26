package ua.edu.ucu.task3;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Brand {
    private String description;
    private String name;
    private String logo;

    public Brand(String name, String description, String logo) {
        this.name = name;
        this.description = description;
        this.logo = logo;
    }
}
