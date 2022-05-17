package FirstPrimesDisplay;

import java.util.Scanner;

public class FirstPrimesDisplay {

    public static void main(String[] args) {

        int number, prime = 2, count = 1;

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a number to display first primes: ");
        number = getInput.nextInt();

        if (number > 0) {

            System.out.println("\n■ The first " + number + " primes is: ");

        }

        while (count <= number) {

            boolean isPrime = true;

            for (int i = 2; i < prime; i++) {

                if (prime % i == 0) {

                    isPrime = false;
                    break;

                }

            }

            if (isPrime) {

                System.out.print(prime + " ");
                count++;

            }

            prime++;

        }

        System.out.println();

    }

}