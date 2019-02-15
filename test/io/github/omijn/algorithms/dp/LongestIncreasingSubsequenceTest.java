package io.github.omijn.algorithms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    @Test
    void solution() {
        assertEquals(1, LongestIncreasingSubsequence.solution(new int[]{2, 2}));
        assertEquals(4, LongestIncreasingSubsequence.solution(new int[]{50, 3, 10, 7, 40, 80}));
        assertEquals(6, LongestIncreasingSubsequence.solution(new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15}));
        assertEquals(3, LongestIncreasingSubsequence.solution(new int[]{3, 10, 2, 1, 20}));
        assertEquals(1, LongestIncreasingSubsequence.solution(new int[]{3, 2}));
        assertEquals(5, LongestIncreasingSubsequence.solution(new int[]{1, 2, 3, 4, 5}));
    }
}