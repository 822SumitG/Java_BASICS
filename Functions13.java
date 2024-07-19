import java.util.*;

public class Functions13 {
    public static int calculateVolume(int l, int b, int h) {
        int volume = l * b * h;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of l: ");
        int l = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of h: ");
        int h = sc.nextInt();

        System.out.println("Volume of Cuboid is: " + calculateVolume(l, b, h));
    }
}