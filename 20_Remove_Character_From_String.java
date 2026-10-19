import java.util.Scanner;
class Main {
    static void remove(String s, char c, int i) {
        if (i == s.length()) return;
        if (s.charAt(i) != c) System.out.print(s.charAt(i));
        remove(s, c, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        remove(s, c, 0);
    }
}
