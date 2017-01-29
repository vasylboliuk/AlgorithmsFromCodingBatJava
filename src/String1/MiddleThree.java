package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class MiddleThree {

    /**
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
     * The string length will be at least 3.
     *
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     */
    public String middleThree(String str) {
        int len = str.length();

        if(len==3) return str;
        return str.substring(len/2-1, len/2+2);
    }
}
