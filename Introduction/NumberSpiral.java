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
        
        for (int i = 0; i < n; i++) {
            long y = reader.nextLong();
            long x = reader.nextLong();
 
            long total;
 
            if (x >= y) {
                if (x % 2 == 1) {
                    total = x * x - y + 1;
                } else {
                    total = (x - 1) * (x - 1) + y;
                }
            } else {
                if (y % 2 == 1) {
                    total = (y - 1) * (y - 1) + x;
                } else {
                    total = y * y - x + 1;
                }
            }
 
            pw.println(total);
        }
        pw.close();
    }
}
