public class _0190_Reverse_Bits {
    public static int reverseBits(int n) {
        return Integer.reverse(n);
    }

    public static void main(String[] args) {
        int n1 = 43261596;
        System.out.println(reverseBits(n1));
    }
}
