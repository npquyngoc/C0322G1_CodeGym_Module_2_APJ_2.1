package James.Course_5_Access_Modifier.Practice.P2_StaticProperty;

public class CarDisplay {

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        car1.carListDisplay();
        System.out.println("");

        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        car2.carListDisplay();
    }

}