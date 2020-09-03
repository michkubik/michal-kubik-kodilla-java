package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return (3.14159 * radius * radius);
    }
}

