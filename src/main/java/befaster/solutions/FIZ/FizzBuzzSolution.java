package befaster.solutions.FIZ;

import java.util.HashSet;
import java.util.Set;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean isDeluxe = isDeluxe(number);

        boolean divisibleBy3 = number % 3 ==0 ? true : false;
        boolean containsChar3 = String.valueOf(number).contains("3");

        boolean divisibleBy5 = number % 5 ==0 ? true : false;
        boolean containsChar5 = String.valueOf(number).contains("5");


        if((divisibleBy3 || containsChar3) && (divisibleBy5 || containsChar5)){
            return "fizz buzz";
        }

        if(divisibleBy3 || containsChar3){
            return  "fizz";
        }

        if(divisibleBy5 || containsChar5){
            return  "buzz";
        }
        return String.valueOf(number);
    }


    private boolean isDeluxe(Integer number){

        if(number<10){
            return false;
        }

        String stringVal = String.valueOf(number);

        String[] splitIntegers = stringVal.split("");
        Set<String> unqStrings = new HashSet<>();

        for(String stringInteger: splitIntegers){
            if(!unqStrings.add(stringInteger)){
                return true;
            }
        }
        return false;
    }


}
