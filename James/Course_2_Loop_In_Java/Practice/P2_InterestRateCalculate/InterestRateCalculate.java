package James.Course_2_Loop_In_Java.Practice.P2_InterestRateCalculate;

import java.util.Scanner;

public class InterestRateCalculate {

    public static void main(String[] args) {

        int month;
        double deposit, interestRate, totalInterest = 0;

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a amount of deposit: ");
        deposit = getInput.nextDouble();

        System.out.print("■ Type a number of month: ");
        month = getInput.nextInt();

        System.out.print("■ Type a percentage of interest rate (Percent): ");
        interestRate = getInput.nextDouble();

        for (int i = 0; i < month; i++) {

            totalInterest += (deposit * (interestRate / 100) / (12 * month));

        }

        System.out.printf("\n■ Total interest: %.2f\n", totalInterest);

    }

}