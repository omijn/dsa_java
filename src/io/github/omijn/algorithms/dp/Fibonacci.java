package io.github.omijn.algorithms.dp;

import java.util.Arrays;

public class Fibonacci {

    public static int nthRecursive(int n) {
        if (n <= 1) return n;
        return nthRecursive(n - 1) + nthRecursive(n - 2);
    }

    public static int nthDPR(int n) {
        if (n <= 1) return n;
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;
        return nthDPR(n, cache);
    }


    /**
     * Recursive dynamic programming solution (memoization)
     *
     * @param n     Index of desired Fibonacci number
     * @param cache Table to store solutions to repeated subproblems
     * @return      nth Fibonacci number
     */
    public static int nthDPR(int n, int[] cache) {
        if (cache[n] != -1) return cache[n];
        cache[n] = nthDPR(n - 1, cache) + nthDPR(n - 2, cache);
        return cache[n];
    }

    /**
     * Iterative dynamic programming solution (tabulation)
     *
     * @param n     Index of desired Fibonacci number
     * @return      nth Fibonacci number
     */
    public static int nthDPI(int n) {
        if (n <= 1) return n;
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n];
    }
}
