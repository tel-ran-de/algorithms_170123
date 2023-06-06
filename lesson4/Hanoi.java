package lesson4;

/**
 * @author Rustam Khakov
 */
public class Hanoi {
    public static void main(String[] args) {
        hanoi(4, "pole 1", "pole 2", "pole 3");
    }


    public static void hanoi(int n, String from, String tmp, String to) {
        if (n == 1) {
            System.out.printf("Перемести из %s, в %s%n", from, to);
            return;
        }
        hanoi(n - 1, from, to, tmp);
        System.out.printf("Перемести из %s, в %s%n", from, to);
        hanoi(n - 1, tmp, from, to);
    }


    // f(5) = 5 * f(4)= 5 * 4 * f(3) = .... = 5 * 4 * 3 *2 * 1;
    // f(4) = 4 * f(3)
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int factIterate(int fact) {
        int res = 1;
        // 1 * 2 * 3 * 4 * 5
        for (int i = 1; i <= fact; i++) {//100 итераций
            // 1 проход - 1 итерация
            res *= i;
        }
        return res;
    }
}
