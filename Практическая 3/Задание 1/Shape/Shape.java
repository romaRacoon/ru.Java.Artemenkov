package com.company;

public abstract class Shape {
    protected String Color;
    protected boolean Filled;

    public Shape(String color, boolean filled) {
        Color = color;
        Filled = filled;
    }

    public Shape() {
        Color = "Белый";
        Filled = false;
    }

    public String GetColor() {
        return Color;
    }

    public void SetColor(String color) {
        Color = color;
    }

    public boolean IsFilled() {
        return Filled;
    }

    public void SetFilled(boolean filled) {
        Filled = filled;
    }
    public abstract double GetArea();
    public abstract double GetPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + Color + '\'' +
                ", filled=" + Filled +
                '}';
    }
}
