package com.biancama.codility.maximumsliceproblem;


import java.util.Arrays;

/**
 * Created by massimo on 14/09/16.
 */
public class MinAbsSlice {

	public int solution(int[] A) {
		int n = A.length;
		int [] p = new int[n + 1];
		int min = Integer.MAX_VALUE;
		int dif = 0 ;
		p[0] = 0;
		for (int i = 1; i <= n; i++) {
			p[i] = p[i-1] + A[i-1];
		}
		Arrays.sort(p);
		for (int i = 1; i <= n; i++) {
			dif = p[i]-p[i-1];
			if(dif<min) {
				min = dif;
			}
		}
		return min;
	}

}
