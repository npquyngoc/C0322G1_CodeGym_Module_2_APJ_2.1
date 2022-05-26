package James.Course_5_Access_Modifier.Exercise.E1_AccessModifier;

public class Circle {

    private double circleRadius = 1.0;
    public final String circleColor = "Red";

    public Circle(double radius) {
        circleRadius = radius;
    }

    public final String getCircleColor() {
        return circleColor;
    }

    public final double getCircleRadius() {
        return circleRadius;
    }

    public final double getCircleArea() {
        return (Math.PI * (circleRadius * circleRadius));
    }

}