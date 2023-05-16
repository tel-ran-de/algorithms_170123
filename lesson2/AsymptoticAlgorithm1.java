package lesson2;

/**
 * @author Rustam Khakov
 */
public class AsymptoticAlgorithm1 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 100;
		for (int i = 0; i < n; i++) {// O(n)
			for (int j = 0; j <= n / 5; j++) { // O(n/2) = O(n *(1/2)) = O(n)
				sum = sum + i - j;
			}
		}
		// O(n^2)
		int secondSum = 0;
		for (int i = 0; i < n; i++) { // O(n)
			secondSum = secondSum + i;
		}
		// O(n^2)+ O(n) = O(n^2 + n) = O(n^2)
		//O(n^2 + n) = O(n*(n +1)) = O(n)* O(n) = O(n^2)


		// n-> O(n) * O(5*n) = O(n * 5*n) = O(n*n) = O(n^2)
		// n -> n^2 * constant
		// n -> n^2 * constant


		// n -> 3 * n -> O(3 * n) = O(n)
		// 10 -> 30
		// 100 -> 300
		// 1000 -> 3000

		System.out.println(sum);
	}


	public static void constantTimeAlgorithm() {

		// O(1) - константная сложность
		// O(log(n)) - логарифмическая сложность
		// O(n) - линейная сложность
		// O(n* log(n)) - линейно-логарифмическая сложность
		// O(n^2) - квадратичная
		// O(n^3) - кубическая
		//

		int paramOne = 1000;
		int paramTwo = 670000;
		int sum = paramOne + paramTwo; // f(x) = 1
		// O(f(x)) =   O(2 *1) = O(1)
		int[] array = {10, 18, 17, 6, 5, 34, 23, 5454};
		int n = 6;// n -> 0 до размера массива - 1
		System.out.println(array[n]); // O(1)

		//найти индекс элемента по входному значению - поиск по значению
		int x = 34;// O(1)
		int[] arrayCopy = new int[array.length];// O(n)
		for (int i = 0; i < array.length; i++) { // n -> O(n)
			if (array[i] == x) {
				System.out.println(i);
			}
			arrayCopy[i] = array[i];
		}






	}
}
