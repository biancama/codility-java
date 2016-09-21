package com.biancama.codility.prefixsums;

/**
 * Created by massimo on 13/09/16.
 */
public class MinAvgTwoSlice {

	public int solution(int[] A) {
		int[] prefixSum = calculatePrefixSum(A);
		double minAvgSliceSoFar = Integer.MAX_VALUE;
		int minStartingPosition = -1;
		for (int i = 0; i < A.length; i++) {
			double minAvgForIndexI = calculateMinAvgForIndexI(prefixSum, i);
			if (minAvgForIndexI < minAvgSliceSoFar) {
				minAvgSliceSoFar = minAvgForIndexI;
				minStartingPosition = i;
			}
		}
		return minStartingPosition;
	}

	private double calculateMinAvgForIndexI(int[] prefixSum, int i) {
		double minAvgSliceSoFar = Integer.MAX_VALUE;
		for (int j = i + 1; j < prefixSum.length - 1; j++) {
			double minAvgForIndexJ = prefixSum[j + 1] - prefixSum[i];
			minAvgForIndexJ /= (j - i + 1);
			if (minAvgForIndexJ < minAvgSliceSoFar) {
				minAvgSliceSoFar = minAvgForIndexJ;;
			}
		}

		return minAvgSliceSoFar;
	}

	private int[] calculatePrefixSum(int[] a) {
		int[] result = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			result[i+1] = result[i] + a[i];
		}
		return result;
	}
}
