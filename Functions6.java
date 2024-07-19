import java.util.*;

public class Functions6 {
    public static double calculateCircumferenceOfCircle(double radius) {
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double circumference = 2 * 3.14 * radius;

        System.out.println(calculateCircumferenceOfCircle(radius));

    }
}