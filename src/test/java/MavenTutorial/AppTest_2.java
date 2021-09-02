package MavenTutorial;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest_2 
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
    public void printHello()
    {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from user Y");
        System.out.println("on the second of September");
    }
}
