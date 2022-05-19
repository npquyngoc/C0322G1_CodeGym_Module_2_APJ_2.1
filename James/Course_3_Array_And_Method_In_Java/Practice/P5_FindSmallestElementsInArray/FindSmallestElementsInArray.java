package James.Course_3_Array_And_Method_In_Java.Practice.P5_FindSmallestElementsInArray;

import java.util.Scanner;

public class FindSmallestElementsInArray {

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

        System.out.println("\n■ The smallest element in the array is " + array[findSmallestElement(array)] + " at position " + findSmallestElement(array));

    }

    public static int findSmallestElement(int array[]) {

        int smallestElement = array[0], position = 0;

        for (int j = 0; j < array.length; j++) {

            if (array[j] < smallestElement) {

                smallestElement = array[j];
                position = j;

            }

        }

        return position;

    }

}