package com.company;

public class MovablePoint implements Movable {
    int _x, _y, _xSpeed, _ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        _x = x;
        _y = y;
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + _x +
                ", y=" + _y +
                ", xSpeed=" + _xSpeed +
                ", ySpeed=" + _ySpeed +
                '}';
    }

    @Override
    public void MoveUp() {
        _x += _xSpeed;
    }

    @Override
    public void MoveDown() {
        _x -= _xSpeed;
    }

    @Override
    public void MoveLeft() {
        _y -= _ySpeed;
    }

    @Override
    public void MoveRight() {
        _y += _ySpeed;
    }
}
