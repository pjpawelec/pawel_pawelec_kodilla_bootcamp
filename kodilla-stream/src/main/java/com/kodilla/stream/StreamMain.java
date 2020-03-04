package com.kodilla.stream;


import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, Object> usersResultList = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.ageToday() == true)
                .filter(user -> user.getPublicatedPostNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user.getUserName()));

        System.out.println("Liczba użytkowników spełniających warunki: " + usersResultList.size());
        usersResultList.entrySet().stream()
                .map(entry -> entry.getKey() + ", " + entry.getValue())
                .forEach(System.out::println);
    }
}