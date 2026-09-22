package Java_MathCalculator;
/*
 * Title: java_MathCalculator
 * Author: Anitej Narumanchi
 * Purpose:
 *     code is able to run user-inputed values through equations to get answers, for 3-5 equations
 * Resources : Directions panel(for AP CSA mathCalc project)
 *      
*/

 import java . util . Scanner ;

 public class MathTutor{
    public static void main ( String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Math Tutor!");
        System.out.println("\n Choose a problem: ");
        System.out.println("\n\n\n 1. SquareRoot \n 2. AreaOfRectangle \n 3.NaturalLogarithm \n 4.QuadraticFormula \n 5. CubicVolume");
        int choice = input.nextInt();
        if(choice == 1){
            SquareRoot choice1 = new SquareRoot();
            choice1.solveSqrt();
        }
        if(choice == 3){
            NaturalLogarithm choice3 = new NaturalLogarithm();
            choice3.solveNaturalLog();
        }
        if(choice == 2){
            AreaOfRec choice2 = new AreaOfRec();
            choice2.solveArea();
        }
        if(choice == 4){
            QuadForm choice4 = new QuadForm();
            choice4.solveQuad();
        }
        if(choice == 5){
            CubicVolume choice5 = new CubicVolume();
            choice5.solveVol();
        }
 }
 }
