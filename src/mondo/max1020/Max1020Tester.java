package mondo.max1020;

/**
 * Created by danarchy on 5/24/16.
 */
public class Max1020Tester {

    public int max1020(int a, int b) {
        if (b > a) {
            int placeholder = a;
            a = b;
            b = placeholder;
        }
        if (a >= 10 && a <= 20) {
            return a;
        }
        else if (b >= 10 && b<= 20) {
            return b;
        } else {
            return 0;
        }
    }
}
