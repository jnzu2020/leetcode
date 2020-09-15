public class _14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String commonPrefix = "";
        int shortestLengthOfArray = findTheShortestStr(strs);

        if (shortestLengthOfArray == 0) {
            return "";
        }

        boolean breakLoop = false;

        forLoop:
        for(int i = 0 ; i < shortestLengthOfArray ; i++) {
            commonPrefix += strs[0].charAt(i);
            for (String str : strs) {
                if (str.indexOf(commonPrefix) != 0) {
                    breakLoop = true;
                    break forLoop;
                }
            }
        }
        if (breakLoop) {
            return commonPrefix.substring(0, commonPrefix.length() - 1);
        } else {
            return commonPrefix;
        }
    }

    /**
     * Find the length of the shortest String in a Array of Strings
     * @param str A array of Strings
     * @return length The length of the shortest String in this array
     */
    private static int findTheShortestStr(String[] str) {
        int length = str[0].length();
        for (String s : str) {
            if (length > s.length()) {
                length = s.length();
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String[] test1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(test1));

        String[] test2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(test2));

        String[] test3 = {"aca","cba"};
        System.out.println(longestCommonPrefix(test3));

        String[] test4 = {"a"};
        System.out.println(longestCommonPrefix(test4));

        String[] test5 = {"c", "c"};
        System.out.println(longestCommonPrefix(test5));
    }
}
