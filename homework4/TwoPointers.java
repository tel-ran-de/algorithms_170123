package homework4;

/**
 * @author Rustam Khakov
 */
public class TwoPointers {
    public static void main(String[] args) {
        int[] array1 = new int[]{100, 112, 256, 349, 770};
        int[] array2 = new int[]{72, 86, 113, 119, 265, 445, 892};
        // 72 86 100 112 113 119 256 265 349 445 770 892
        System.out.println(findK(7, array1, array2));

    }

    public static int findK(int k, int[] array1, int[] array2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int counter = 0;
        int[] res = new int[k+1];
        while(counter <= k) {
            if (array1[pointer1] <= array2[pointer2]) {
                res[counter] = array1[pointer1];
                pointer1++;
                counter++;
            } else {
                res[counter] = array2[pointer2];
                pointer2++;
                counter++;
            }
        }
        return res[k];
    }
}
