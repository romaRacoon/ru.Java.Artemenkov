package com.company;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void setSpeed(int xSpeed, int ySpeed){
        //method with mistake for checking work of isEquSpeed
        topLeft._ySpeed = ySpeed;
        topLeft._xSpeed = xSpeed;
    }

    private boolean isEquSpeed(){
        return topLeft._xSpeed == bottomRight._xSpeed && topLeft._ySpeed == bottomRight._ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=MovablePoint{x=" + topLeft._x + ", y="+ topLeft._y+
                "}, bottomRight=MovablePoint{x=" + bottomRight._x + ", y=" + bottomRight._y +
                "}, xSpeed = " + topLeft._xSpeed +
                ", ySpeed=" + topLeft._ySpeed +
                "}";
    }

    @Override
    public void MoveUp() {
        if(!isEquSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft._xSpeed + "\n\tySpeed = " + topLeft._ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight._xSpeed + "\n\tySpeed = " + bottomRight._ySpeed);
        topLeft.MoveUp();
        bottomRight.MoveUp();

    }

    @Override
    public void MoveDown() {
        if(!isEquSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft._xSpeed + "\n\tySpeed = " + topLeft._ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight._xSpeed + "\n\tySpeed = " + bottomRight._ySpeed);
        topLeft.MoveDown();
        bottomRight.MoveDown();

    }

    @Override
    public void MoveLeft() {
        if(!isEquSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft._xSpeed + "\n\tySpeed = " + topLeft._ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight._xSpeed + "\n\tySpeed = " + bottomRight._ySpeed);
        topLeft.MoveLeft();
        bottomRight.MoveLeft();

    }

    @Override
    public void MoveRight() {
        if(!isEquSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft._xSpeed + "\n\tySpeed = " + topLeft._ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight._xSpeed + "\n\tySpeed = " + bottomRight._ySpeed);
        topLeft.MoveRight();
        bottomRight.MoveRight();
    }
}
