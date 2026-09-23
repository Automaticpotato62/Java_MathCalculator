package Java_MathCalculator;
/*
*Title: QuadForm
* Author: Anitej Narumanchi
 *Purpose: create code for running user inputed values in the quadratic formula
* Resources: Stack Overflow, Quora, Youtube, MathWorks
*/
import java.util.Scanner;
public class QuadForm {
    Scanner input = new Scanner(System.in);
    private double b;
    private double a;
    private double c;
    public QuadForm(){
        System.out.println(" x = (-b +- Sqrt(b^2 - 4ac))/2a ");
        System.out.println("enter values: ");
        b = input.nextDouble();
        a = input.nextDouble();
        c = input.nextDouble();
    }
    public String solveQuad(){
        double d = (b*b)-(4*a*c);
        double x1 = (-b + Math.sqrt(d))/(2 * a);
        double x2 = (-b - Math.sqrt(d))/(2 * a);
        if (d < 0.0){
            System.out.println("negative sqrt, run program again");
            return "0";
        }
        String result = "Root 1: " + x1 + "root 2: " + x2;
        return result;
    }
}
