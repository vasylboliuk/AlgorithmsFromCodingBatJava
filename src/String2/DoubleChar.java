package String2;

/**
 * Created by Dell on 1/29/2017.
 */
public class DoubleChar {

    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     *
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public String doubleChar(String str) {
        String newStr = "";
        for(char i: str.toCharArray()){
            newStr = newStr + i + i;
        }
        return newStr;
    }
}
