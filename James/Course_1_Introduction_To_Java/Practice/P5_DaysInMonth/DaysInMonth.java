package James.Course_1_Introduction_To_Java.Practice.P5_DaysInMonth;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a number of month: ");
        int month = getInput.nextInt();

        String daysInMonth = "";

        switch (month) {

            case 2:

                daysInMonth = "28 or 29";
                break;

            case 4:
            case 6:
            case 9:
            case 11:

                daysInMonth = "30";
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                daysInMonth = "31";
                break;

            default:

                daysInMonth = "unknown";

        }

        System.out.println("■ The month " + month + " has " + daysInMonth + " day!");

    }

}