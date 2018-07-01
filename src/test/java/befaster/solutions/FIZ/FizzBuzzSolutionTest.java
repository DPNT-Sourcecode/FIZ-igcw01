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

        List<Integer> valuesDivisibleBy3And5 = Arrays.asList(15, 165, 540, 2295);

        for(Integer value: valuesDivisibleBy3And5){

            FizzBuzzSolution fbs = new FizzBuzzSolution();
            String output = fbs.fizzBuzz(value);

            Assert.assertTrue(output.equals("fizz buzz"));
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


    // A number can be both "fizz" and "buzz" at the same time. If this happens then write "fizz buzz"

    @Test
    public void fizzBuzzMatchesFizzAndBuzz() {


        for(int x =0; x < 9999; x++){

            FizzBuzzSolution fbs = new FizzBuzzSolution();
            String output = fbs.fizzBuzz(x);

            boolean contains3 = String.valueOf(x).contains("3");
            boolean contains5 = String.valueOf(x).contains("5");

            if(output.equals("fizz fuzz") && contains3 && contains5){
                System.out.println(x);
            }

        }
    }



}