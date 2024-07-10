import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next(); int m = 1, c = 1;
        for (int i = 1; i < s.length(); i++) m = Math.max(m, c = s.charAt(i) == s.charAt(i-1) ? c + 1 : 1);
        System.out.println(m);
    }
}
