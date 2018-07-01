package befaster.solutions.FIZ;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rob Davidson on 01/07/18.
 */
public class FizzBuzzSolutionTest {


    // If the number is a multiple of three then you should write "fizz"
    @Test
    public void fizzBuzzMultiplesOf3() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(9);

        Assert.assertTrue(output.equals("fizz"));
    }

    //- If the number is a multiple of five then you should write "buzz"
    @Test
    public void fizzBuzzMultiplesOf5() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(25);

        Assert.assertTrue(output.equals("buzz"));
    }


    // - If the number is a multiple of both three and five then you should write "fizz buzz"
    @Test
    public void fizzBuzzMultiplesOf3And5() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();

        // 1-9999

        for(int x  =1; x <= 9999; x++){

            String output = fbs.fizzBuzz(x);

            if(output.equals("fizz buzz")){
                System.out.println("Matching fzz fuzz "+x);
            }
        }

    }


    // - If the number is not a multiple of five or three then write the number, example 1

}