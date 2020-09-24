public class _0067_Add_Binary {
    public static String addBinary(String a, String b) {
        int size = Math.max(a.length(), b.length());
        if (a.length() == size) {
            int numOfZero = size - b.length();
            StringBuilder bBuilder = new StringBuilder(b);
            for (int i = 0; i < numOfZero ; i++) {
                bBuilder.insert(0, "0");
            }
            b = bBuilder.toString();
        } else {
            int numOfZero = size - a.length();
            StringBuilder aBuilder = new StringBuilder(a);
            for (int i = 0; i < numOfZero ; i++) {
                aBuilder.insert(0, "0");
            }
            a = aBuilder.toString();
        }
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = size - 1 ; i >= 0 ; i--) {
            int tempA = Integer.parseInt(a.charAt(i) + "");
            int tempB = Integer.parseInt(b.charAt(i) + "");
            if (tempA == 0 && tempB == 0) {
                if (carry == 0) {
                    result.insert(0, "0");
                } else {
                    result.insert(0, "1");
                    carry = 0;
                }
            } else if (tempA == 0 && tempB == 1) {
                if (carry == 0) {
                    result.insert(0, "1");
                } else {
                    result.insert(0, "0");
                }
            } else if (tempA == 1 && tempB == 0) {
                if (carry == 0) {
                    result.insert(0, "1");
                } else {
                    result.insert(0, "0");
                }
            } else if (tempA == 1 && tempB == 1) {
                if (carry == 0) {
                    result.insert(0, "0");
                    carry = 1;
                } else {
                    result.insert(0, "1");
                }
            }
        }
        if (carry == 1) {
            result.insert(0, "1");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";
        System.out.println(addBinary(a1, b1));

        String a2 = "1010";
        String b2 = "1011";
        System.out.println(addBinary(a2, b2));

        String a3 = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b3 = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(a3, b3));
    }
}
