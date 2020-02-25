package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsStub implements Statistics {

    @Override
    public List<String> userNames() {
        List<String> forumUsers = new ArrayList<>();
        forumUsers.add("John");
        forumUsers.add("Ann");
        forumUsers.add("Albert");
        return forumUsers;
    }

    @Override
    public int postCount() {
        return 15;
    }

    @Override
    public int commentCount() {
        return 30;
    }

}