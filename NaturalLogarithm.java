package Java_MathCalculator;
/* Title: NaturalLogarithm
  *Author: Anitej Narumanchi
   *Purpose: provide cocde
 */
import java.util.Scanner;
public class NaturalLogarithm {
     Scanner input = new Scanner(System.in);
     private double inputNumber;
     public NaturalLogarithm(){
           System.out.println("Enter a value: ");
           inputNumber = input.nextDouble();
     }
      public double solveNaturalLog(){
            double result = Math.log(inputNumber);
            System.out.println(result);
            return result;
      }
}
