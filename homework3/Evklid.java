package homework3;

/**
 * @author Rustam Khakov
 */
public class Evklid {
    public static void main(String[] args) {
    }

    public static int evklid(int a, int b) {
        if (b == 0) {
            return a;
        }
        return evklid(a, b%a);
    }
}
