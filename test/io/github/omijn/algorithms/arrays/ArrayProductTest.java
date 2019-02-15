package io.github.omijn.algorithms.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayProductTest {
    @Test
	public void solution() {
		assertArrayEquals(new int[]{6, 3, 2}, ArrayProduct.solution(new int[]{1, 2, 3}));
		assertArrayEquals(new int[]{120, 60, 40, 30, 24}, ArrayProduct.solution(new int[]{1, 2, 3, 4, 5}));
	}
}
