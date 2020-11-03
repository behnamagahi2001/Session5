package com.company;

/**
 * TriAngle class :/
 * @author Behnam
 * @version 1.0
 */
public class TriAngle extends Polygon{
    /**
     * Constructor
     * @param side1
     * @param side2
     * @param side3
     */
    public TriAngle(double side1, double side2, double side3){
        sidesArray[0] = side1;
        sidesArray[1] = side2;
        sidesArray[2] = side3;
    }
    /**
     * Is it equilateral?
     * @return equilateral
     */
    public boolean isEquilateral(){
        boolean equilateral = false;
        if(sidesArray[0] == sidesArray[1] && sidesArray[1] == sidesArray[2])
            equilateral = true;
        return equilateral;
    }
    /**
     * This method is the method which calculates the perimeter
     * @return perimeter;
     */
    public double calculatePerimeter(){
        double perimeter = sidesArray[0] + sidesArray[1] + sidesArray[2];
        return perimeter;
    }
    /**
     * This method is the method which calculates the area
     * @return area;
     */
    public double calculateArea(){
        double area = 0.25f * Math.sqrt(calculatePerimeter()*(calculatePerimeter()-2*sidesArray[0])*(calculatePerimeter()-2*sidesArray[1])*(calculatePerimeter()-2*sidesArray[2]));
        return area;
    }
    /**
     * This method is the method which draws the shape
     */
    public void draw(){
        super.draw();
        System.out.println("A triangle with sides equal to: " + sidesArray[0] + " " + sidesArray[1] + " " + sidesArray[2]);
    }
    /**
     * This method is the method which checks equality
     * @return equality
     */
    public boolean equals(TriAngle shape2){
        boolean equality = false;
        if(this.sidesArray[0] == shape2.sidesArray[0] && this.sidesArray[1] == shape2.sidesArray[1] && this.sidesArray[2] == shape2.sidesArray[2])
            equality = true;
        return equality;
    }
    /**
     * This method is the method which prints the info
     */
    public String toString(){
        return "The given shape is triagle with " + sidesArray[0] + " " + sidesArray[1] + " " + sidesArray[2] + " sides";
    }
}