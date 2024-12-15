class Solution {

    private void dfs (char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';

        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);

    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int numsIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numsIslands++;
                    dfs(grid, i ,j);
                }
            }
        }

        return numsIslands;
    }
}