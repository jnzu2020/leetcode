import java.util.Arrays;

public class _0492_Construct_the_Rectangle {
    public static int[] constructRectangle(int area) {
        int[] rectangle = new int[2];
        int width = (int) Math.sqrt(area);
        while (width > 0) {
            int temp = area % width;
            if (temp == 0) {
                rectangle[0] = area / width;
                rectangle[1] = width;
                return rectangle;
            } else {
                width--;
            }
        }
        rectangle[0] = 1;
        rectangle[1] = area;
        return rectangle;
    }

    public static void main(String[] args) {
        int area1 = 4;
        System.out.println(Arrays.toString(constructRectangle(area1)));

        int area2 = 37;
        System.out.println(Arrays.toString(constructRectangle(area2)));

        int area3 = 122122;
        System.out.println(Arrays.toString(constructRectangle(area3)));
    }
}
