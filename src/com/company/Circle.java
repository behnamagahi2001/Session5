package com.company;

/**
 * The Circle class
 * @author Behnam
 * @version 1.0
 */
public class Circle extends Shape {
    private double radius;
    /**
     * Constructor for Circle
     * @param radius
     */
    public Circle(double radius){
        this.radius = radius;
    }
    /**
     * Getter for radius
     * @return radius
     */
    public double getRadius(){
        return radius;
    }
    /**
     * This method is the method which calculates the perimeter
     * @return perimeter;
     */
    public double calculatePerimeter(){
        double perimeter = radius*2*3.14f;
        return perimeter;
    }
    /**
     * This method is the method which calculates the area
     * @return area;
     */
    public double calculateArea(){
        double area = radius*radius*3.14f;
        return area;
    }
    /**
     * This method is the method which draws the shape
     */
    public void draw(){
        super.draw();
        System.out.println("A circle with radius equal to: " + radius);
    }
    /**
     * This method is the method which checks equality
     * @return equality
     */
    public boolean equals(Circle shape2){
        boolean equality = false;
        if(this.getRadius() == shape2.getRadius())
            equality = true;
        return equality;
    }
    /**
     * This method is the method which prints the info
     */
    public String toString(){
        return "The given shape is circle with " + radius + " radius";
    }
}