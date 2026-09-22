package Java_MathCalculator;

/* 
*Title: CubicVolume
*Author: Anitej Narumanchi
*Purpose: get radius and height of cylander and find volume of cylander
*Resources: 
*
*/

import java.util.Scanner;

public class CubicVolume {
    Scanner input = new Scanner(System.in);
    private double radius;
    private double height;
    public CubicVolume(){
        System.out.println("Formula: V = (π)(r^2)(h)");
        System.out.println("Enter height and radius: ");
        radius = input.nextDouble();
        height = input.nextDouble();
    }
    public double solveVol(){
        double result = Math.PI * (radius * radius) * height;
        System.out.println(result);
        return result;
    }
}