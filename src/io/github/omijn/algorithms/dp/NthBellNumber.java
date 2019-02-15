package io.github.omijn.algorithms.dp;

public class NthBellNumber {
    public static int dpTab(int n) {
        int[][] cache = new int[n + 1][n + 1];      // cache[i][j] = num of ways to partition i elements into j sets

        for (int i = 1; i <= n; i++)
            cache[i][1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                cache[i][j] = j * cache[i - 1][j] + cache[i - 1][j - 1];
            }
        }

        int result = 0;
        for (int i = 1; i <= n; i++)
            result += cache[n][i];

        return result;
    }
}
