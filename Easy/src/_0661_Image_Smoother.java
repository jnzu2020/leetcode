import java.util.Arrays;

public class _0661_Image_Smoother {
    public static int[][] imageSmoother(int[][] M) {
        int[][] answer = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++)
            for (int j = 0; j < M[i].length; j++) {
                int count = 0;
                for (int k = i - 1; k <= i + 1; k++)
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && k < M.length && l >= 0 && l < M[i].length) {
                            answer[i][j] += M[k][l];
                            count++;
                        }
                    }
                answer[i][j] /= count;
            }
        return answer;
    }

    public static void main(String[] args) {
        int[][] m = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] result = imageSmoother(m);
        for (int[] array : result) {
            System.out.println(Arrays.toString(array));
        }
    }
}
