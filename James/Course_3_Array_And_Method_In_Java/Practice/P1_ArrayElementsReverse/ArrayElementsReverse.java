package James.Course_3_Array_And_Method_In_Java.Practice.P1_ArrayElementsReverse;

import java.util.Scanner;

public class ArrayElementsReverse {

    public static void main(String[] args) {

        int array[], arraySize, i = 0;
        Scanner getInput = new Scanner(System.in);

        do {

            System.out.print("\n■ Type a number size of the array: ");
            arraySize = getInput.nextInt();

            if (arraySize < 1 || arraySize > 20) {

                System.out.println("■ The array size must be from 1 to 20!");

            }

        } while (arraySize < 1 || arraySize > 20);

        array = new int[arraySize];

        System.out.println();

        while (i < array.length) {

            System.out.print("■ Type a number of element " + i + ": ");
            array[i] = getInput.nextInt();
            i++;

        }

        System.out.print("\n■ Default elements in the array: ");

        for (int displayArray : array) {

            System.out.print(displayArray + " ");

        }

        for (int j = 0; j < (array.length / 2); j++) {

            int temp = array[j];
            array[j] = array[(arraySize - 1 - j)];
            array[(arraySize - 1 - j)] = temp;

        }

        System.out.print("\n■ Reverse elements in the array: ");

        for (int displayArray : array) {

            System.out.print(displayArray + " ");

        }

        System.out.println();

    }

}
