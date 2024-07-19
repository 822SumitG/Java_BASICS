import java.util.*;

public class InputMarks {
    public static void main(Stringp[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int input = sc.nextInt();

        do {
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Want to continue ? (yes(1) or no(0))");

        } while (input == 1);
    }
}