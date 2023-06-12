package homework4;

/**
 * @author Rustam Khakov
 */
public class Pow {
    static int counter = 0;
    static int counterEffective = 0;

    public static void main(String[] args) {
        pow(3, 20);// O(n)
        powEffective(3, 20); // O(log(n))
        System.out.println(counter);
        System.out.println(counterEffective);
    }

    public static int pow(int x, int n) {
        counter++;
        if (n == 1) {
            return x;
        }
        return n * pow(x, n - 1);
    }

    public static int powEffective(int x, int n) {
        counterEffective++;
        if (n == 1) {
            return x;// x * 1
        }
        if (n % 2 == 0) {
            int tmp = powEffective(x, n / 2);// divide and conc
            return tmp * tmp;//merge
        } else {// n == 5
            counterEffective++;
            int tmp = powEffective(x, (n - 1) / 2);
            return x * tmp * tmp;
        }

    }

}
