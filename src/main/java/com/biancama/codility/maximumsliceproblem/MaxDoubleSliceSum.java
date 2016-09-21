package com.biancama.codility.maximumsliceproblem;

/**
 * Created by massimo on 13/09/16.
 */
public class MaxDoubleSliceSum {

	public int solution(int[] A) {
		int maxEnding = 0, maxSlice = 0;
		int minInteger = Integer.MAX_VALUE;
		for (int i = 1; i < A.length - 1 ; i++) {
			maxEnding =  Math.max(0, maxEnding + A[i]);
			maxSlice = Math.max(maxSlice, maxEnding);
		}

		return maxSlice;
	}
}
