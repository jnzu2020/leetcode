import java.util.Arrays;

public class _0733_Flood_Fill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int currentColor = image[sr][sc];
        if (currentColor != newColor) {
            fillColor(image, sr, sc, currentColor, newColor);
        }
        return image;
    }

    private static void fillColor(int[][] image, int sr, int sc, int currentColor, int newColor) {
        if (image[sr][sc] == currentColor) {
            image[sr][sc] = newColor;
            if (sr > 0) {
                fillColor(image, sr - 1, sc, currentColor, newColor);
            }
            if (sc > 0) {
                fillColor(image, sr, sc - 1, currentColor, newColor);
            }
            if (sr < image.length - 1) {
                fillColor(image, sr + 1, sc, currentColor, newColor);
            }
            if (sc < image[0].length - 1) {
                fillColor(image, sr, sc + 1, currentColor, newColor);
            }
        }
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, newColor = 2;
        int[][] ints = floodFill(image, sr, sc, newColor);
        for (int[] i : ints) {
            System.out.println(Arrays.toString(i));
        }
    }
}
