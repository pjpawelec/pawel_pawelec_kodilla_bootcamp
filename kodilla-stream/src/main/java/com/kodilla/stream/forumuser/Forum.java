package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
        forumUsers.add(new ForumUser(1001, "Jarosław Kowalski", 'M', 1979, 5, 12, 0));
        forumUsers.add(new ForumUser(1002, "Jan Nowak", 'M', 1995, 1, 2, 4));
        forumUsers.add(new ForumUser(1003, "Adam Lipiński", 'M', 2000, 3, 5, 11));
        forumUsers.add(new ForumUser(1004, "Tomasz Banach", 'M', 1999, 12, 22, 2));
        forumUsers.add(new ForumUser(1005, "Joanna Nowacka", 'F', 2007, 11, 30, 5));
        forumUsers.add(new ForumUser(1006, "Anna Górska", 'F', 1989, 1, 7, 0));
        forumUsers.add(new ForumUser(1007, "Monika Stach", 'F', 1995, 2, 3, 0));
        forumUsers.add(new ForumUser(1008, "Ewelina Gran", 'F', 1996, 4, 14, 7));
    }

    public List<ForumUser> getUserList(){
        return forumUsers;
    }
}
