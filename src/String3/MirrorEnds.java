package String3;

/**
 * Created by Dell on 1/29/2017.
 */
public class MirrorEnds {

    /**
     * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
     * In other words, zero or more characters at the very begining of the given string,
     * and at the very end of the string in reverse order (possibly overlapping).
     * For example, the string "abXYZba" has the mirror end "ab".
     *
     * mirrorEnds("abXYZba") → "ab"
     * mirrorEnds("abca") → "a"
     * mirrorEnds("aba") → "aba"
     * @param string
     * @return
     */
    public String mirrorEnds(String string) {
        String str = string;
        String result = "";
        String part1 = "";
        String part2 = "";

        int mid = str.length() / 2;
        int lengthPart1 = mid;
        int lengthPart2 = mid;

        if (str.length() % 2 == 1)
        {
            lengthPart1 = lengthPart1 + 1;
            part1 = str.substring(0, lengthPart1);
            part2 = str.substring(lengthPart2);
        }
        else
        {
            part1 = str.substring(0, lengthPart1);
            part2 = str.substring(lengthPart2);
        }

        char[] part1List = part1.toCharArray();
        char[] part2List = part2.toCharArray();

        for (int i = 0; i < lengthPart1; i++)
        {
            if (part1List[i] == part2List[(lengthPart1-1) - i])
            {
                result = result + part1List[i];
            }else{break;}
        }

        if (result.equals(part1)) return str;

        return result;
    }

}
