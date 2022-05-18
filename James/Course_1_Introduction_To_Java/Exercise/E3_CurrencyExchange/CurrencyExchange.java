package James.Course_1_Introduction_To_Java.Exercise.E3_CurrencyExchange;

import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {

        double usdRate, vndRate = 23000;
        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a amount of USD to exchange to VND: ");
        usdRate = getInput.nextDouble();

        System.out.println("■ Exchange from " + usdRate + " USD to " + (usdRate * vndRate) + " ₫");

    }

}