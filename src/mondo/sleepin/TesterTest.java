package mondo.sleepin;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danarchy on 5/24/16.
 */
public class TesterTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void sleepInTestWorkDay() throws Exception {
        Tester tester = new Tester();
        boolean weekday = true;
        boolean vacation = false;
        assertFalse(tester.sleepIn(weekday, vacation));
    }

    @Test
    public void sleepInTestWeekend() throws Exception {
        Tester tester = new Tester();
        boolean weekday = false;
        boolean vacation = false;
        assertTrue(tester.sleepIn(weekday, vacation));
    }

    @Test
    public void sleepInTestVacation() throws Exception {
        Tester tester = new Tester();
        boolean weekday = true;
        boolean vacation = true;
        assertTrue(tester.sleepIn(weekday, vacation));
    }
    
    @Test
    public void sleepInTestWeekendVacation() throws Exception {
        Tester tester = new Tester();
        boolean weekday = false;
        boolean vacation = true;
        assertTrue(tester.sleepIn(weekday, vacation));
    }
}