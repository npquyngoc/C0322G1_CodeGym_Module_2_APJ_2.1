package GreetingDisplay;

import java.util.Scanner;

public class GreetingDisplay {

    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

        System.out.print("\n■ Type your name here: ");
        String name = getInput.nextLine();

        System.out.println("\n■ Hello: " + name);

    }

}