public class _0461_Hamming_Distance {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        if (xor == 0) {
            return 0;
        }
        int distance = 0;
        while (xor != 0) {
            if ((xor & 1) == 1) {
                distance++;
            }
            xor >>= 1;
        }
        return distance;
    }

    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(hammingDistance(x, y));
    }
}
