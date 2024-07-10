import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
 
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            if ((a + b) % 3 == 0 && Math.min(a, b) >= (Math.max(a, b) / 2)) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }
 
        scanner.close();
        System.out.print(result);
    }
}