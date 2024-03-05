package MathUtil;

public class MathUtil {

    public static final double PI = 3.141592653589793;

    double circlePerimeter(double radius){
        return 2 * PI * radius;
    }

    double ellipseArea(double a, double b){
        return a * b * PI;
    }
}
