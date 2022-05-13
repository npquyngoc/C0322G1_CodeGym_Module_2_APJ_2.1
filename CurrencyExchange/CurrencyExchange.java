package CurrencyExchange;

import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {

        double vndRate = 23000, usdRate, exchange;

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type amount of USD to exchange to VND: ");
        usdRate = getInput.nextDouble();

        exchange = (usdRate * vndRate);
        System.out.println("\n■ Exchange to: " + exchange + "VND");

    }

}
