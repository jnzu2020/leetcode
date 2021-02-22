public class _0812_Largest_Triangle_Area {
    public static double largestTriangleArea(int[][] points) {
        double result = 0.0;
        for (int i = 0 ; i < points.length ; i++) {
            for (int j = i + 1 ; j < points.length ; j++) {
                for (int k = j + 1 ; k < points.length ; k++) {
                    result = Math.max(result, triangleArea(points[i], points[j], points[k]));
                }
            }
        }
        return result;
    }

    private static double triangleArea(int[] pointA, int[] pointB, int[] pointC) {
        return 0.5 * Math.abs((pointB[0] - pointA[0]) * (pointC[1]-pointA[1]) -
                (pointC[0] - pointA[0]) * (pointB[1] - pointA[1]));
    }

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        System.out.println(largestTriangleArea(points));
    }
}
