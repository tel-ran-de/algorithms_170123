package homework3;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class Sort {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 3, 8, 19, 5, 47};
        array = sort(array);
        System.out.println(Arrays.toString(array));
        //sortIntersection(new int[]{1, 5, 6, 3, 8, 19, 5, 47});

        //sortIntersection(array);
        sortIntersection(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        sortIntersection(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {  // O(n -2) -> O(n)
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length - 1; j++) { //O(n -1) -> O(n)
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            //swap
            int tmp = array[i];// O(1)
            array[i] = min;
            array[index] = tmp;
        }
        return array;// O(n)*O(n) = O(n^2)
    }


    public static int[] sortIntersection(int[] array) {
        for (int i = 2; i < array.length; i++) {  // O(n -2) -> O(n)
            int x = array[i];
            int j = i;
            while (j > 1 && array[j - 1] > x) {// O(n)
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
        return array;// O(n)*O(n) = O(n^2)
    }
}
