package James.Course_2_Loop_In_Java.Exercise.E3_LowerPrimesDisplay;

public class LowerPrimesDisplay {

    public static void main(String[] args) {

        System.out.print("\n■ The first primes lower than 100: ");

        for (int i = 2; i < 100; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if ((i % j) == 0) {

                    isPrime = false;
                    break;

                }

            }

            if (isPrime) {

                System.out.print(i + " ");

            }

        }

        System.out.println();

    }

}