package James.Course_5_Access_Modifier.Exercise.E1_AccessModifier;

public class CircleDisplay {

    public static void main(String[] args) {
        Circle circle = new Circle(6.0);

        System.out.println("■ Circle color: " + circle.getCircleColor());
        System.out.printf("■ Circle radius: %.2f\n", circle.getCircleRadius());
        System.out.printf("■ Circle area: %.2f\n", circle.getCircleArea());
    }

}