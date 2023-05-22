package lesson3;

public class Task1 {
    public static void main(String[] args) {
        method(10);
        method(100);
    }

    static void method(int n) {
        // 100 -> 10 ms
        // 10 000 -> 12 sec
        int counter = 0;
        for (int i = 0; i < n / 2; i++) {// n/2 -> O(n/2) = O(n)
            for (int j = 1; j <= n/2; j++) { // n/2 -> O(n/2) = O(n)
                for (int k = 1; k <= n; k = k * 2) { //O(log(n)) O(1)> O(..) < O(n)
                    //System.out.println("I am expert!");
                    counter++;
                }
            }
        }
        // начни алгоритм и для каждого элемента начнидругой алгоритм


        System.out.println(counter);

        // O(n) * O(n) * O(log(n))   -> O(n^2 * log(n))

        // 10 -> 100
        // 100 -> 17500

    }
}
