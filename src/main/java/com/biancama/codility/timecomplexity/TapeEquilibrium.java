package com.biancama.codility.timecomplexity;

/**
 * Created by massimo on 12/09/16.
 */
public class TapeEquilibrium {

	public int solution(int[] A) {
		int sum = 0, left = 0, right = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		for (int i = 0; i < A.length - 1; i++) {
			right = sum - left - A[i];
			left += A[i];

			int diff = Math.abs(left- right);
			if (min > diff ) {
				min = diff ;
			}
		}
		return min;
	}
}
