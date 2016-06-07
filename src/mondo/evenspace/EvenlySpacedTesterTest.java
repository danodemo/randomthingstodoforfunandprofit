package mondo.evenspace;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danarchy on 5/24/16.
 */
public class EvenlySpacedTesterTest {

    EvenlySpacedTester tester = new EvenlySpacedTester();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void evenlySpacedReturnsTrue() throws Exception {
        int a = 10;
        int b = 20;
        int c = 30;
        assertTrue(tester.evenlySpaced(a, b, c));
    }

    @Test
    public void evenlySpacedReturnsFalse() throws Exception{
        int a= 10;
        int b = 20;
        int c = 33;
        assertFalse(tester.evenlySpaced(a,b,c));
    }

    @Test
    public void evenlySpacedReturnsTrueWith0() throws Exception {
        int a = 2;
        int b = 4;
        int c = 0;
        assertTrue(tester.evenlySpaced(a, b, c));
    }
}