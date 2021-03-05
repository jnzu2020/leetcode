import java.util.Arrays;

public class _0867_Transpose_Matrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose1 = transpose(matrix1);
        for (int[] arr : transpose1) {
            System.out.println(Arrays.toString(arr));
        }

        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpose2 = transpose(matrix2);
        for (int[] arr : transpose2) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
