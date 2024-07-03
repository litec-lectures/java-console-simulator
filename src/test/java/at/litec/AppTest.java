package at.litec;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    public void testOutput()
    {
        ConsoleSimulator c = new ConsoleSimulator("at.litec.Hello");
        try
        {
            String consoleOutput = c.getNextNonEmptyOutputLine();
            assertEquals("Hello", consoleOutput);
        }
        catch (Exception ex)
        {
            fail("Exception" + ex.getMessage());
        }
    }


    public void testRepeater()
    {
        ConsoleSimulator c = new ConsoleSimulator("at.litec.Repeater");
        try
        {
            c.enterLine("test");
            String consoleOutput = c.getNextNonEmptyOutputLine();
            assertEquals("test", consoleOutput);
        }
        catch (Exception ex)
        {
            fail("Exception" + ex.getMessage());
        }
    }
}
