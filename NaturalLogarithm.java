package Java_MathCalculator;
/* Title: NaturalLogarithm
  *Author: Anitej Narumanchi
   *Purpose: find the natural logarithm of something and print the answer
 */
import java.util.Scanner;
public class NaturalLogarithm {
     Scanner input = new Scanner(System.in);
     private double inputNumber;
     public NaturalLogarithm(){
           System.out.println(" Formula: lne(x) = y");
           System.out.println("Enter a value: ");
           inputNumber = input.nextDouble();
     }
      public double solveNaturalLog(){
            double result = Math.log(inputNumber);
            System.out.println(result);
            return result;
      }
}
