public class _0868_Binary_Gap {
    public static int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int gap = 0;
        int first = -1;
        int second = -1;
        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) == '1') {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                    gap = Math.max(gap, second - first);
                } else {
                    first = second;
                    second = i;
                    gap = Math.max(gap, second - first);
                }
            }
        }
        return gap;
    }

    public static void main(String[] args) {
        int n1 = 22;
        System.out.println(binaryGap(n1));

        int n2 = 5;
        System.out.println(binaryGap(n2));

        int n3 = 6;
        System.out.println(binaryGap(n3));

        int n4 = 8;
        System.out.println(binaryGap(n4));

        int n5 = 1;
        System.out.println(binaryGap(n5));
    }
}
