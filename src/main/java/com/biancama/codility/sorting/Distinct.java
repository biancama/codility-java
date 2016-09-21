package com.biancama.codility.sorting;

import java.util.Arrays;

/**
 * Created by massimo on 13/09/16.
 */
public class Distinct {
	public int solution(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		Arrays.sort(A);
		int result = 1;
		int previousElement = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] != previousElement) {
				result++;
				previousElement = A[i];
			}
		}
		return result;
	}
}
