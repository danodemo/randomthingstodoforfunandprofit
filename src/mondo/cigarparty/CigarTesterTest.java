package mondo.cigarparty;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danarchy on 5/24/16.
 */
public class CigarTesterTest {

    public CigarTester tester = new CigarTester();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void cigarPartyWeekDaySuccess() throws Exception {
        int cigars = 45;
        boolean weekend = false;
        assertTrue(tester.cigarParty(cigars, weekend));
    }

    @Test
    public void cigarPartyWeekDayFailure() throws Exception {
        int cigars = 75;
        boolean weekend = false;
        assertFalse(tester.cigarParty(cigars, weekend));
    }

    @Test
    public void cigarPartyWeekEndSuccess() throws Exception {
        int cigars = 99;
        boolean weekend = true;
        assertTrue(tester.cigarParty(cigars, weekend));
    }

    @Test
    public void cigarPartyWeekEndFailure() throws Exception {
        int cigars = 25;
        boolean weekend = true;
        assertFalse(tester.cigarParty(cigars, weekend));
    }
}