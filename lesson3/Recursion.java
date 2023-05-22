package lesson3;

public class Recursion {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum +=i;
        }
        System.out.println(sum);

        int sumRec = recFunc(10);
        System.out.println(sumRec);
        sum1();
    }

    private static void sum1() {
        sum2();
        sum3();
    }

    private static void sum3() {

    }

    private static void sum2() {

    }

    public static int recFunc(int n) {
        if(n <= 0) {
            return 0;
        }
        return  n + recFunc(n-1);
    }
}
