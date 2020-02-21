package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
       shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;}
        return result;
        }

    public Shape getFigure(int n) {
        if (shapes.size() > 0) {
            Shape theFigure = null;
            theFigure = shapes.get(n);
            return theFigure;
        }
        return null;
    }

    public void showFigure(){

    }

    public int getShapesQuantity(){

        return shapes.size();
    }
}
