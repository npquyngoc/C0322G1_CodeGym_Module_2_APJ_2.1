package James.Course_1_Introduction_To_Java.Practice.P3_OperatorUse;

import java.util.Scanner;

public class OperatorUse {

    public static void main(String[] args) {

        float width, height;
        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a number of width (Centimeter): ");
        width = getInput.nextFloat();

        System.out.print("■ Type a number of height (Centimeter): ");
        height = getInput.nextFloat();

        System.out.printf("\n■ Area of rectangle: %.2f cm\n", (width * height));

    }

}