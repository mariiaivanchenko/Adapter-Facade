package ua.edu.ucu.task2;

public class Database extends БазаДаних{
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatdata() {
        return отриматиСтатистичніДані();
    }
}
