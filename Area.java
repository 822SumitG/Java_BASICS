import java.util.*;

public class Area {
    public static void main(String[] args) {
        int rad;
        double pi = 3.14, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of a circle: ");
        rad = sc.nextInt();
        area = pi * rad * rad;
        System.out.println("The area of a circle: " + area);

    }
}