package LinearEquation;

import java.util.Scanner;

public class LinearEquation {

    public static void main(String[] args) {

        double valueA, valueB, valueC, answer;

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Given a equation as: a * x + b = c\n\n■ Type value a: ");
        valueA = getInput.nextDouble();

        System.out.print("■ Type value b: ");
        valueB = getInput.nextDouble();

        System.out.print("■ Type value c: ");
        valueC = getInput.nextDouble();

        if (valueA != 0) {

            answer = (valueC - valueB) / valueA;
            System.out.printf("\n■ Equation pass with x = %.2f\n", answer);

        } else {

            if (valueB == valueC) {

                System.out.print("\n■ The solution is all x!");

            } else {

                System.out.print("\n■ There is no solution!");

            }

        }

    }

}