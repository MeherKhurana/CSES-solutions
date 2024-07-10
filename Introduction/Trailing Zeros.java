import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println(countTrailingZeros(n));
    }
    
    public static int countTrailingZeros(int n) {
        int count = 0;
        for (int powerOf5 = 5; n / powerOf5 >= 1; powerOf5 *= 5) {
            count += n / powerOf5;
        }
        return count;
    }
}
