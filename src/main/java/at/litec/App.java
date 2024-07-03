package at.litec;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //need to use the package plus class name.
        ConsoleSimulator c = new ConsoleSimulator("at.litec.Hello");
        try
        {
            String consoleOutput = c.getNextNonEmptyOutputLine();
            System.out.println(consoleOutput);
        }
        catch (Exception ex)
        {
            System.out.println("Exception" + ex.getMessage());
        }
    }
}
