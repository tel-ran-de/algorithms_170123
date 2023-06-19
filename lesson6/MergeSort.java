package lesson6;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class MergeSort {
    static int counter = 0;

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 6, 9, 3, 2, 4, 5, 1};
        array = mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println(counter);
    }

    private static int[] mergeSort(int[] array, int from, int to) {
        if (to <= from) {
            return new int[]{array[from]}; // 1 elem
        }
        int middle = (to + from) / 2; // 5
        int[] left = mergeSort(array, from, middle);// 5
        int[] right = mergeSort(array, middle + 1, to);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        var firstPointer = 0;
        var secondPointer = 0;
        int pointer = 0;
        counter++;
        var array = new int[left.length + right.length];
        while (firstPointer < left.length && secondPointer < right.length) { //  пока не дошли до конца первого или второго массива
            if (left[firstPointer] > right[secondPointer]) {
                array[pointer] = right[secondPointer];
                pointer++;
                secondPointer++;
            } else {
                array[pointer] = left[firstPointer];
                pointer++;
                firstPointer++;
            }
        }
        while (firstPointer < left.length) {
            array[pointer] = left[firstPointer];
            pointer++;
            firstPointer++;
        }
        while (secondPointer < right.length) {
            array[pointer] = right[secondPointer];
            pointer++;
            secondPointer++;
        }

        return array;
    }


    ///left  -> new array
    // right -> new array
    // merge -> original array
    // left, right      >> result array,
}
