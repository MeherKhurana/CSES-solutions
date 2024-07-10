import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        scanner.close();

        long totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }

        long minDifference = findMinDifference(weights, n, totalWeight);
        System.out.println(minDifference);
    }

    private static long findMinDifference(int[] weights, int n, long totalWeight) {
        long minDifference = Long.MAX_VALUE;
        int subsetCount = 1 << n; // 2^n possible subsets

        for (int i = 0; i < subsetCount; i++) {
            long subsetWeight = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subsetWeight += weights[j];
                }
            }
            long otherSubsetWeight = totalWeight - subsetWeight;
            long difference = Math.abs(subsetWeight - otherSubsetWeight);
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }
}
