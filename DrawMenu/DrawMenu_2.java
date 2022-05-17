package DrawMenu;

import java.util.Scanner;

public class DrawMenu_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("=========================================\n\n    1. Draw a Rectangle\n    2. Draw a Triangle (Top-Left)\n    3. Draw a Triangle (Bottom-Left)\n    4. Exit application\n\n=========================================\n\n■ Select a number above to draw: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n| Draw a Rectangle |\n");

                    for (int i = 0; i < 4; i++) {

                        System.out.print("  ");

                        for (int j = 0; j < 8; j++) {

                            System.out.print("* ");

                        }

                        System.out.println("");

                    }

                    System.out.println("");
                    break;

                case 2:

                    System.out.println("\n| Draw a Rectangle (Top-Left) |\n");

                    for (int i = 0; i < 6; i++) {

                        System.out.print("    ");

                        for (int j = 0; j < 6 - i; j++) {

                            System.out.print("* ");

                        }

                        System.out.println();

                    }

                    System.out.println("");
                    break;

                case 3:

                    System.out.println("\n| Draw a Rectangle (Bottom-Left) |\n");

                    for (int i = 0; i < 6; i++) {

                        System.out.print("    ");

                        for (int j = 0; j <= i; j++) {

                            System.out.print("* ");

                        }

                        System.out.println();

                    }

                    System.out.println("");
                    break;

                case 4:

                    System.exit(0);

                default:

                    System.out.println("\n■ Unknown select number!\n");

            }

        }

    }

}