import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = a / b;
        double rem = a % b;

        // System.out.println("Addition: " + a + "+" + b + "=" + (a + b));
        // System.out.println("Subtraction: " + a + "-" + b + "=" + (a - b));
        // System.out.println("Multiplication: " + a + "*" + b + "=" + (a * b));
        // System.out.println("Division: " + a + "/" + b + "=" + (a / b));
        // System.out.println("Modulo or Remainder: " + a + "%" + b + "=" + (a % b));

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }
}