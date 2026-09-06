class Solution {
    int[][] dp;

    public int numDistinct(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();

        dp = new int[s1 + 1][t1 + 1];

        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        return helper(s, t, s1, t1);
    }

    public int helper(String s, String t, int s1, int t1) {
        if (t1 == 0) {
            return 1;
        }

        if (s1 == 0) {
            return 0;
        }

        if (dp[s1][t1] != -1) {
            return dp[s1][t1];
        }

        if (s.charAt(s1 - 1) == t.charAt(t1 - 1)) {
            dp[s1][t1] = helper(s, t, s1 - 1, t1 - 1)
                        + helper(s, t, s1 - 1, t1);
        } else {
            dp[s1][t1] = helper(s, t, s1 - 1, t1);
        }

        return dp[s1][t1];
    }
}