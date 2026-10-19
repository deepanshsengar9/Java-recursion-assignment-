import java.util.Scanner;
class Main {
    static long product(long n) {
        if (n < 10) return n;
        return (n % 10) * product(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(product(n));
    }
}
