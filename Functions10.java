import java.util.*;

public class Functions10 {
    public static int ReverseNumber(int num) {
        int reversed = 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(ReverseNumber(num));
    }
}