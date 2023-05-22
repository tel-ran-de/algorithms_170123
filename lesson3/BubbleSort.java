package lesson3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {6,5,3,1,8,7,2,4};
        int n = array.length;
        int temp = 0;
        for (int i = 1; i < n; i++) { // O(n)
            for (int j = 0; j < n - i; j++) { // O(n)
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
         // O (n^2)
        System.out.println(Arrays.toString(array));
    }
}
