package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean divisibleBy3 = number % 3 ==0 ? true : false;
        boolean containsChar3 = String.valueOf(number).contains("3");
        boolean divisibleBy5 = number % 5 ==0 ? true : false;
        boolean containsChar5 = String.valueOf(number).contains("5");

        boolean isFakeDeluxe = false;
        boolean isDeluxe = false;
        String deluxeVal = "";

        if(number>10) {
            isFakeDeluxe = number % 2 == 0 ? false : true; // fake deluxes are odd numbers
            if (!isFakeDeluxe && (divisibleBy3 && containsChar3)) {
                isDeluxe = true;
            }
            if (!isFakeDeluxe && (divisibleBy5 && containsChar5)) {
                isDeluxe = true;
            }
            if (isFakeDeluxe) {
                deluxeVal = " fake deluxe";
            } else if (isDeluxe) {
                deluxeVal = " deluxe";
            }
        }

        if((divisibleBy3 || containsChar3) && (divisibleBy5 || containsChar5)){

            return String.format("fizz buzz%s", deluxeVal);
        }

        if(divisibleBy3 || containsChar3){
            return  String.format("fizz%s", deluxeVal);
        }

        if(divisibleBy5 || containsChar5){
            return  String.format("buzz%s", deluxeVal);
        }

        if(isFakeDeluxe || isDeluxe){
            return  deluxeVal.trim();
        }

        return String.valueOf(number);
    }





}