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
 
        for (int k = 1; k <= n; k++) {
            long totalSquares = (long) k * k;
            long totalPairs = (totalSquares * (totalSquares - 1)) / 2;
            long attackingPairs = 0;
            if (k > 2) {
                attackingPairs = 4 * (k - 1) * (k - 2);
            }
            long nonAttackingPairs = totalPairs - attackingPairs;
            pw.println(nonAttackingPairs);
        }
 
        pw.close();
    }
}