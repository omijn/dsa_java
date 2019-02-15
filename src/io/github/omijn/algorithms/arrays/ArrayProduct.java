package io.github.omijn.algorithms.arrays;

/*

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

*/

public class ArrayProduct {
	public static int[] solution(int[] arr) {
		int product = 1;
		
		for (int elem: arr)
			product *= elem;

		for (int i = 0; i < arr.length; i++)
			arr[i] = product / arr[i];

		return arr;
	}
}