package James.Course_1_Introduction_To_Java.Exercise.E1_GreetingDisplay;

import java.util.Scanner;

public class GreetingDisplay {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type a name: ");
        String name = getInput.nextLine();

        System.out.println("■ Hello: " + name);

    }

}