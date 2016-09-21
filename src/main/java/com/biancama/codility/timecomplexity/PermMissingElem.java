package com.biancama.codility.timecomplexity;

import java.util.Arrays;

/**
 * Created by massimo on 13/09/16.
 */
public class PermMissingElem {
	public int solution(int[] A) {
		if (A.length == 0) {
			return 1;
		}
		boolean[] checks = new boolean[A.length + 1];
		Arrays.fill(checks, false);
		for (int i = 0; i < A.length; i++) {
			checks[A[i] - 1] = true;
		}
		for (int i = 0; i < A.length + 1; i++) {
			if (!checks[i] ) {
				return i + 1;
			}
		}
		return 0;
	}
}
