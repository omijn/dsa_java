package io.github.omijn.algorithms.dp;

public class NthCatalanNumber {
    public static int recursiveSolution(int n) {
        if (n == 0) return 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += recursiveSolution(i) * recursiveSolution(n - 1 - i);
        }

        return sum;
    }

    public static int dpMemo(int n) {
        int[] cache = new int[n + 1];   // let cache[i] = ith catalan number
        cache[0] = 1;
        return dpHelperMemo(n, cache);
    }

    public static int dpTab(int n) {
        int[] cache = new int[n + 1];   // let cache[i] = ith catalan number
        cache[0] = 1;
        return dpHelperTab(n, cache);
    }

    private static int dpHelperMemo(int n, int[] cache) {
        if (cache[n] != 0) return cache[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += dpHelperMemo(i, cache) * dpHelperMemo(n - 1 - i, cache);
        }

        cache[n] = sum;
        return cache[n];
    }

    private static int dpHelperTab(int n, int[] cache) {

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += cache[j] * cache[i - 1 - j];
            }
            cache[i] = sum;
        }

        return cache[n];
    }
}
