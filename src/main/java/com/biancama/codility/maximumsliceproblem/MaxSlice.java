package com.biancama.codility.maximumsliceproblem;

import static java.lang.System.out;

/**
 * Created by massimo on 15/09/16.
 */
public class MaxSlice {

	public int solution(int[] A) {
		return maxSliceCompute(A);
	}

	private int maxSliceCompute(int[] A) {
		int maxEnding= 0, maxSlice = 0;
		for (int a: A) {
			maxEnding = Math.max(0, maxEnding + a);
			maxSlice = Math.max(maxSlice, maxEnding);
			out.println(maxEnding + " " + maxSlice);
		}
		return maxSlice;
	}
}
