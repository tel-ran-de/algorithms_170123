package lesson5;

/**
 * @author Rustam Khakov
 */
public class Task1 {
    // Имея отсортированный массив arr[] и число x,
    // напишите функцию, которая подсчитывает вхождения
    // x в arr[].
    // Ожидаемая временная сложность O(log n)
    //arr[] = {1, 1, 2, 2, 2, 2, 3,}


    // binary search - левое вхождение числа - index = 2  index(6)  ->4
    // binary search - правое вхождение числа - index = 5
    //return right - left + 1;

    //  O(log(n)) + O(log(n)) = O(log(n))
    //x = 2
    //Вывод: 4 раза

    public static void main(String[] args) {
        System.out.println(getNumberCount(new int[]{1, 1, 2, 2, 2, 2, 3,}, 2));
    }

    public static int getNumberCount(int[] arr, int x) {
        int left = searchLeft(x, arr, 0, arr.length - 1);
        if (left != -1) {
            int right = searchRight(x, arr, 0, arr.length - 1);
            return right - left;
        } else {
            return -1;
        }
    }

    public static int searchLeft(int number, int[] array, int from, int to) {
        if (to <= from) {
            return number == array[from] ? from : -1;
        }
        int middle = (from + to) / 2;

        if (array[middle] < number) {
            return searchLeft(number, array, middle + 1, to);
        } else {
            return searchLeft(number, array, from, middle);
        }
    }


    // {1, 1, 2, 2, 2, 2, 3}  0 -> 6    2     middle = 3
    //
    public static int searchRight(int number, int[] array, int from, int to) {
        if (to <= from) {
            return from;
        }
        int middle = (from + to) / 2;

        if (array[middle] > number) {
            return searchRight(number, array, from, middle);
        } else {
            return searchRight(number, array, middle + 1, to);
        }
    }
}
