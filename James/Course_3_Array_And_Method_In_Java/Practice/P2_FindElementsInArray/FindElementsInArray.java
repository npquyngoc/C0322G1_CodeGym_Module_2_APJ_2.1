package James.Course_3_Array_And_Method_In_Java.Practice.P2_FindElementsInArray;

import java.util.Scanner;

public class FindElementsInArray {

    public static void main(String[] args) {

        boolean isExist = false;
        Scanner getInput = new Scanner(System.in);

        String[] studentsName = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        System.out.print("\n■ Type a name of the student: ");
        String inputName = getInput.nextLine();

        for (int i = 0; i < studentsName.length; i++) {

            if (studentsName[i].equals(inputName)) {

                System.out.println("■ The student with name " + inputName + " at position " + i);
                isExist = true;
                break;

            }

        }

        if (!isExist) {

            System.out.println("■ Not found the student with name " + inputName + " in the array.");

        }

    }

}
