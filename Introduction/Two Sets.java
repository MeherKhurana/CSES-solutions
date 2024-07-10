import java.io.*;
import java.util.*;
 
public class Main {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
 
    public static long sumUpTo(int n) {
        return (long) n * (n + 1) / 2;
    }
 
    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
 
        int n = reader.nextInt();
 
        long sum = sumUpTo(n);
 
        if (sum % 2 == 0) {
            pw.println("YES");
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = i + 1;
            }
 
            List<Integer> subset1 = new ArrayList<>();
            List<Integer> subset2 = new ArrayList<>();
            long targetSum = sum / 2;
            long currentSum = 0;
 
            for (int i = n; i >= 1; i--) {
                if (currentSum + i <= targetSum) {
                    subset1.add(i);
                    currentSum += i;
                } else {
                    subset2.add(i);
                }
            }
 
            pw.println(subset1.size());
            for (int num : subset1) {
                pw.print(num + " ");
            }
            pw.println();
 
            pw.println(subset2.size());
            for (int num : subset2) {
                pw.print(num + " ");
            }
            pw.println();
        } else {
            pw.println("NO");
        }
 
        pw.close();
    }
}