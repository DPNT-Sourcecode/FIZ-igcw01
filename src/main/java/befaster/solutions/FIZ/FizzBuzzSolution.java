package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean divisibleBy3 = number % 3 ==0 ? true : false;
        boolean containsChar3 = String.valueOf(number).contains("3");

        boolean divisibleBy5 = number % 5 ==0 ? true : false;
        boolean containsChar5 = String.valueOf(number).contains("5");


        if(divisibleBy3  && divisibleBy5){
            return "fizz buzz";
        }

        if(divisibleBy3 || containsChar3){
            return  "fizz";
        }

        if(divisibleBy5){
            return  "buzz";
        }
        return String.valueOf(number);
    }

}
