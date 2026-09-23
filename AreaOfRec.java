package Java_MathCalculator;
/*
 * Title: java_MathCalculator
 * Author: Anitej Narumanchi
 * Purpose:
 *     code is able to run user-inputed values through equations to get answers, for 3-5 equations
 * Resources : AP CSA FRQ Questions in Classroom
 *      
*/
import java.util.Scanner;
public class AreaOfRec {
     Scanner input = new Scanner(System.in);
     private double inputNumberL;
     private double inputNumberW;
     public AreaOfRec(){
         System.out.println("Formula: L * W = Area");
         System.out.println("Enter length and width: ");
         inputNumberL = input.nextDouble();
         inputNumberW = input.nextDouble();

     }
     public double solveArea(){
         double result = inputNumberL * inputNumberW;
         System.out.println(result);
         return result;
     }
    

}
