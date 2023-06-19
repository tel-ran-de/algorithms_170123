package homework5;

/**
 * @author Rustam Khakov
 */
public class Task21 {
    public static void main(String[] args) {
        //Дан массив целых чисел. Найдите в нем пиковый элемент. Элемент массива является пиковым, если он НЕ меньше своих соседей.
        // Для угловых элементов нам нужно рассмотреть только одного соседа. Например, для входного массива {5, 10, 20, 15} 20
        // является единственным пиковым элементом. Для входного массива {10, 20, 15, 2, 23, 90, 67} есть два
        // пиковых элемента: 20 и 90. Обратите внимание, что нам нужно вернуть любой один пиковый элемент.
        // Оцените асимптотическую сложность алгоритма и подумайте можно ли его улучшить
        int[] arr = new int[]{10, 20, 15, 2, 23, 90, 67}; // O(n)
        int peakIndex = findPeak(arr, 0, arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                if (arr[i] >= arr[i + 1]) {
//                    peakIndex = i;
//                    return;
//                }
//            }
//            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
//                peakIndex = i;
//                return;
//            }
//            if (i == arr.length - 1) {
//                if (arr[i] >= arr[i - 1]) {
//                    peakIndex = i;
//                    return;
//                }
//            }
//        }
        System.out.println(peakIndex);
    }

    public static int findPeak(int[] array, int from, int to) {
        int median = (from + to) / 2;
        int val = array[median];
        if (median == 0 || median == array.length -1) {
            return val;
        }
        if (val >= array[median - 1] && val >= array[median + 1]) {
            return val;
        }
        if (val < array[median + 1]) {
            return findPeak(array, median + 1, to);
        } else {
            return findPeak(array, from, median - 1);
        }
    }
}
