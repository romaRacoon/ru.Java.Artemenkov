package com.company;

public class Ball {
    private int _size;
    private  String _color;

    public Ball(int size, String color) {
        _size = size;
        _color = color;
    }

    public Ball(int size) {
        _size = size;
        _color = "Красный";
    }

    public Ball(String color) {
        _size = 1;
        _color = color;
    }

    public Ball() {
        _size = 1;
        _color = "Зеленый";
    }

    public int getSize() {
        return _size;
    }

    public void setRadius(int size) {
        _size = size;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + _size +
                ", color='" + _color + '\'' +
                '}';
    }
}
