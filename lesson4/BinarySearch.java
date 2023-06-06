package lesson4;

/**
 * @author Rustam Khakov
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,7,7,8};
        System.out.println(search(3, array, 0, array.length));
        System.out.println(search(1, array, 0, array.length));
        System.out.println(search(7, array, 0, array.length));
        System.out.println(search(6, array, 0, array.length));
    }

    public static int search(int number, int[] array, int from, int to) {
        if (to <= from) {
            return number == array[from] ? from : -1;
        }
        int middle = (from + to) / 2;

        if (array[middle] < number) {
            return search(number, array, middle + 1, to);
        } else {
            return search(number, array, from, middle);
        }

        // T(n) = T(n/2) + O(1) = O(log(n)) * O(1) => O(log(n))
    }
}
