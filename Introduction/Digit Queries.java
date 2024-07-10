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
    }
 
    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
 
        int q = reader.nextInt();
        long[] queries = new long[q];
        
        for (int i = 0; i < q; i++) {
            queries[i] = reader.nextLong();
        }
        
        for (long k : queries) {
            pw.println(findDigitAtPosition(k));
        }
        
        pw.close();
    }
    
    private static char findDigitAtPosition(long k) {
        long digitLength = 1;
        long count = 9;
        long start = 1;
 
        while (k > digitLength * count) {
            k -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
 
        long number = start + (k - 1) / digitLength;
        int digitIndex = (int) ((k - 1) % digitLength);
 
        return Long.toString(number).charAt(digitIndex);
    }
