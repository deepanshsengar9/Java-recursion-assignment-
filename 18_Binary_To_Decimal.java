import java.util.Scanner;
class Main {
    static long convert(String s, int i) {
        if (i == s.length()) return 0;
        return (s.charAt(i) - '0') * power(2, s.length() - 1 - i) + convert(s, i + 1);
    }
    static long power(long a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(convert(s, 0));
    }
}
