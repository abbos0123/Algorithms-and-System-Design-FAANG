class Solution {
    int[][] presum;
    public int ways(String[] pizza, int K) {
        int m = pizza.length, n = pizza[0].length();
        long MOD = (long)(1e9 + 7);
        // dp[x][y][k]: means from (x, y) -> (m, n) and k pieces
        long[][][] dp = new long[m][n][K];
        presum = new int[m+1][n+1];

        for(int i = 1; i <= m; i++) {
            int temp = 0;
            for (int j = 1; j <= n; j++) {
                if(pizza[i-1].charAt(j-1) == 'A')
                    temp++;
                presum[i][j] = temp + presum[i-1][j];
            }
        }

        for(int i = m-1; i >= 0; i--) {
            for(int j = n-1; j >= 0; j--) {
                for(int k = 0; k < K; k++) {
                    if(k == 0) {
                        int cnt = getCnt(pizza, i, j, m, n);
                        if(cnt == 0) {
                            dp[i][j][k] = 0;
                        } else {
                            dp[i][j][k] = 1;
                        }
                    } else {
                        long ans = 0;
                        // horizontal
                        for(int x = i; x < m - 1; x++) {
                            if(getCnt(pizza, i, j, x+1, n) > 0) {
                                ans = ans + dp[x+1][j][k-1];
                                ans = ans % MOD;
                            }
                        }
                        // vertical
                        for(int y = j; y < n - 1; y++) {
                            if(getCnt(pizza, i, j, m, y+1) > 0) {
                                ans = ans + dp[i][y+1][k-1];
                                ans = ans % MOD;
                            }
                        }
                        dp[i][j][k] = ans % MOD;
                    }
                }
            }
        }
        return (int)(dp[0][0][K-1] % MOD);
    }



    private int getCnt(String[] pizza, int x, int y, int m, int n) {
        return presum[m][n] + presum[x][y] - presum[m][y] - presum[x][n];
    }
}
