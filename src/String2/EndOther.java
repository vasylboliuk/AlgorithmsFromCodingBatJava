package String2;

/**
 * Created by Dell on 1/29/2017.
 */
public class EndOther {

    /**
     * Given two strings, return true if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     *
     * endOther("Hiabc", "abc") → true
     * endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     * @param a
     * @param b
     * @return
     */
    public boolean endOther(String a, String b) {
        String a2 = a.toLowerCase();
        String b2 = b.toLowerCase();
        if(a2.endsWith(b2) || b2.endsWith(a2)){
            return true;
        }
        return false;

    }
}
