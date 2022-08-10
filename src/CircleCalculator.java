//Exercise 3
import java.lang.Math;
public class CircleCalculator {
    public static void main(String[] args) {
        double CircleRadius = 12.0;
        System.out.println("The circle radius is 12.0");
        double CircleDiameter = CircleRadius*2;
        System.out.println(CircleDiameter);
        double CircleCircumference = 2*CircleRadius*Math.PI;
        System.out.println(CircleCircumference);
        double CircleArea = Math.PI*CircleRadius*CircleRadius;
        System.out.println(CircleArea);

    }
}
