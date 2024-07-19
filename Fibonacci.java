public class Fibonacci {
    public static void main(String[] args) {
        int numTerm = 10;
        System.out.print("Fibonacci sequence upto" + numTerm + "terms:\n");
        for (int i = 0; i < numTerm; i++) {
            System.out.print(fibonacci(i) + " \n");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}