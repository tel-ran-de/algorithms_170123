package homework1;

/**
 * @author Rustam Khakov
 */
public class Task2 {

	//Вводится три числа, необходимо проверить является ли он треугольником (сумма любых двух сторон треугольника больше третьей)
	public static void main(String[] args) {
		int first = 3;
		int second = 4;
		int third = 5;
		if (first + second > third && first + third > second && second + third > first) {
			System.out.println("triangle");
		} else {
			System.out.println("not a triangle");
		}

//		if (first + second > third) {
//			if (first + third > second) {
//				if (second + third > first) {
//					System.out.println("triangle");
//				} else {
//					System.out.println("not a triangle");
//				}
//			} else {
//				System.out.println("not a triangle");
//			}
//		} else {
//			System.out.println("not a triangle");
//		}
	}
}
