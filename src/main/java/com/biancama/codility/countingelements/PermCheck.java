package com.biancama.codility.countingelements;

import java.util.Arrays;

/**
 * Created by massimo on 13/09/16.
 */
public class PermCheck {
	public int solution(int[] A) {

		boolean[] checks = new boolean[A.length];
		Arrays.fill(checks, false);

		for (int i = 0; i < A.length; i++) {
			if (A[i] > A.length) {
				return 0;
			}
			checks[A[i] - 1] = true;
		}
		for (int i = 0; i < A.length; i++) {
			if (!checks[i]) {
				return 0;
			}
		}
		return 1;
	}
}
