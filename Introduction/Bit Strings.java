import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
 
        final int MOD = 1000000007;
        long result = power(2, n, MOD);
 
        System.out.println(result);
    }
 
    private static long power(int base, int exp, int mod) {
        long result = 1;
        long baseMod = base % mod;
 
        while (exp > 0) {
            if ((exp % 2) == 1) {
                result = (result * baseMod) % mod;
            }
            baseMod = (baseMod * baseMod) % mod;
            exp /= 2;
        }
 
        return result;
    }
