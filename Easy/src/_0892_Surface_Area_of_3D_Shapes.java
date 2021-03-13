public class _0892_Surface_Area_of_3D_Shapes {
    public static int surfaceArea(int[][] grid) {
        int answer = 0;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[i].length ; j++) {
                if (grid[i][j] > 0) {
                    answer += 2;
                }
                if (i == 0) {
                    answer += grid[i][j];
                }
                if (j == 0) {
                    answer += grid[i][j];
                }
                if (i == grid.length - 1) {
                    answer += grid[i][j];
                }
                if (j == grid[i].length - 1) {
                    answer += grid[i][j];
                }
                if (i < grid.length - 1) {
                    answer += Math.abs(grid[i][j] - grid[i + 1][j]);
                }
                if (j < grid[i].length - 1) {
                    answer += Math.abs(grid[i][j] - grid[i][j + 1]);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{2}};
        System.out.println(surfaceArea(grid1));

        int[][] grid2 = {{1, 2}, {3, 4}};
        System.out.println(surfaceArea(grid2));

        int[][] grid3 = {{1, 0}, {0, 2}};
        System.out.println(surfaceArea(grid3));

        int[][] grid4 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println(surfaceArea(grid4));

        int[][] grid5 = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        System.out.println(surfaceArea(grid5));
    }
}
