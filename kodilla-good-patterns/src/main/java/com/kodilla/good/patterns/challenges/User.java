package com.kodilla.good.patterns.challenges;

public class User {
    private String UserId;

    User (String UserId){
        this.UserId = UserId;
    }

    public String getUserId() {
        return UserId;
    }

    @Override
    public String toString() {
        return "" + UserId;
    }
}
