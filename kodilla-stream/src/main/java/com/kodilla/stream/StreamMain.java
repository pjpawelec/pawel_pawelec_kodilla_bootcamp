package com.kodilla.stream;


import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, Object> usersResultList = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.userOlderThanExpectedAge(20) == true)
                .filter(user -> user.getPublicatedPostNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user.getUserName()));

        System.out.println("Liczba użytkowników spełniających warunki: " + usersResultList.size());
        usersResultList.entrySet().stream()
                .map(entry -> entry.getKey() + ", " + entry.getValue())
                .forEach(System.out::println);

        System.out.println(ArrayOperations.getAverage(IntStream.range(0, 21).toArray()));
    }
}