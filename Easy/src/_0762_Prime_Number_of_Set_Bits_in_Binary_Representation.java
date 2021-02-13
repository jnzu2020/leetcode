public class _0762_Prime_Number_of_Set_Bits_in_Binary_Representation {
    public static int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L ; i <= R ; i++) {
            String num = Integer.toBinaryString(i);
            int numOfOne = 0;
            for (char c : num.toCharArray()) {
                if (c == '1') {
                    numOfOne++;
                }
            }
            if (numOfOne == 2 || numOfOne == 3 || numOfOne == 5 || numOfOne == 7 ||
                    numOfOne == 11 || numOfOne == 13 || numOfOne == 17 || numOfOne == 19) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int L1 = 6, R1 = 10;
        System.out.println(countPrimeSetBits(L1, R1));

        int L2 = 10, R2 = 15;
        System.out.println(countPrimeSetBits(L2, R2));
    }
}
