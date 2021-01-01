import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _0566_Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int numOfElement = nums.length * nums[0].length;
        if (numOfElement == r * c) {
            Queue<Integer> queue = new LinkedList<>();
            for (int[] row : nums) {
                for (int num : row) {
                    queue.add(num);
                }
            }
            int[][] result = new int[r][c];
            for (int i = 0 ; i < r ; i++) {
                for (int j = 0 ; j < c ; j++) {
                    result[i][j] = queue.remove();
                }
            }
            return result;
        } else {
            return nums;
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] reshape1 = matrixReshape(nums, 1, 4);
        int[][] reshape2 = matrixReshape(nums, 2, 4);
        for (int[] row : reshape1) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row : reshape2) {
            System.out.println(Arrays.toString(row));
        }
    }
}
