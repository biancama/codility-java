package com.biancama.codility.arrays;

/**
 * Created by massimo on 12/09/16.
 */
public class OddOccurrencesInArray {

	public int solution(int[] A) {
		int value = 0;
		for (int i = 0; i < A.length; i++) {
			value ^= A[i];
		}
		return value;
	}
}
