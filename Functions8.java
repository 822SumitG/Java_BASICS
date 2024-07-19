import java.util.*;

public class Functions8 {
    public static int RaisedToThePower(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers (x and n): ");
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("x to the power n is: " + RaisedToThePower(x, n));
    }
}