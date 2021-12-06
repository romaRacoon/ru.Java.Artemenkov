package com.company;

public class Circle extends Shape {

    protected double Radius;

    public Circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        Radius = radius;
    }

    public Circle(double radius) {
        super();
        Radius = radius;
    }

    public Circle() {
        super();
        Radius = 0;
    }

    public double GetRadius() {
        return Radius;
    }

    public void SetRadius(double radius) {
        Radius = radius;
    }

    @Override
    public double GetArea() {
        return Math.PI * Radius * Radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + Radius +
                ", colour='" + Color + '\'' +
                ", filled=" + Filled +
                '}';
    }

    @Override
    public double GetPerimeter() {
        return Math.PI * Radius * 2;
    }
}
