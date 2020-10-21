public class _0191_Number_of_1_Bits {
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        int n1 = Integer.parseInt("00000000000000000000000000001011", 2);
        System.out.println(hammingWeight(n1));

        int n2 = Integer.parseInt("00000000000000000000000010000000", 2);
        System.out.println(hammingWeight(n2));

        int n3 = Integer.parseInt("11111111111111111111111111111101", 2);
        System.out.println(hammingWeight(n3));

    }
}
