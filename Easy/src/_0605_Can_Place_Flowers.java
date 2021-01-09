public class _0605_Can_Place_Flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0 ; i < flowerbed.length ; i++) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(canPlaceFlowers(flowerbed, n1));

        int n2 = 2;
        System.out.println(canPlaceFlowers(flowerbed, n2));
    }
}
