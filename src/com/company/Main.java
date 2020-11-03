package com.company;

public class Main {

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.addShape(new Circle(12.0f));
        paint.addShape(new RectAngle(10.0f, 12.0f, 10.0f, 12.0f));
        paint.addShape(new TriAngle(10.0f, 12.0f, 14.0f));
        paint.drawAll();
    }
}