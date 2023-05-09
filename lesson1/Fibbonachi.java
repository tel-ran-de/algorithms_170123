package lesson1;

/**
 * @author Rustam Khakov
 */
public class Fibbonachi {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 55 ...
		// 0 1 2 3 4 5 6 7  8
	}

	// найти 8 число фиббоначи
	public static int fibonachi(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonachi(n - 1) + fibonachi(n - 2);
	}
}
