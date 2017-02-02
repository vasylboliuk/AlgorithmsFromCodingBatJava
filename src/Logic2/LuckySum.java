package Logic2;

/**
 * Created by Dell on 2/2/2017.
 */
public class LuckySum {

    /**
     * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then
     * it does not count towards the sum and values to its right do not count.
     * So for example, if b is 13, then both b and c do not count.
     *
     * luckySum(1, 2, 3) → 6
     * luckySum(1, 2, 13) → 3
     * luckySum(1, 13, 3) → 1
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int luckySum(int a, int b, int c) {
        int sum = a + b + c;

        if(a==13) {return sum - a - b - c;}
        if(b==13) {return sum - b -c;}
        if(c==13) {return sum - c;}

        //if(sum<=0) return 0;
        else return sum;
    }
}
