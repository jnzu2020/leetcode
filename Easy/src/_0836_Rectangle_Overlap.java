public class _0836_Rectangle_Overlap {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] || rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
            return false;
        }
        return (rec2[3] > rec1[1]) && (rec2[1] < rec1[3]) && (rec2[2] > rec1[0]) && (rec2[0] < rec1[2]);
    }

    public static void main(String[] args) {
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        System.out.println(isRectangleOverlap(rec1, rec2));

        int[] rec3 = {0, 0, 1, 1};
        int[] rec4 = {1, 0, 2, 1};
        System.out.println(isRectangleOverlap(rec3, rec4));

        int[] rec5 = {0, 0, 1, 1};
        int[] rec6 = {2, 2, 3, 3};
        System.out.println(isRectangleOverlap(rec5, rec6));
    }
}
