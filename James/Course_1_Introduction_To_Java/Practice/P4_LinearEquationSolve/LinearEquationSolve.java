package James.Course_1_Introduction_To_Java.Practice.P4_LinearEquationSolve;

import java.util.Scanner;

public class LinearEquationSolve {

    public static void main(String[] args) {

        double valueA, valueB, valueC;
        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Give a equation: a * x + b = c\n\n■ Type value A: ");
        valueA = getInput.nextDouble();

        System.out.print("■ Type value B: ");
        valueB = getInput.nextDouble();

        System.out.print("■ Type value C: ");
        valueC = getInput.nextDouble();

        if (valueA != 0) {

            System.out.printf("\n■ Equation pass with x = %.2f\n", ((valueC - valueB) / valueA));

        } else {

            if (valueB == valueC) {

                System.out.println("\n■ The solution is all x!");

            } else {

                System.out.println("\n■ There is no solution!");

            }

        }

    }

}