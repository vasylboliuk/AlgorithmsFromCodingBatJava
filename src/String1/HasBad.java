package String1;

/**
 * Created by Dell on 1/29/2017.
 */
public class HasBad {

    /**
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
     * Note: use .equals() to compare 2 strings.
     *
     * hasBad("badxx") → true
     * hasBad("xbadxx") → true
     * hasBad("xxbadxx") → false
     */
    public boolean hasBad(String str) {
        String strNew = str;
        if(str.length()>3){
            strNew = str.substring(0,4);
        }
        if(strNew.contains("bad")) return true;
        return false;
    }
}
