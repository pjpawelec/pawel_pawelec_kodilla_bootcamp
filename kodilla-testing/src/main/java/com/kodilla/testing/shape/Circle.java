package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {

        return "Circle";
    }

    public double getField() {
        double result = 3.14 * pow(radius,2);
        return result;
    }
}
