package mondo.plusout;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by danarchy on 6/2/16.
 */
public class PlusOutTest {

    PlusOut plusOutTester = new PlusOut();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPlusOutSimple(){
        String fullString = "fulltargetstring";
        String targetString = "target";
        assertEquals("++++target++++++", plusOutTester.plusOut(fullString, targetString));
    }

    @Test
    public void testPlusOutOneWord(){
        String fullString = "thebestdanyoucanget";
        String targetString = "dan";
        assertEquals("+++++++dan+++++++++", plusOutTester.plusOut(fullString, targetString));
    }
}