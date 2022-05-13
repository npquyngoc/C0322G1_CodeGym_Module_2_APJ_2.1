package IntegersToWords;

import java.util.Scanner;

public class IntegersToWords {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a integers to convert to words: ");
        int number = getInput.nextInt();

        if (number >= 0 && number < 10) {

            System.out.print("\n■ Convert to: ");

            switch (number) {

                case 0 -> System.out.print("Zero");
                case 1 -> System.out.print("One");
                case 2 -> System.out.print("Two");
                case 3 -> System.out.print("Three");
                case 4 -> System.out.print("Four");
                case 5 -> System.out.print("Five");
                case 6 -> System.out.print("Six");
                case 7 -> System.out.print("Seven");
                case 8 -> System.out.print("Eight");
                case 9 -> System.out.print("Nine");

            }

        } else if (number >= 10 && number < 20) {

            System.out.print("\n■ Convert to: ");

            switch (number) {

                case 10 -> System.out.print("Ten");
                case 11 -> System.out.print("Eleven");
                case 12 -> System.out.print("Twelve");
                case 13 -> System.out.print("Thirteen");
                case 14 -> System.out.print("Fourteen");
                case 15 -> System.out.print("Fifteen");
                case 16 -> System.out.print("Sixteen");
                case 17 -> System.out.print("Seventeen");
                case 18 -> System.out.print("Eighteen");
                case 19 -> System.out.print("Nineteen");

            }

        } else if (number >= 20 && number < 100) {

            System.out.print("\n■ Convert to: ");

            switch (number / 10) {

                case 2 -> System.out.print("Twenty");
                case 3 -> System.out.print("Thirty");
                case 4 -> System.out.print("Forty");
                case 5 -> System.out.print("Fifty");
                case 6 -> System.out.print("Sixty");
                case 7 -> System.out.print("Seventy");
                case 8 -> System.out.print("Eighty");
                case 9 -> System.out.print("Ninety");

            }

            unit(number);

        } else if (number >= 100 && number < 1000) {

            System.out.print("\n■ Convert to: ");

            switch (number / 100) {

                case 1 -> System.out.print("One Hundred");
                case 2 -> System.out.print("Two Hundred");
                case 3 -> System.out.print("Three Hundred");
                case 4 -> System.out.print("Four Hundred");
                case 5 -> System.out.print("Five Hundred");
                case 6 -> System.out.print("Six Hundred");
                case 7 -> System.out.print("Seven Hundred");
                case 8 -> System.out.print("Eight Hundred");
                case 9 -> System.out.print("Nine Hundred");

            }

            switch ((number % 100) / 10) {

                case 1 -> System.out.print(" and Ten");
                case 2 -> System.out.print(" and Twenty");
                case 3 -> System.out.print(" and Thirty");
                case 4 -> System.out.print(" and Forty");
                case 5 -> System.out.print(" and Fifty");
                case 6 -> System.out.print(" and Sixty");
                case 7 -> System.out.print(" and Seventy");
                case 8 -> System.out.print(" and Eighty");
                case 9 -> System.out.print(" and Ninety");

            }

            unit(number);

        }

    }

    public static void unit(int number) {

        switch (number % 10) {

            case 1 -> System.out.print(" One");
            case 2 -> System.out.print(" Two");
            case 3 -> System.out.print(" Three");
            case 4 -> System.out.print(" Four");
            case 5 -> System.out.print(" Five");
            case 6 -> System.out.print(" Six");
            case 7 -> System.out.print(" Seven");
            case 8 -> System.out.print(" Eight");
            case 9 -> System.out.print(" Nine");

        }

    }

}