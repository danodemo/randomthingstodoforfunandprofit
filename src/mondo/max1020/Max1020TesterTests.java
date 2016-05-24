package mondo.max1020;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by danarchy on 5/24/16.
 */
public class Max1020TesterTests {

    public Max1020Tester tester = new Max1020Tester();


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMax1020ReturnsZero() throws Exception {
        int a = 9;
        int b = 28;
        assertEquals(0, tester.max1020(a, b));
    }

    @Test
    public void testMax1020ReturnsA() throws Exception {
        int a = 15;
        int b = 13;
        assertEquals(a, tester.max1020(a, b));
    }

    @Test
    public void testMax1020ReturnsB() throws Exception {
        int a = 13;
        int b = 15;
        assertEquals(b, tester.max1020(a, b));
    }
}