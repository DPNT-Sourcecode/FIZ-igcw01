package befaster.solutions.FIZ;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

        Assert.assertTrue(output.equals("fizz fake deluxe"));
    }


    //- If the number is a multiple of five then you should write "buzz"
    @Test
    public void fizzBuzzMultiplesOf5() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(25);

        Assert.assertTrue(output.equals("buzz fake deluxe"));
    }



    // - If the number is a multiple of both three and five then you should write "fizz buzz"
    @Test
    public void fizzBuzzMultiplesOf3And5() {

        List<Integer> valuesDivisibleBy3And5 = Arrays.asList(15, 165, 540, 2295);

        for(Integer value: valuesDivisibleBy3And5){

            FizzBuzzSolution fbs = new FizzBuzzSolution();
            String output = fbs.fizzBuzz(value);

            Assert.assertTrue(output.equals("fizz buzz fake deluxe"));
        }

    }

    // - If the number is not a multiple of five or three then write the number
    @Test
    public void fizzBuzzNotMultiplesOf3And5() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(26);

        Assert.assertTrue(output.equals("26"));
    }

    // - A number is "buzz" if it is divisible by 5 or if it has a 5 in it
    @Test
    public void fizzBuzzMultiplesOf5andContains5() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(5);

        Assert.assertTrue(output.equals("buzz"));
    }


    //- A number is "fizz" if it is divisible by 3 or if it has a 3 in it
    @Test
    public void fizzBuzzMultiplesOf3andContains3() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(3);

        Assert.assertTrue(output.equals("fizz"));
    }


    //- A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
    @Test
    public void fizzBuzzDeluxeFake() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(33);

        Assert.assertTrue(output.equals("fizz fake deluxe"));

    }

    @Test
    public void deluxeOnly() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(22);

        Assert.assertTrue(output.equals("deluxe"));

    }

    //  - If a "deluxe" number is odd, we should call him "fake deluxe" A number cannot be both "deluxe" and "fake deluxe" at the same time
    @Test
    public void fakeDeluxeOnly() {

        FizzBuzzSolution fbs = new FizzBuzzSolution();
        String output = fbs.fizzBuzz(1111);

        Assert.assertTrue(output.equals("fake deluxe"));
    }




    //   - The old rules for "deluxe" do not apply.
    //  - A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
    //  - A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
    //  - We should still say "fake deluxe" if the "deluxe" number is odd
    //  - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
    //  - All the previous rules for "fizz" and "buzz" are still valid


}