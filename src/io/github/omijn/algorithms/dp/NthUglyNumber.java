package io.github.omijn.algorithms.dp;

public class NthUglyNumber {
    public static int solution(int n) {
        if (n <= 0) return 0;
        int[] ugly = new int[n + 1];
        ugly[1] = 1;
        int nextMultipleOf2 = 2;
        int nextMultipleOf3 = 3;
        int nextMultipleOf5 = 5;

        for (int i = 2; i <= n; i++) {
            ugly[i] = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));

        }

        return 0;
    }
}
