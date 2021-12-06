package com.company;

public class Rectangle extends Shape {

    protected double Width, Length;

    public Rectangle() {
        super();
        Length = 0;
        Width = 0;
    }

    @Override
    public double GetArea() {
        return Width * Length;
    }

    public Rectangle(String colour, boolean filled, double width, double length) {
        super(colour, filled);
        Width = width;
        Length = length;
    }

    public Rectangle(double width, double length) {
        super();
        Width = width;
        Length = length;
    }

    public double GetWidth() {
        return Width;
    }

    public void SetWidth(double width) {
        Width = width;
    }

    public double GetLength() {
        return Length;
    }

    public void SetLength(double length) {
        Length = length;
    }

    @Override
    public double GetPerimeter() {
        return 2 * (Width + Length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + Width +
                ", length=" + Length +
                ", colour='" + Color + '\'' +
                ", filled=" + Filled +
                '}';
    }
}
