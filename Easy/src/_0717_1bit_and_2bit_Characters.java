public class _0717_1bit_and_2bit_Characters {
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 0) {
                i++;
            } else {
                i += 2;
            }
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        int[] bits1 = {1, 0, 0};
        System.out.println(isOneBitCharacter(bits1));

        int[] bits2 = {1, 1, 1, 0};
        System.out.println(isOneBitCharacter(bits2));
    }
}
