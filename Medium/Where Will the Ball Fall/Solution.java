class Solution {
    private int[][] grid;
    private int m;
    private int n;
    public int[] findBall(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        int[] res = new int[n];
        for (int i=0; i<n; i++) {
            res[i] = calculateExitIndex(i);
        }
        return res;
    }
    public int calculateExitIndex(int startingColumn) {
        int row = 0;
        int column = startingColumn;
        while (row < m) {
            if (grid[row][column] == 1) {
                if (column == n-1 || grid[row][column + 1] == -1) return -1;
                row++;
                column++;
                continue;
            }
            if (grid[row][column] == -1) {
                if (column == 0 || grid[row][column - 1] == 1) return -1;
                row++;
                column--;
                continue;
            }
        }
        return column;
    }
}