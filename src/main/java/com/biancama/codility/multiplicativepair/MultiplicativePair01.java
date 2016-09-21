package com.biancama.codility.multiplicativepair;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by massimo on 14/09/16.
 */
public class MultiplicativePair01 {
	// multiplicative
	private static final double ONE_MILLION = 1000000.0d;
	private static final int THRESHOLD = 1000 * 1000 * 1000;
	private static final double ERROR = 0.5d / ONE_MILLION / ONE_MILLION;

	public int solution(int[] A, int[] B) {
		return solution(IntStream
				.range(0, Math.min(A.length, B.length)).parallel()
				.mapToDouble(i -> A[i] + B[i] / ONE_MILLION).toArray());
	}

	public int solution(double[] C) {
		int n = C.length;
		int result = 0;
		for (int i = 0; i < n - 1; i++) {
			if (C[i] < 1) {
				int indexOfLastZero = -Arrays.binarySearch(C, i + 1, n, ERROR) - 1;
				result += indexOfLastZero - (i + 1);
			} else {
				double c = C[i] / (double) (C[i] - 1) - ERROR;
				int indexOfFirstGreater = -Arrays.binarySearch(C, i + 1, n, c) - 1;
				result += n - indexOfFirstGreater;
			}
			if (result > THRESHOLD) {
				return THRESHOLD;
			}
		}
		return result;
	}
}
