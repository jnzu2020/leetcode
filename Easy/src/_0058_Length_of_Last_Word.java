public class _0058_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        } else {
            int index = 0;
            s = s.trim();
            for (int i = s.length() - 1 ; i >= 0 ; i--) {
                if(s.charAt(i) != ' ') {
                    index++;
                } else {
                    break;
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(lengthOfLastWord(str1));

        String str2 = "";
        System.out.println(lengthOfLastWord(str2));

        String str3 = " ";
        System.out.println(lengthOfLastWord(str3));

        String str4 = "Hello";
        System.out.println(lengthOfLastWord(str4));

        String str5 = " World";
        System.out.println(lengthOfLastWord(str5));

        String str6 = "a ";
        System.out.println(lengthOfLastWord(str6));
    }
}
