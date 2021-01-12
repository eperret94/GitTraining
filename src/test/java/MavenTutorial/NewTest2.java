package MavenTutorial;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class NewTest2 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void printUpdates()
    {
          System.out.println("Update1 from X user");
          System.out.println("Update2 from Y user");
    }
}
