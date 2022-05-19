package James.Course_3_Array_And_Method_In_Java.Practice.P4_TemperatureConvert;

import java.util.Scanner;

public class TemperatureConvert {

    public static void main(String[] args) {

        double celsius, fahrenheit;
        Scanner getInput = new Scanner(System.in);

        while (true) {

            System.out.print("=============================================\n\n    1. Convert from Celsius to Fahrenheit\n    2. Convert from Fahrenheit to Celsius\n    3. Exit the application\n\n=============================================\n\n■ Select a number above to convert: ");
            int choice = getInput.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("■ Type a number of Celsius temperature: ");
                    celsius = getInput.nextDouble();

                    System.out.println("■ Convert from " + celsius + " °C (Celsius) to " + celsiusToFahrenheit(celsius) + " °F (Fahrenheit)\n");
                    break;

                case 2:

                    System.out.print("■ Type a number of Fahrenheit temperature: ");
                    fahrenheit = getInput.nextDouble();

                    System.out.println("■ Convert from " + fahrenheit + " °F (Fahrenheit) to " + fahrenheitToCelsius(fahrenheit) + " °C (Celsius)\n");
                    break;

                case 3:

                    System.exit(0);

                default:

                    System.out.println("■ Unknown select number!\n");

            }

        }

    }

    public static double celsiusToFahrenheit(double celsius) {

        return ((9.0 / 5) * celsius + 32);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        return ((5.0 / 9) * (fahrenheit - 32));

    }

}