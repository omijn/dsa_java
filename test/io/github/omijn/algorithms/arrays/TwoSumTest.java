package io.github.omijn.algorithms.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
	public void bruteForce() {
		assertTrue(TwoSum.bruteForce(new int[]{1, 2, 3}, 5));
		assertFalse(TwoSum.bruteForce(new int[]{1, 2, 3}, 6));
		assertTrue(TwoSum.bruteForce(new int[]{1, 2, 9, 15}, 11));
		assertFalse(TwoSum.bruteForce(new int[]{1, 2, 9, 15}, 12));
	}

	@Test
	public void optimized() {
		assertTrue(TwoSum.bruteForce(new int[]{1, 2, 3}, 5));
		assertFalse(TwoSum.bruteForce(new int[]{1, 2, 3}, 6));
		assertTrue(TwoSum.bruteForce(new int[]{1, 2, 9, 15}, 11));
		assertFalse(TwoSum.bruteForce(new int[]{1, 2, 9, 15}, 12));
	}

	@Test
	public void best() {
		assertTrue(TwoSum.bruteForce(new int[]{1, 2, 3}, 5));
		assertFalse(TwoSum.bruteForce(new int[]{1, 2, 3}, 6));
		assertTrue(TwoSum.bruteForce(new int[]{1, 2, 9, 15}, 11));
		assertFalse(TwoSum.bruteForce(new int[]{1, 2, 9, 15}, 12));
	}

	@Test
	public void singlePassHashWithIndices() {
    	assertArrayEquals(new int[]{1, 2}, TwoSum.singlePassHashWithIndices(new int[]{1, 2, 3}, 5));
		assertArrayEquals(new int[]{0, 0}, TwoSum.singlePassHashWithIndices(new int[]{1, 2, 3}, 6));
		assertArrayEquals(new int[]{1, 2}, TwoSum.singlePassHashWithIndices(new int[]{1, 2, 9, 15}, 11));
		assertArrayEquals(new int[]{0, 0}, TwoSum.singlePassHashWithIndices(new int[]{1, 2, 9, 15}, 12));
	}
}
