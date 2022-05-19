package James.Course_2_Loop_In_Java.Exercise.E1_GeometryDisplay;

import java.util.Scanner;

public class GeometryDisplay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("========================================\n\n    1. Draw a Rectangle\n    2. Draw a Triangle (Top left)\n    3. Draw a Triangle (Bottom left)\n    4. Exit the application\n\n========================================\n\n■ Select a number above to draw: ");
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

                    System.out.println("\n| Draw a Rectangle (Top left) |\n");

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

                    System.out.println("\n| Draw a Rectangle (Bottom left) |\n");

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

                    System.out.println("■ Unknown select number!\n");

            }

        }

    }

}
