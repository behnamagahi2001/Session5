package com.company;

import java.util.ArrayList;

/**
 * The paint class
 * @author Behnam
 * @version 1.0
 */
public class Paint {
    private ArrayList<Shape> shapes;

    /**
     * Constructor
     */
    public Paint(){
        shapes = new ArrayList<Shape>();
    }

    /**
     * Adding a shape
     * @param shape1
     */
    public void addShape(Shape shape1){
        shapes.add(shape1);
    }
    /**
     * Getter of an specific shape
     * @param i
     */
    public Shape getShape(int i){
        return shapes.get(i);
    }
    /**
     * Draw!
     */
    public void drawAll(){
        for(Shape i : shapes){
            i.draw();
        }
    }
}