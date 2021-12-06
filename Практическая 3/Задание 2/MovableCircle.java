package com.company;

public class MovableCircle implements Movable {

    int _radius;
    MovablePoint _center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        _center = new MovablePoint(x, y, xSpeed, ySpeed);
        _radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + _radius +
                ", center=" + _center.toString() +
                '}';
    }

    @Override
    public void MoveUp() {
        _center.MoveUp();
    }

    @Override
    public void MoveDown() {
        _center.MoveDown();
    }

    @Override
    public void MoveLeft() {
        _center.MoveLeft();
    }

    @Override
    public void MoveRight() {
        _center.MoveRight();
    }
}
