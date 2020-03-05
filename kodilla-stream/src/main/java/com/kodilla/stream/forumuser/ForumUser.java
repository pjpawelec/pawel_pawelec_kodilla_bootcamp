package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public final class ForumUser {
    final private int userId;
    final String userName;
    final private char sex;
    final private LocalDate birthDate;
    final private int publicatedPostNumber;

    public ForumUser(int userId, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int publicatedPostNumber) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publicatedPostNumber = publicatedPostNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublicatedPostNumber() {
        return publicatedPostNumber;
    }

    public boolean userOlderThanExpectedAge(int age){
        LocalDate ageTresholdDate = LocalDate.now().minusYears(age).plusDays(1);
        boolean result = birthDate.isBefore(ageTresholdDate);
        return result;
    }
}
