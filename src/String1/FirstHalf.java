package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class FirstHalf {

    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     *
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }
}
