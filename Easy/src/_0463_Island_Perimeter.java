public class _0463_Island_Perimeter {
    public static int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[i].length ; j++) {
                if (grid[i][j] == 1) {
                    result += 4;

                    if (((i - 1) >= 0) && (grid[i - 1][j] == 1)) {
                        result--;
                    }
                    if (((i + 1) < grid.length) && (grid[i + 1][j] == 1)) {
                        result--;
                    }
                    if (((j - 1) >= 0) && (grid[i][j - 1] == 1)) {
                        result--;
                    }
                    if (((j + 1) < grid[i].length) && (grid[i][j + 1] == 1)) {
                        result--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid1));

        int[][] grid2 = {{1}};
        System.out.println(islandPerimeter(grid2));

        int[][] grid3 = {{1,0}};
        System.out.println(islandPerimeter(grid3));
    }
}
