import java.util.Scanner;
class Main {
    static void replace(String s, char a, char b, int i) {
        if (i == s.length()) return;
        System.out.print(s.charAt(i) == a ? b : s.charAt(i));
        replace(s, a, b, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String chars = sc.nextLine();
        char a = chars.charAt(0);
        char b = chars.charAt(2);
        replace(s, a, b, 0);
    }
}
