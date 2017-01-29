package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class NTwice {

    /**
     * Given a string and an int n, return a string made of the first and last n chars from the string.
     * The string length will be at least n.
     *
     * nTwice("Hello", 2) → "Helo"
     * nTwice("Chocolate", 3) → "Choate"
     * nTwice("Chocolate", 1) → "Ce"
     */
    public String nTwice(String str, int n) {
        int strLen = str.length();
        return str.substring(0,n)+str.substring(strLen-n,strLen);
    }

}
