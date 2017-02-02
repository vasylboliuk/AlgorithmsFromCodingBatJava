package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class FizzString {

    /**
     * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
     * If both the "f" and "b" conditions are true, return "FizzBuzz".
     * In all other cases, return the string unchanged. (See also: FizzBuzz Code)
     *
     * fizzString("fig") → "Fizz"
     * fizzString("dib") → "Buzz"
     * fizzString("fib") → "FizzBuzz"
     */
    public String fizzString(String str) {
        boolean f = str.substring(0,1).equals("f");
        boolean z = str.substring(str.length()-1).equals("b");
        boolean fz = f && z;

        if(fz) return "FizzBuzz";
        else if(f) return "Fizz";
        else if(z) return "Buzz";
        else return str;
    }
}
