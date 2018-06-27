package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Rob Davidson on 27/06/18.
 */
public class HelloSolutionTest {

    private HelloSolution helloSolution;

    @Before
    public void setup(){
        helloSolution = new HelloSolution();
    }

    @Test
    public void shouldSayHello(){
        assertTrue(helloSolution.hello("Rob").equals("Hello, Rob!"));
    }

}
