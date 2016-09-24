package com.biancama.codility.countingelements;

/**
 * Created by massimo on 21/09/16.
 */
public class TapeEquilibrium {

	public int solution(int[] A) {
		int n = A.length;
		int[] sumPrefix = new int[n], sumSuffix =  new int[n];
		int minAbsoluteDifference = Integer.MAX_VALUE;
		sumPrefix[0] = 0;
		sumSuffix[n - 1] = A[n-1];
		for (int i = 1; i < n; i++) {
			sumPrefix[i] = sumPrefix[i-1] + A[i-1];
		}

		for (int i = n - 2; i >=0 ; i--) {
			sumSuffix[i] = sumSuffix[i+1] + A[i];
		}

		for (int i = 1; i < n; i++) {
			int absoluteDifference = Math.abs(sumPrefix[i] - sumSuffix[i]);
			if (absoluteDifference < minAbsoluteDifference) {
				minAbsoluteDifference = absoluteDifference;
			}
		}
		return minAbsoluteDifference;
	}
}
