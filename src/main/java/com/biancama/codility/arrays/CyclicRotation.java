package com.biancama.codility.arrays;

/**
 * Created by massimo on 12/09/16.
 */
public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		int [] result = new int[A.length];
		for (int i = 0; i < A.length ; i++) {
			result[i] = A[(A.length - K % A.length + i) % A.length];
		}
		return result;
	}
}
