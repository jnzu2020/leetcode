public class _0883_Projection_Area_of_3D_Shapes {
    public static int projectionArea(int[][] grid) {
        int shadowXY = 0;
        int shadowXZ = 0;
        int shadowYZ = 0;
        for (int i = 0 ; i < grid.length ; i++) {
            int maxRow = 0;
            int maxCol = 0;
            for (int j = 0 ; j < grid[i].length ; j++) {
                if (grid[i][j] != 0) {
                    shadowXY++;
                }
                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            shadowXZ += maxRow;
            shadowYZ += maxCol;
        }
        return shadowXY + shadowXZ + shadowYZ;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{1, 2}, {3, 4}};
        System.out.println(projectionArea(grid1));

        int[][] grid2 = {{2}};
        System.out.println(projectionArea(grid2));

        int[][] grid3 = {{1, 0}, {0, 2}};
        System.out.println(projectionArea(grid3));

        int[][] grid4 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println(projectionArea(grid4));

        int[][] grid5 = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        System.out.println(projectionArea(grid5));
    }
}
