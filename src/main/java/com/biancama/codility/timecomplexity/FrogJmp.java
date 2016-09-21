package com.biancama.codility.timecomplexity;

/**
 * Created by massimo on 12/09/16.
 */
public class FrogJmp {
	public int solution(int X, int Y, int D) {
		double result = Y - X;
		result /= D;
		return (int) Math.ceil(result);
	}
}
