package James.Course_1_Introduction_To_Java.Practice.P7_BodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        double weight, height, bodyMassIndex;
        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a number of weight (Kilogram): ");
        weight = getInput.nextDouble();

        System.out.print("■ Type a number of height (Meter): ");
        height = getInput.nextDouble();

        bodyMassIndex = (weight / Math.pow(height, 2));
        System.out.printf("\n■ Body mass index: %.2f ", bodyMassIndex);

        if (bodyMassIndex < 18) {

            System.out.println("(Underweight)");

        } else if (bodyMassIndex < 25.0) {

            System.out.println("(Normal)");

        } else if (bodyMassIndex < 30.0) {

            System.out.println("(Overweight)");

        } else {

            System.out.println("(Obese)");

        }

    }

}