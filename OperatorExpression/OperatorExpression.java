package OperatorExpression;

import java.util.Scanner;

public class OperatorExpression {

    public static void main(String[] args) {

        float width, height, area;

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type width: ");
        width = getInput.nextFloat();

        System.out.print("■ Type height: ");
        height = getInput.nextFloat();

        area = (width * height);
        System.out.printf("\n■ Area is: %.2f\n", area);

    }

}