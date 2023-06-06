package homework3;

/**
 * @author Rustam Khakov
 */
public class Fact {

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number -1);
    }
}
