package befaster.solutions.FIZ;

import java.util.HashSet;
import java.util.Set;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        // fizz deluxe divisible by 3 AND it has a 3 in it
        // buzz deluxe  divisible by 5 AND it has a 5 in it

        boolean isFakeDeluxe = number % 2 == 0 ? false : true; // fake deluxes are odd numbers

        String deluxeVal = "deluxe";
        if(isFakeDeluxe){
            deluxeVal = "fake deluxe";
        }


        boolean divisibleBy3 = number % 3 ==0 ? true : false;
        boolean containsChar3 = String.valueOf(number).contains("3");

        boolean divisibleBy5 = number % 5 ==0 ? true : false;
        boolean containsChar5 = String.valueOf(number).contains("5");


        if((divisibleBy3 || containsChar3) && (divisibleBy5 || containsChar5)){
            return String.format("fizz buzz %s", deluxeVal);
        }

        if(divisibleBy3 || containsChar3){
            return  String.format("fizz %s", deluxeVal);
        }

        if(divisibleBy5 || containsChar5){
            return  String.format("buzz %s", deluxeVal);
        }

        if(isFakeDeluxe){
            return  deluxeVal;
        }

        return String.valueOf(number);
    }





}