package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userName;

  /* public ForumUser(String userName) {
        this.userName = "John Smith";
    }*/

    public String getUserName() {
        return userName;
    }
}
