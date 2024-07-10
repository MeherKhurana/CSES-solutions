import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Generate all unique permutations
        Set<String> permutations = new TreeSet<>();
        generatePermutations("", input, permutations);

        // Print the result
        System.out.println(permutations.size());
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    private static void generatePermutations(String prefix, String str, Set<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
            }
        }
    }
}
