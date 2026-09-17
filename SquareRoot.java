package Java_MathCalculator;
/* 
*Class Title: SquareRoot
*Author: Anitej Narumanchi
*Purpose:
*    provide the necessary code for the Square Root Class in order for the equation to work
* Resources: 
*/ 
import java.util.Scanner;
 
public class SquareRoot {
    Scanner input = new Scanner(System.in);
    private double inputNumber;
    public SquareRoot(){
         System.out.println("please input a value: ");
         inputNumber = input.nextDouble();
    }
    public double solveSqrt(){
        double result = Math.sqrt(inputNumber);
        System.out.println(result);
        return result;
    }
}
