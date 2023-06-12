package lesson5;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 6, 9, 3, 2, 4, 5, 1, 6};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int partitionIndex = partition(array, from, to);// left- меньше пайвота right - больше пайвота
            quickSort(array, from, partitionIndex);
            quickSort(array, partitionIndex + 1, to);
        }
    }

    private static int partition(int[] array, int from, int to) {
        int medianIndex = (to + from) / 2;
        int pivot = array[medianIndex];
        int leftPointer = from;
        int rightPointer = to;
        while (leftPointer <= rightPointer) {
            while (array[leftPointer] < pivot) {
                leftPointer++;
            }
            while (array[rightPointer] > pivot) {
                rightPointer--;
            }
            if (leftPointer >= rightPointer) {
                break;
            }
            swap(array, leftPointer, rightPointer);
            leftPointer++;
            rightPointer--;
        }
        return rightPointer;
    }

    private static void swap(int[] array, int leftPointer, int rightPointer) {
        int tmp = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = tmp;
    }
}
