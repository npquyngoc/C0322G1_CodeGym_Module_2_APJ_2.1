package IsPrime;

import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a number: ");
        int number = getInput.nextInt();

        if (number < 2) {

            System.out.println("\n■ Number " + number + " is not a prime!");

        } else {

            int i = 2;
            boolean check = true;

            while (i <= Math.sqrt(number)) {

                if (number % i == 0) {

                    check = false;
                    break;

                }

                i++;

            }

            if (check) {

                System.out.println("\n■ Number " + number + " is a prime!");

            } else {

                System.out.println("\n■ Number " + number + " is not a prime!");

            }

        }

    }

}