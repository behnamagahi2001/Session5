package com.company;

public class RectAngle extends Polygon{
    /**
     * Constructor
     * @param side1
     * @param side2
     * @param side3
     * @param side4
     */
    public RectAngle(double side1, double side2, double side3, double side4){
        sidesArray[0] = side1;
        sidesArray[1] = side2;
        sidesArray[2] = side3;
        sidesArray[3] = side4;
    }
    /**
     * Is it square?
     * @return square
     */
    public boolean isSquare(){
        boolean square = false;
        if(sidesArray[0] == sidesArray[1])
            square = true;
        return square;
    }
    /**
     * This method is the method which calculates the perimeter
     * @return perimeter;
     */
    public double calculatePerimeter(){
        double perimeter = (sidesArray[0] + sidesArray[1])*2.0f;
        return perimeter;
    }
    /**
     * This method is the method which calculates the area
     * @return area;
     */
    public double calculateArea(){
        double area = sidesArray[0] * sidesArray[1];
        return area;
    }
    /**
     * This method is the method which draws the shape
     */
    public void draw(){
        super.draw();
        System.out.println("A rectangle with sides equal to: " + sidesArray[0] + " " + sidesArray[1]);
    }
    /**
     * This method is the method which checks equality
     * @return equality
     */
    public boolean equals(TriAngle shape2){
        boolean equality = false;
        if(this.sidesArray[0] == shape2.sidesArray[0] && this.sidesArray[1] == shape2.sidesArray[1])
            equality = true;
        return equality;
    }
    /**
     * This method is the method which prints the info
     */
    public String toString(){
        return "The given shape is rectangle with " + sidesArray[0] + " " + sidesArray[1] + " sides";
    }
}