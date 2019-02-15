package io.github.omijn.algorithms.arrays;

import java.util.*;

public class TwoSum {
	public static boolean bruteForce(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k)
					return true;
			}
		}
		return false;
	}

	public static boolean optimized(int[] arr, int k) {
		Arrays.sort(arr);
		for (int elem: arr) {
			if (Arrays.binarySearch(arr, k - elem) >= 0)
				return true;
		}
		return false;
	}

	public static boolean best(int[] arr, int k) {
		Set<Integer> elements = new HashSet<>();
		for (int elem: arr) {
			if (elements.contains(k - elem))
				return true;
			elements.add(elem);
		}
		return false;
	}

	public static int[] singlePassHashWithIndices(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int complement = k - arr[i];
			if (map.containsKey(complement))
				return new int[]{map.get(complement), i};
			map.put(arr[i], i);
		}
		return new int[]{0, 0};
	}
}
