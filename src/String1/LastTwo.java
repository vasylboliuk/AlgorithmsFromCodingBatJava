package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class LastTwo {

    /**
     * Given a string of any length, return a new string where the last 2 chars,
     * if present, are swapped, so "coding" yields "codign".
     *
     * lastTwo("coding") → "codign"
     * lastTwo("cat") → "cta"
     * lastTwo("ab") → "ba"
     */
    public String lastTwo(String str) {
        int strLen = str.length();
        if (strLen > 1)
        {
            String part1 = str.substring(0, strLen - 2);
            String swap1 = ""+str.charAt(strLen-1) + str.charAt(strLen - 2);
            return part1 + swap1;
        }
        return str;
    }
}
