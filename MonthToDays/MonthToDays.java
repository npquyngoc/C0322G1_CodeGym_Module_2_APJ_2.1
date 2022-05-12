package MonthToDays;

import java.util.Scanner;

public class MonthToDays {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Month to Days: ");
        int month = getInput.nextInt();

        String daysInMonth = switch (month) {

            case 2 -> "28 or 29";
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            default -> "";

        };

        if (!daysInMonth.equals("")) {

            System.out.println("\n■ The month " + month + " has " + daysInMonth + " days!");

        } else {

            System.out.println("\n■ Invalid input!");

        }

    }

}
