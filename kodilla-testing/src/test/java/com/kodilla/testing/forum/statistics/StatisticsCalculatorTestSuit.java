package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuit {

    @Test
    public void testCalculateAdvStatistics() {

        //Statistics statistics2 = new StatisticsStub();
        //StatisticsCalculator statistics = new StatisticsCalculator(statistics2.userNames(), statistics2.postCount(), statistics2.commentCount());

        Statistics statisticsMock = mock(Statistics.class);

        List<String> forumUsers = new ArrayList<>();
        forumUsers.add("John");
        forumUsers.add("Ann");
        forumUsers.add("Albert");
        when(statisticsMock.userNames()).thenReturn(forumUsers);
        when(statisticsMock.postCount()).thenReturn(15);
        when(statisticsMock.commentCount()).thenReturn(30);

        StatisticsCalculator statistics = new StatisticsCalculator(statisticsMock);

        statistics.calculateAdvStatistics();
        int resultUsers = statistics.getUsersNumber();
        int resultPosts = statistics.getPostsNumber();
        int resultComments = statistics.getCommentsNumber();
        double resultAvgPostsUsers = statistics.getAvgPostsForUser();
        double resultAvgCommentsUser = statistics.getAvgCommentsForUser();
        double resultAvgCommentsPost = statistics.getAvgCommentsForPost();

        Assert.assertEquals(3, resultUsers, 0.00001);
        Assert.assertEquals(15, resultPosts, 0.00001);
        Assert.assertEquals(30, resultComments, 0.00001);
        Assert.assertEquals(5, resultAvgPostsUsers,0.00001);
        Assert.assertEquals(10, resultAvgCommentsUser,0.00001);
        Assert.assertEquals(2, resultAvgCommentsPost,0.00001);
    }
}