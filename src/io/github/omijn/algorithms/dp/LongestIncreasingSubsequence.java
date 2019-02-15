package io.github.omijn.algorithms.dp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LongestIncreasingSubsequence {
    public static int solution(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int[] cache = new int[n];   // let cache[i] be the longest increasing subsequence ending at index i
        cache[0] = 1;

        for (int i = 1; i < n; i++) {
            Integer max = null;
            Integer maxPos = null;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && (max == null || cache[j] >= max)) {
                    max = cache[j];
                    maxPos = j;
                }
            }
            if (maxPos == null) cache[i] = 1;
            else cache[i] = cache[maxPos] + 1;
        }

        return Collections.max(Arrays.stream(cache).boxed().collect(Collectors.toList()));
    }
}
