package lesson1;

/**
 * @author Rustam Khakov
 */
public class Algorithm2 {

	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 16, 4, 3, 6, 7, 0, 98, 55, 34};
		System.out.println(findNumberInArray(arr, 5));   //false
		System.out.println(findNumberInArray(arr, 100)); //false
		System.out.println(findNumberInArray(arr, 98));  //true
		System.out.println(findNumberInArray(arr, 3));   //true


	}

	public static boolean findNumberInArray(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {// Space complexity - 1
			if (arr[i] == x) {// Time complexity размер массива
				return true;
			}
		}
		return false;
	}

}
