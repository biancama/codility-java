package com.biancama.codility.euclideanalgorithm;

/**
 * Created by massimo on 14/09/16.
 */
public class ChocolatesByNumbers {
	public int solution(int N, int M) {
		int gdcBetweenParameters = gdc(N, M, 1);
		return N / gdcBetweenParameters;
	}

	private int gdc(int a, int b, int res) {
		if (a == b) {
			return res * a;
		} else if (a % 2 == 0 && b % 2 == 0) {
			return gdc(a/2, b/2, 2 * res);
		} else if (a % 2 == 0) {
			return gdc(a/2, b, res);
		} else if (b % 2 == 0) {
			return gdc(a, b/2, res);
		} else if (a > b) {
			return gdc(a - b, b, res);
		} else {
			return gdc(a, b - a, res);
		}
	}
}
