package James.Course_2_Loop_In_Java.Practice.P3_GreatestCommonDivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        int numberA, numberB;

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a number of A: ");
        numberA = getInput.nextInt();

        System.out.print("■ Type a number of B: ");
        numberB = getInput.nextInt();

        numberA = Math.abs(numberA);
        numberB = Math.abs(numberB);

        while (numberA != numberB) {

            if (numberA == 0 || numberB == 0) {

                System.out.println("■ There is no greatest common divisor!");
                break;

            } else if (numberA > numberB) {

                numberA = (numberA - numberB);

            } else {

                numberB = (numberB - numberA);

            }

        }

        System.out.println("\n■ Greatest common divisor: " + numberA);

    }

}