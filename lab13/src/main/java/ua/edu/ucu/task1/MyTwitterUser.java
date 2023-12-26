package ua.edu.ucu.task1;

import java.time.LocalDate;

public class MyTwitterUser implements User{
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getEmail();
    }
    @Override
    public String getCountry() {
        return twitterUser.getUserCountry();
    }

    @Override
    public LocalDate getLastAcriveDate() {
        return twitterUser.getUseractiveTime().toLocalDate();
    }
}
