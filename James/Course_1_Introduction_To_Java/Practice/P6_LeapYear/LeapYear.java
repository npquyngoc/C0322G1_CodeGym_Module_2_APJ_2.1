package James.Course_1_Introduction_To_Java.Practice.P6_LeapYear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        boolean isLeapYear = false;
        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a number of year: ");
        int year = getInput.nextInt();

        if (((year % 4) == 0)) {

            if ((year % 100) == 0) {

                if ((year % 400) == 0) {

                    isLeapYear = true;

                }

            } else {

                isLeapYear = true;

            }

        }

        if (isLeapYear) {

            System.out.println("■ The year " + year + " is a leap year!");

        } else {

            System.out.println("■ The year " + year + " is not a leap year!");

        }

    }

}