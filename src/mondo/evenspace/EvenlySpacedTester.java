package mondo.evenspace;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by danarchy on 5/24/16.
 */
public class EvenlySpacedTester {

    public boolean evenlySpaced(int a, int b, int c) {
        Integer[] intList = new Integer[3];
        intList[0] = a;
        intList[1] = b;
        intList[2] = c;

        Arrays.sort(intList);

        if(intList[2] - intList[1] == intList[1] - intList[0]) {
            return true;
        } else {
            return false;
        }
    }

}
