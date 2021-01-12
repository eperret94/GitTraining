package MavenTutorial;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class NewTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    //@Test
    public void printHello()
    {
        System.out.println("Hello");
        System.out.println("GitHub");
        System.out.println("Update from X user");
    }
    
    @Test
    public void NewTestCase()
    {
        System.out.println("NewTestCase from X user");
    }
}
