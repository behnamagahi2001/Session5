package com.company;

/**
 * Class Shape is the super class for all the shapes in this code
 * @author Behnam
 * @version 1.0
 */
public class Shape {
    /**
     * This method is the super method which calculates the perimeter
     * @return 0;
     */
    public double calculatePerimeter(){
        return 0;
    }
    /**
     * This method is the super method which calculates the area
     * @return 0;
     */
    public double calculateArea(){
        return 0;
    }
    /**
     * This method is the super method which draws the shape
     */
    public void draw(){
        System.out.println("The given shape is like this: ");
    }
    /**
     * This method is the super method which checks equality
     * @return equality
     */
    public boolean equals(Shape shape2){
        boolean equality = false;
        return equality;
    }
    /**
     * This method is the super method which prints the info
     */
    public String toString(){
        return "The given shape info is unknown";
    }
}