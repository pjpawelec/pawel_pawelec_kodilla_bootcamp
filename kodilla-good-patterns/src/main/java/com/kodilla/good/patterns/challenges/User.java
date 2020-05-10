package com.kodilla.good.patterns.challenges;

public class User {
    private String userId;

    User (String UserId){
        this.userId = UserId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "" + userId;
    }
}
