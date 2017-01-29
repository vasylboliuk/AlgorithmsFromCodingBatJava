package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class LastChars {

    /**
     * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
     * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
     *
     * lastChars("last", "chars") → "ls"
     * lastChars("yo", "java") → "ya"
     * lastChars("hi", "") → "h@"
     */
    public String lastChars(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        String aStr = "@";
        String bStr = "@";

        if(aLen!=0)
        {
            aStr = a.substring(0,1);
        }
        if(bLen!=0)
        {
            bStr = b.substring(b.length()-1,b.length());
        }

        return aStr + bStr;
    }


}
