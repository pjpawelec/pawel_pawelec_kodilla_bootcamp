package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuit {
    @Test
    public void testDoDrawingWithCircle(){
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a circle", result);
    }

    @Test
    public void testDoDrawingWithTrangle(){
        //Given
        Trangle trangle = new Trangle();
        //When
        Drawer drawer = new Drawer(trangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a trangle", result);
    }
}
