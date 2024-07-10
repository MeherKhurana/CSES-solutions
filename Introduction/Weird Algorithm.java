import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		long x = r.nextLong();
		while (x != 1) {
			System.out.print(x + " ");
			if (x % 2 == 0) {
				x /= 2;
			} else {
				x = 3 * x + 1;
			}
		}
		System.out.println(x);
	}
}
