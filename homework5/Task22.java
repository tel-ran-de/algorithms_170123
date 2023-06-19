package homework5;

/**
 * @author Rustam Khakov
 */
public class Task22 {
    public static void main(String[] args) {
        int[][] array = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        System.out.println(findPeak2D(array, 0, array[0].length));

    }

    public static int findPeak2D(int[][] array, int from, int to) {
        int median = (from + to) / 2;
        int maxIndex = findMaxIndex(array, median);
        int val = array[maxIndex][median];

        if (median == 0 || median == array[0].length -1) {
            return val;
        }
        if (val >= array[maxIndex][median - 1] && val >= array[maxIndex][median + 1]) {
            return val;
        }
        if (val < array[maxIndex][median + 1]) {
            return findPeak2D(array, median + 1, to);
        } else {
            return findPeak2D(array, from, median - 1);
        }
    }

    public static int findMaxIndex(int[][] array, int column) {
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < array[0].length; i++) {
            if (array[i][column] > max) {
                max = array[i][column];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
