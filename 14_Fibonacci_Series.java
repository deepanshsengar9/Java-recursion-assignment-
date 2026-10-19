import java.util.Scanner;
class Main {
    static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(fib(i));
        }
    }
}
