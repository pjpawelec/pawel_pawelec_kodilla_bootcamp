package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Case test begin");
    }

    @After
    public void after() {
        System.out.println("Case test ended");
    }

    @Test
    public void testOddNumbersExaminatorEmptyList(){
        System.out.println("Testing if empty.");
        ArrayList<Integer> empty = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        int result = oddNumbersExterminator.exterminate(empty);
        Assert.assertTrue(result==0);
    }

    @Test
    public void testOddNumberExaminatorNormalList(){
        System.out.println("Testing if contain both even and odd.");
        ArrayList<Integer> evenAndOdd = new ArrayList<Integer>();
        evenAndOdd.add(1);
        evenAndOdd.add(2);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        int result = oddNumbersExterminator.exterminate(evenAndOdd);
        Assert.assertTrue(result==1);

    }
}
