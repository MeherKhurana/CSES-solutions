import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static List<String> generateGrayCode(int n) {
        if (n == 1) {
            List<String> result = new ArrayList<>();
            result.add("0");
            result.add("1");
            return result;
        }

        // Get the gray code for n-1
        List<String> prevGrayCode = generateGrayCode(n - 1);
        List<String> newGrayCode = new ArrayList<>();

        // Add 0 to the front of the first half
        for (String code : prevGrayCode) {
            newGrayCode.add("0" + code);
        }

        // Add 1 to the front of the reversed second half
        for (int i = prevGrayCode.size() - 1; i >= 0; i--) {
            newGrayCode.add("1" + prevGrayCode.get(i));
        }

        return newGrayCode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<String> grayCode = generateGrayCode(n);
        for (String code : grayCode) {
            System.out.println(code);
        }
    }
}
