package DrawMenu;

import java.util.Scanner;

public class DrawMenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("===================================\n\n       1. Draw a Square\n       2. Draw a Triangle\n       3. Draw a Rectangle\n       4. Exit application\n\n===================================\n\n■ Select a number above to draw: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n| Draw a Square |\n\n  * * * * * *\n  * * * * * *\n  * * * * * *\n  * * * * * *\n  * * * * * *\n  * * * * * *\n");
                    break;

                case 2:

                    System.out.println("\n| Draw a Triangle |\n\n    *\n    * *\n    * * *\n    * * * *\n    * * * * *\n    * * * * * *\n");
                    break;

                case 3:

                    System.out.println("\n| Draw a Rectangle |\n\n  * * * * * * * *\n  * * * * * * * *\n  * * * * * * * *\n  * * * * * * * *\n");
                    break;

                case 4:

                    System.exit(0);

                default:

                    System.out.println("\n■ Unknown select number!\n");

            }

        }

    }

}
