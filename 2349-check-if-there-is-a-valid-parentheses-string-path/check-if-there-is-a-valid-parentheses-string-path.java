class Solution {
    int m, n;
    Boolean dp[][][];

    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        dp = new Boolean[m][n][m + n + 1];

        return solve(0, 0, 0, grid);
    }

    private boolean solve(int i, int j, int balance, char[][] grid) {

        if (balance < 0) {
            return false;
        }

        if (grid[i][j] == '(') {
            balance++;
        } else {
            balance--;
        }

        if (balance < 0) {
            return false;
        }

        if (i == m - 1 && j == n - 1) {
            return balance == 0;
        }

        if (dp[i][j][balance] != null) {
            return dp[i][j][balance];
        }

        boolean down = false;
        boolean right = false;

        if (i + 1 < m) {
            down = solve(i + 1, j, balance, grid);
        }

        if (j + 1 < n) {
            right = solve(i, j + 1, balance, grid);
        }

        return dp[i][j][balance] = down || right;
    }
}