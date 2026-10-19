import java.util.Scanner;
class Main {
    static void print(int n) {
        if (n < 2) return;
        print(n - 2);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n % 2 == 0 ? n : n - 1);
    }
}
