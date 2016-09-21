package com.biancama.codility;

/**
 * Created by massimo on 12/09/16.
 */
public class Equi {

	public int solution(int[] A) {
		long sum = 0;

		if (A.length == 0) {
			return -1;
		}

		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}

		long sumLeft = 0;
		for (int i = 0; i < A.length ; i++) {
			long sumRight = sum - sumLeft - A[i];
			if (sumLeft == sumRight) {
				return i;
			}
			sumLeft = sumLeft + A[i];

		}

		return -1;

	}
}
