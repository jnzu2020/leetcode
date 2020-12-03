public class _0434_Number_of_Segments_in_a_String {
    public static int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        String[] strArray = s.split(" ");
        int count = 0;
        for (String str : strArray) {
            if (!str.trim().equals("")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "Hello, my name is John";
        System.out.println(countSegments(s1));

        String s2 = "Hello";
        System.out.println(countSegments(s2));

        String s3 = "love live! mu'sic forever";
        System.out.println(countSegments(s3));

        String s4 = "";
        System.out.println(countSegments(s4));

        String s5 = ", , , ,        a, eaefa";
        System.out.println(countSegments(s5));
    }
}
