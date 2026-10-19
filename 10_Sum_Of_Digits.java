import java.util.Scanner;
class Main {
    static int sum(long n) {
        if (n == 0) return 0;
        return (int)(n % 10) + sum(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(sum(n));
    }
}
