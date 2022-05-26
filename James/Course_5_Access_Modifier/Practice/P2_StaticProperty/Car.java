package James.Course_5_Access_Modifier.Practice.P2_StaticProperty;

public class Car {

    private static int carAmount;
    private final String carName, carEngine;

    public Car(String name, String engine) {
        carName = name;
        carEngine = engine;

        carAmount++;
    }

    public void carListDisplay() {
        System.out.println("■ Car name: " + carName + "\n■ Car engine: " + carEngine + "\n■ Car amount: " + carAmount);
    }

}