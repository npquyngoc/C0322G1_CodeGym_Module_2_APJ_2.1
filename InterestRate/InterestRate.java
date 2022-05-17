package InterestRate;

import java.util.Scanner;
public class InterestRate {

    public static void main(String[] args) {

        int i, month;
        double deposit, interestRate, totalInterest = 0;

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type amount of Deposit: ");
        deposit = getInput.nextDouble();

        System.out.print("\n■ Type a number of Month: ");
        month = getInput.nextInt();

        System.out.print("\n■ Type amount of Interest Rate (In percent %): ");
        interestRate = getInput.nextDouble();

        for (i = 0; i < month; i++) {

            totalInterest += deposit * (interestRate / 100) / 12 * month;

        }

        System.out.println("\n■ Total of Interest: " + totalInterest);

    }

}