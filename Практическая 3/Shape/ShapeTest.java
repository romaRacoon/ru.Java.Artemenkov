package com.company;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5);  // Upcast Circle to Shape
        // Returns of Circle methods, defined in Shape
        System.out.println(s1);
        System.out.println(s1.GetArea());
        System.out.println(s1.GetPerimeter());
        System.out.println(s1.GetColor());
        System.out.println(s1.IsFilled());
        //System.out.println(s1.getRadius());   // Not in Shape

        System.out.println();

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        // Returns of Circle methods
        System.out.println(c1);
        System.out.println(c1.GetArea());
        System.out.println(c1.GetPerimeter());
        System.out.println(c1.GetColor());
        System.out.println(c1.IsFilled());
        System.out.println(c1.GetRadius());


        System.out.println();
        //Shape s2 = new Shape();   //  Abstract

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0);   // Upcast
        // Returns of Rectangle methods, defined in Shape
        System.out.println(s3);
        System.out.println(s3.GetArea());
        System.out.println(s3.GetPerimeter());
        System.out.println(s3.GetColor());
        //System.out.println(s3.getLength()); // NOT in Shape

        System.out.println();

        Rectangle r1 = (Rectangle)s3;   // downcast
        // Returns of Rectangle methods
        System.out.println(r1);
        System.out.println(r1.GetArea());
        System.out.println(r1.GetColor());
        System.out.println(r1.GetLength());

        System.out.println();

        Shape s4 = new Square(6.6);     // Upcast
        // Returns of Square methods, defined in Shape
        System.out.println(s4);
        System.out.println(s4.GetArea());
        System.out.println(s4.GetColor());
        //System.out.println(s4.getSide());  // NOT in Rectangle

        System.out.println();

        // Take note that we downcast Shape s4 to Rectangle,
        //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        // Returns of Square methods, defined in Rectangle
        System.out.println(r2);
        System.out.println(r2.GetArea());
        System.out.println(r2.GetColor());
        //System.out.println(r2.getSide());  // Not in Rectangle
        System.out.println(r2.GetLength());

        System.out.println();

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        // Returns of Square methods
        System.out.println(sq1);
        System.out.println(sq1.GetArea());
        System.out.println(sq1.GetColor());
        System.out.println(sq1.GetSide());
        System.out.println(sq1.GetLength());

    }
}
