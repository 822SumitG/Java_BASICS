import java.util.*;

class StringReverse {
    public static void printStringReverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printStringReverse(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "Sujal";

        printStringReverse(str, str.length() - 1);
    }
}