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
 
        public long nextLong() {
            return Long.parseLong(next());
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
 
    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
 
        int n = reader.nextInt();
        if (n == 1) {
            pw.println(1);
        } else if (n == 2 || n == 3) {
            pw.println("NO SOLUTION");
        } else {
            List<Integer> evenNumbers = new ArrayList<>();
            List<Integer> oddNumbers = new ArrayList<>();
            
            // Collect even numbers
            for (int i = 2; i <= n; i += 2) {
                evenNumbers.add(i);
            }
            
            // Collect odd numbers
            for (int i = 1; i <= n; i += 2) {
                oddNumbers.add(i);
            }
            
            // Print even numbers
            for (int num : evenNumbers) {
                pw.println(num + " ");
            }
            
            // Print odd numbers
            for (int num : oddNumbers) {
                pw.println(num + " ");
            }
        }
        pw.close();
    }
 
}