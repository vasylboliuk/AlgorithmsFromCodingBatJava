package Logic2;

/**
 * Created by Dell on 2/2/2017.
 */
public class EvenlySpaced {

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean evenlySpaced(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);
        int bc = Math.abs(c - b);
        int abc = Math.abs(a - b - c);

        if (a <= b && b <= c && ab == bc) return true;
        if (a < b && a > c && ac == ab) return true;
        if (a > b && b < c && ac == bc) return true;
        if (a > b && b < c && ab == ac) return true;

        else return false;
    }

    public boolean evenlySpacedSolution2(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int mid = Math.max(Math.min(a, b), c);
        int mid2 = Math.min(Math.max(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        if(Math.abs(mid - min) == Math.abs(mid - max)
                || Math.abs(mid2 - min) == Math.abs(mid2 - max)) return true;
        return false;
    }
}
