package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class ExtraEnd {

    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
     * The string length will be at least 2.
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi"
     */
    public String extraEnd(String str) {
        int lastIn =  str.length();
        String subString = str.substring(lastIn-2, lastIn);
        String result = "";
        for(int i=0; i<3; i++){
            result = result + subString;
        }
        return result;
    }
}
