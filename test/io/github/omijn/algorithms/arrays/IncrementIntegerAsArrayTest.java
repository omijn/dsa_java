package io.github.omijn.algorithms.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncrementIntegerAsArrayTest {

    @Test
    void solution() {
        assertArrayEquals(new int[]{1, 3, 0}, IncrementIntegerAsArray.solution(new int[]{1, 2, 9}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, IncrementIntegerAsArray.solution(new int[]{9, 9, 9}));
        assertArrayEquals(new int[]{1}, IncrementIntegerAsArray.solution(new int[]{0}));
        assertArrayEquals(new int[]{1, 2, 3, 5}, IncrementIntegerAsArray.solution(new int[]{1, 2, 3, 4}));
    }
}