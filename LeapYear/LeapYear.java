package LeapYear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a year: ");
        int year = getInput.nextInt();

        boolean isLeapYear = false, isDivisibleBy4 = (year % 4) == 0, isDivisibleBy100 = (year % 100) == 0, isDivisibleBy400 = (year % 400) == 0;

        if (isDivisibleBy4) {

            if (isDivisibleBy100) {

                if (isDivisibleBy400) {

                    isLeapYear = true;

                }

            } else {

                isLeapYear = true;

            }

        }

        if (isLeapYear) {

            System.out.println("\n■ " + year + " is a leap year!");

        } else {

            System.out.println("\n■ " + year + " is not a leap year!");

        }

    }


}
