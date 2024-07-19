import java.util.*;

public class Functions5 {
    public static int GreatestOfTwoNumbers(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers a and b are: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greatest of two numbers are: " + GreatestOfTwoNumbers(a, b));
    }
}