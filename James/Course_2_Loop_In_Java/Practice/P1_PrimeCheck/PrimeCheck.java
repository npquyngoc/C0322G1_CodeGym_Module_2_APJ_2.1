package James.Course_2_Loop_In_Java.Practice.P1_PrimeCheck;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a number: ");
        int number = getInput.nextInt();

        if (number < 2) {

            System.out.println("■ The number " + number + " is not a prime!");

        } else {

            int i = 2;
            boolean isPrime = true;

            while (i <= Math.sqrt(number)) {

                if ((number % i) == 0) {

                    isPrime = false;
                    break;

                }

                i++;

            }

            if (isPrime) {

                System.out.println("■ The number " + number + " is a prime!");

            } else {

                System.out.println("■ The number " + number + " is not a prime!");

            }

        }

    }

}