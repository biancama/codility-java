package com.biancama.codility.iterations;

/**
 * Created by massimo on 12/09/16.
 */
public class BinaryGap {

	public int solution(int n) {
		return solution(n, 0, 0);
	}

	private int solution(int n, int max, int current) {
		if (n == 0) {
			return max;
		} else if (n % 2 == 0) {
			return solution(n/2, max, current + 1);
		} else {
			return solution(n/2, Math.max(max, current), 0);
		}
	}

	private int iterativeSolution(int N) {
		int maxBinaryGaps = 0;
		boolean isInAGap = false;
		int binaryGap = 0;
		while (N > 0) {
			if (N % 2 == 0) {
				if (isInAGap) {
					binaryGap++;
				}
			} else {
				isInAGap = true;
				if (binaryGap > maxBinaryGaps) {
					maxBinaryGaps = binaryGap;
				}
				binaryGap = 0;
			}
			N = N / 2;
		}
		return maxBinaryGaps;
	}
}
