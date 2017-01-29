package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class Right2 {

    /**
     * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.
     *
     * right2("Hello") → "loHel"
     * right2("java") → "vaja"
     * right2("Hi") → "Hi"
     *
     */
    public String right2(String str) {
        return str.substring(str.length()-2, str.length()) + str.substring(0,str.length()-2);
    }

}
