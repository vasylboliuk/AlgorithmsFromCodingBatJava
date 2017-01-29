package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class TwoChar {

    /**
     * Given a string and an index, return a string length 2 starting at the given index.
     * If the index is too big or too small to define a string length 2, use the first 2 chars.
     * The string length will be at least 2.
     *
     * twoChar("java", 0) → "ja"
     * twoChar("java", 2) → "va"
     * twoChar("java", 3) → "ja"
     */
    public String twoChar(String str, int index) {
        int strLen = str.length();
        if(index>strLen || index<1 || index==strLen || index==strLen-1) return str.substring(0,2);
        else if(index<strLen) return str.substring(index,index+2);
        return str.substring(0,2);
    }
}
