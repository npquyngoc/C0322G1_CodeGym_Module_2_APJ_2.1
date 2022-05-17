package GreatestCommonDivisor;

import java.util.Scanner;
public class GreatestCommonDivisor {

    public static void main(String[] args) {

        int valueA, valueB;

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type value of A: ");
        valueA = getInput.nextInt();

        System.out.print("■ Type value of B: ");
        valueB = getInput.nextInt();

        valueA = Math.abs(valueA);
        valueB = Math.abs(valueB);

        while (valueA != valueB) {

            if (valueA == 0 || valueB == 0) {

                System.out.println("\n■ There is no Greatest Common Divisor!");
                break;

            } else if (valueA > valueB) {

                valueA = valueA - valueB;

            } else {

                valueB = valueB - valueA;

            }

        }

        System.out.println("\n■ Greatest Common Divisor is: " + valueA);

    }

}