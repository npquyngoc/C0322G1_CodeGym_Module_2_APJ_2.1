package James.Course_3_Array_And_Method_In_Java.Exercise.E1_RemoveElementsInArray;

import java.util.Scanner;

public class RemoveElementsInArray {

    public static void main(String[] args) {

        int array[], i = 0, arraySize, ascending, number;
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

        System.out.print("\n\n■ Type a number you want to remove in the array: ");
        number = getInput.nextInt();

        for (ascending = i = 0; i < arraySize; i++) {

            if (array[i] != number) {

                array[ascending] = array[i];
                ascending++;

            }

            if (array[i] == number) {

                System.out.println("■ The number " + number + " removed at position " + i);

            }

        }

        arraySize = ascending;

        System.out.print("\n■ After removed elements in the array: ");

        for (i = 0; i < arraySize; i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println();

    }

}