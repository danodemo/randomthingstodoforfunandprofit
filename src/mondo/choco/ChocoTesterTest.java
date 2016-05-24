package mondo.choco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danarchy on 5/24/16.
 */
public class ChocoTesterTest {
    ChocoTester tester = new ChocoTester();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void makeChocolateTestPass5311() throws Exception {
        int small = 5;
        int big = 3;
        int goal = 11;
        assertEquals(1, tester.makeChocolate(small, big, goal));
    }

    @Test
    public void makeChocolateTest5315() throws Exception {
        int small = 5;
        int big = 3;
        int goal = 15;
        assertEquals(0, tester.makeChocolate(small, big, goal));
    }

    @Test
    public void makeChocolateTest2320() throws Exception {
        int small = 2;
        int big = 3;
        int goal = 20;
        assertEquals(-1, tester.makeChocolate(small, big, goal));
    }

    @Test
    public void makeChocolateTest12220() throws Exception{
        int small = 12;
        int big = 2;
        int goal = 20;
        assertEquals(10, tester.makeChocolate(small,big,goal));
    }

    @Test
    public void maskeChocolateTestSameValues() throws Exception{
        int small = 5;
        int big = 5;
        int goal = 5;
        assertEquals(0, tester.makeChocolate(small,big,goal));
    }

    @Test
    public void makeChocolateTestMoreSmallsThanBigsFails() throws Exception {
        int small = 38;
        int big = 2;
        int goal = 50;
        assertEquals(-1, tester.makeChocolate(small,big,goal));
    }

    @Test
    public void makeChocolateTestMoreBigsThanSmallsFails() throws Exception{
        int small = 2;
        int big = 10;
        int goal = 500;
        assertEquals(-1, tester.makeChocolate(small,big,goal));
    }
}