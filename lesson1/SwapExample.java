package lesson1;

/**
 * @author Rustam Khakov
 */
public class SwapExample {
	public static void main(String[] args) {
		// берем третью переменную туда копируем первую переменную,
		// берем вторую переменную, копируем ее в первую
		// третью переменную копируем во вторую
		int a = 3;
		int b = 78;
		// к первой переменной прибавить вторую (a= a+b)
		// во вторую переменную записать разницу между первым и вторым (b = a-b)
		// в первую переменную записать разницу между первым и вторым
		// input a, b
		// a = a + b
		// b = a- b
		// a = a-b

		// int tmp = a;
		// a = b;
		// b = tmp;


		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);


		//Написать псевдокод для алгоритма:
		// сложить три числа и вывести сумму

	}
}
