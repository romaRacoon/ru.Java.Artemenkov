package com.company;

public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String colour, boolean filled){
        super(colour, filled, side, side);
    }

    public double GetSide() {return Width;}
    public void SetSide(double side){
        Width = side;
        Length = side;
    }

    @Override
    public void SetWidth(double width) {
        super.SetWidth(width);
        super.SetLength(Length);
    }

    @Override
    public void SetLength(double length) {
        super.SetLength(length);
        super.SetWidth(Width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + Width +
                ", length=" + Length +
                ", colour='" + Color + '\'' +
                ", filled=" + Filled +
                '}';
    }
}
