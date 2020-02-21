package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuit {

    private static int counter = 0;

    @Before
    public void before(){
        System.out.println("Test # " + counter);
        counter++;
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector theShape = new ShapeCollector();
        Trangle exampleFigure = new Trangle(3,2);

        //When
        theShape.addFigure(exampleFigure);

        //Than
        int result = theShape.getShapesQuantity();
        Assert.assertEquals(1,result);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector theShape = new ShapeCollector();
        Trangle exampleFigure = new Trangle(3,2);
        theShape.addFigure(exampleFigure);

        //When
        boolean result = theShape.removeFigure(exampleFigure);

        //Than
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector theShape = new ShapeCollector();
        Trangle exampleFigure = new Trangle(3,2);
        theShape.addFigure(exampleFigure);

        //When
        Shape receivedShape;
        receivedShape = theShape.getFigure(theShape.getShapesQuantity()-1);

        //Than
        Assert.assertEquals(exampleFigure,receivedShape);

    }

    @Test
    public void testShowFigure(){

    }
}
