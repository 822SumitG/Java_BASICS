import java.util.*;

public class Functions7 {
    public static boolean printEligible(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an age: ");
        int age = sc.nextInt();

        if (printEligible(age)) {
            System.out.println(age + " is eligible to vote.");
        } else {
            System.out.println(age + " is not eligible to vote.");
        }
    }
}