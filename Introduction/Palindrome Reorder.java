import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        String result = findPalindromeReorder(s);
        System.out.println(result);
    }

    private static String findPalindromeReorder(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Check the number of characters with odd counts
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        
        if (oddCount > 1) {
            return "NO SOLUTION";
        }
        
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder middleChar = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            
            if (count % 2 != 0) {
                middleChar.append(c);
            }
            for (int i = 0; i < count / 2; i++) {
                firstHalf.append(c);
            }
        }
        
        String secondHalf = firstHalf.reverse().toString();
        firstHalf.reverse(); // Reverse back to original for the first half
        
        return firstHalf.toString() + middleChar.toString() + secondHalf;
    }
}
