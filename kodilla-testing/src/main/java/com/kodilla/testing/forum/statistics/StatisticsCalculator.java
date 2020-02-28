package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator implements Statistics{

    private List<String> users;
    private int posts;
    private int comments;

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double avgPostsForUser;
    private double avgCommentsForUser;
    private double avgCommentsForPost;

    public StatisticsCalculator(List<String> users, int posts, int comments) {
        this.users = users;
        this.posts = posts;
        this.comments = comments;
    }

    public StatisticsCalculator(Statistics statisticsMock) {
        this.users = statisticsMock.userNames();
        this.posts = statisticsMock.postCount();
        this.comments =  statisticsMock.commentCount();
    }

    public List userNames() {
        return users;
    }

    public int postCount() {
        return posts;
    }

    public int commentCount() {
        return comments;
    }

    public void calculateAdvStatistics() {

        usersNumber = users.size();
        postsNumber = posts;
        commentsNumber = comments;
        if(users.size() == 0) {
            avgPostsForUser = 0;
        } else{
            avgPostsForUser = posts / users.size();
        }
        if(users.size() == 0) {
            avgCommentsForUser = 0;
        } else{
            avgCommentsForUser = comments / users.size();
        }
        if(posts == 0) {
            avgCommentsForPost = 0;
        } else{
            avgCommentsForPost = comments / posts;
        }
    }

    public void showStatiscics(){
        System.out.println("Liczba użytkowników forum: " + usersNumber);
        System.out.println("Liczba postów na forum: " + posts);
        System.out.println("Liczba komentarzy na forum: " + comments);
        System.out.println("Średnia liczba postów na użytkownika: " + avgPostsForUser);
        System.out.println("Średnia liczba komentarzy na użytkownika: " + avgCommentsForUser);
        System.out.println("Średnia liczba komentarzy na post: " + avgCommentsForPost);
    }
    public int getUsersNumber(){
        return users.size();
    }
    public int getPostsNumber(){
        return postsNumber;
    }
    public int getCommentsNumber(){
        return commentsNumber;
    }
    public double getAvgPostsForUser(){
        return avgPostsForUser;
    }
    public double getAvgCommentsForUser(){
        return avgCommentsForUser;
    }
    public double getAvgCommentsForPost(){
        return avgCommentsForPost;
    }
}
