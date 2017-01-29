package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class WithoutX2 {

    /**
     * Given a string, if one or both of the first 2 chars is 'x',
     * return the string without those 'x' chars, and otherwise return the string unchanged.
     * This is a little harder than it looks.
     *
     * withoutX2("xHi") → "Hi"
     * withoutX2("Hxi") → "Hi"
     * withoutX2("Hi") → "Hi"
     */
    public String withoutX2(String str) {
        String strWithout1Ch = "";
        if(str.isEmpty()) str = "";
        else strWithout1Ch = str.substring(1, str.length());
        if(strWithout1Ch.startsWith("x")) return str.replaceAll("x","");
        String str1 = "";
        if(str.startsWith("x")) return strWithout1Ch;
        return str;
    }
}
