package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class Old35 {

    /**
     * Return true if the given non-negative number is a multiple of 3 or 5, but not both.
     * Use the % "mod" operator -- see Introduction to Mod
     *
     * old35(3) → true
     * old35(10) → true
     * old35(15) → false
     */
    public boolean old35(int n) {
        if((n%3==0 || n%5==0) && !(n%3==0 && n%5==0)) return true;
        return false;
    }
}
