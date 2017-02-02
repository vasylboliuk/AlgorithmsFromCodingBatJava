package Logic1;

/**
 * Created by vboliuk on 2/2/2017.
 */
public class MaxMod5 {

    /**
     * Given two int values, return whichever value is larger. However if the two values have the same
     * remainder when divided by 5, then the return the smaller value.
     * However, in all cases, if the two values are the same, return 0.
     * Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
     *
     * maxMod5(2, 3) → 3
     * maxMod5(6, 2) → 6
     * maxMod5(3, 2) → 3
     */
    public int maxMod5(int a, int b) {
        int aMode5 = a%5;
        int bMode5 = b%5;

        if((a>b  && bMode5!=aMode5) || (a<b && bMode5==aMode5)) return a;
        else if((a<b && bMode5!=aMode5) || (a>b && bMode5==aMode5)) return b;
        else return 0;
    }

}
