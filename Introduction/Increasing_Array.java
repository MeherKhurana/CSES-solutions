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
 
        public int nextInt() { // reads in the next int
            return Integer.parseInt(next());
        }
 
        public long nextLong() { // reads in the next long
            return Long.parseLong(next());
        }
 
        public double nextDouble() { // reads in the next double
            return Double.parseDouble(next());
        }
    }
 
    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
 
        int n = reader.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            int v = reader.nextInt();
            list.add(v);
        }
 
        long m = 0;  // Use long to avoid overflow for large inputs
        int maxSeen = list.get(0);
 
        for (int i = 1; i < n; i++) {
            if (list.get(i) < maxSeen) {
                m += maxSeen - list.get(i);
            } else {
                maxSeen = list.get(i);
            }
        }
 
        pw.println(m);
        pw.close();
    }
