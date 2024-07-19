import java.util.*;

public class Functions14 {
    public static int calculateFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 10;

        System.out.println(calculateFibonacci(n));
    }
}