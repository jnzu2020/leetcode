import java.util.Arrays;

public class _0832_Flipping_an_Image {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] array : image) {
            for (int i = 0, j = array.length - 1 ; i < array.length / 2 ; i++ , j--) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            for (int k = 0 ; k < array.length ; k++) {
                if (array[k] == 0) {
                    array[k] = 1;
                } else {
                    array[k] = 0;
                }
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image1 = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result1 = flipAndInvertImage(image1);
        for (int[] array : result1) {
            System.out.println(Arrays.toString(array));
        }

        int[][] image2 = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result2 = flipAndInvertImage(image2);
        for (int[] array : result2) {
            System.out.println(Arrays.toString(array));
        }
    }
}
