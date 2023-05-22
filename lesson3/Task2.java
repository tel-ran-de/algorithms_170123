package lesson3;

public class Task2 {
    void method2(int n) {
        for (int i = 1; i <= n; i++) { // O(n)
            for (int j = 1; j <= n; j = j + i) { // O(n)
                System.out.println("I am expert!");
            }
        }
        // пройтись от 1 до n
        // проходмся от 1 до n с шагом i

        // n = 3
        // i = 1 -> n/1
        // i = 2 -> n/2
        // i = 3 -> n/3

    }


    void method3(int a, int b) { // a = 100000   b = 1   O(max(a,b))
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }
}
