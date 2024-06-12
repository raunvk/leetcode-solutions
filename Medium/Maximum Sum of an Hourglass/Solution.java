class Solution {
    public int maxSum(int[][] grid) {
        int maxsum = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0; i<row-2; i++) {
            for(int j=0; j<col-2; j++) {
                int sum = 0;
                for(int z=j; z<j+3; z++) {
                    sum += grid[i][z];
                }
                sum += grid[i+1][j+1];
                 for(int z=j; z<j+3; z++) {
                    sum += grid[i+2][z];
                }
                maxsum = Math.max(sum, maxsum);
            }
        }
        return maxsum;
    }
}