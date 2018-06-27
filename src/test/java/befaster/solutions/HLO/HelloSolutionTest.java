package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

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

        assertThat(helloSolution.hello("123"), equals("123"));


    }

}
