package com.kodilla.testing.shape;

public class Trangle implements Shape {
    private double base;
    private  double height;

    public Trangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public String getShapeName() {

        return "Trangle";
    }

    public double getField() {
        double result = (base * height) / 2;
        return result;
    }
}
