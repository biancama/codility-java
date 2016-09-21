package com.biancama.codility.countingelements;

import java.util.Arrays;

/**
 * Created by massimo on 13/09/16.
 */
public class MaxCounters {
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		boolean maxUpdated = false;
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N) {
				int newCounter = increase(counters, A[i] - 1);
				if (newCounter > max) {
					max = newCounter;
					maxUpdated = true;
				}
			} else {
				if (maxUpdated) {
					maxCounter(counters, max);
					maxUpdated = false;
				}
			}
		}

		return counters;
	}

	private void maxCounter(int[] counters, int max) {
		Arrays.fill(counters, max);
	}

	private int increase(int[] counters, int index) {
		counters[index]++;
		return counters[index];
	}
}
