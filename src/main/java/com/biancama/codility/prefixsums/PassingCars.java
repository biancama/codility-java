package com.biancama.codility.prefixsums;

/**
 * Created by massimo on 13/09/16.
 */
public class PassingCars {
	public int solution(int[] A) {
		long increment = 0, total = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 1) {
				total += increment;
			} else {
				increment++;
			}
		}
		if (total > 1000000000) {
			return -1;
		} else {
			return (int) total;
		}
	}

}
