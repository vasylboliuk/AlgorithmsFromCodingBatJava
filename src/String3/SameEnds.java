package String3;

public class SameEnds {

    /**
     * Given a string, return the longest substring that appears at both the beginning and end of the string
     * without overlapping.
     * For example, sameEnds("abXab") is "ab".
     * sameEnds("abXYab") → "ab"
     * sameEnds("xx") → "x"
     * sameEnds("xxx") → "x"
     * @param string
     * @return
     */
    public static String sameEnds(String string) {
        String result = "";
        int mid = string.length() / 2;
        String part1 = "";
        String part2 = "";
        int lengthPart1 = mid;
        int lengthPart2 = mid;
        if (string.length()%2 == 1)
        {
            lengthPart2 = lengthPart2 + 1;
            part1 = string.substring(0, lengthPart1);
            part2 = string.substring(lengthPart2);
        }else
        {
            part1 = string.substring(0, lengthPart1);
            part2 = string.substring(lengthPart2);
        }

        boolean isPart1EqualsPart2 = part1.equals(part2);

        if (isPart1EqualsPart2 == true)
        {
            result = part1;
        }

        while (isPart1EqualsPart2==false)
        {
            if (!part1.equals(part2))
            {
                lengthPart1 = lengthPart1 - 1;
                lengthPart2 = lengthPart2 + 1;
                part1 = string.substring(0, lengthPart1);
                part2 = string.substring(lengthPart2);
            }
            else
            {
                result = string.substring(0, lengthPart1);
                isPart1EqualsPart2 = true;
            }
        }
        return result;
    }
}
