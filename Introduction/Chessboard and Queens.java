import java.util.Scanner;

public class Main {

    private static char[][] board = new char[8][8];
    private static int count = 0;
    private static boolean[] column = new boolean[8];
    private static boolean[] diag1 = new boolean[15]; // from -7 to 7 shifted by +7
    private static boolean[] diag2 = new boolean[15]; // from 0 to 14

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            board[i] = scanner.next().toCharArray();
        }
        scanner.close();

        solve(0);
        System.out.println(count);
    }

    private static void solve(int row) {
        if (row == 8) {
            count++;
            return;
        }

        for (int col = 0; col < 8; col++) {
            if (board[row][col] == '.' && !column[col] && !diag1[row - col + 7] && !diag2[row + col]) {
                column[col] = diag1[row - col + 7] = diag2[row + col] = true;
                solve(row + 1);
                column[col] = diag1[row - col + 7] = diag2[row + col] = false;
            }
        }
    }
}
