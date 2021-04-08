public class _0038_Count_and_Say {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else if(n == 2) {
            return "11";
        }
        n -= 2;
        StringBuilder result = new StringBuilder("11");
        StringBuilder chars = new StringBuilder();
        StringBuilder numsOfChars = new StringBuilder();
        while (n > 0) {
            int num = 0;
            for (int i = 0 ; i < result.length() ; i++) {
                if (chars.length() == 0) {
                    chars.append(result.charAt(i));
                    num++;
                } else if (chars.charAt(chars.length() - 1) == result.charAt(i)) {
                    num++;
                } else {
                    numsOfChars.append(num);
                    chars.append(result.charAt(i));
                    num = 1;
                }
                if (i == result.length() - 1) {
                    numsOfChars.append(num);
                }
            }
            result = new StringBuilder();
            for (int j = 0 ; j < chars.length() ; j++) {
                result.append(numsOfChars.charAt(j)).append(chars.charAt(j));
            }
            chars = new StringBuilder();
            numsOfChars = new StringBuilder();
            n--;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int test1 = 1;
        System.out.println(countAndSay(test1));

        int test2 = 2;
        System.out.println(countAndSay(test2));

        int test3 = 3;
        System.out.println(countAndSay(test3));

        int test4 = 4;
        System.out.println(countAndSay(test4));

        int test5 = 5;
        System.out.println(countAndSay(test5));

        int test6 = 6;
        System.out.println(countAndSay(test6));
    }
}
