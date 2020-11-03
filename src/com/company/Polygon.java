package com.company;
/**
 * The Polygon class
 * @author Behnam
 * @version 1.0
 */
public class Polygon extends Shape{
    protected double[] sidesArray = new double[4];
    /**
     * Getter of sides
     * @return sidesArray
     */
    public double[] getSides(){
        return sidesArray;
    }
}