import java.util.Scanner;

public class Main {

    // Recursive function to solve Tower of Hanoi puzzle
    public static void solveHanoi(int n, int from, int to, int aux, StringBuilder moves) {
        if (n == 1) {
            moves.append(from).append(" ").append(to).append("\n");
            return;
        }
        solveHanoi(n - 1, from, aux, to, moves);
        moves.append(from).append(" ").append(to).append("\n");
        solveHanoi(n - 1, aux, to, from, moves);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int minMoves = (int) Math.pow(2, n) - 1;
        StringBuilder moves = new StringBuilder();
        
        solveHanoi(n, 1, 3, 2, moves);

        System.out.println(minMoves);
        System.out.print(moves);
    }
}
