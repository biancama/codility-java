package com.biancama.codility.primeandcompositenumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by massimo on 14/09/16.
 */
public class MinPerimeterRectangle {
	public int solution(int N) {
		List<Integer> divisors = getDivisors(N);
		long minPerimeter = Long.MAX_VALUE;
		for (Integer divisor : divisors) {
			int otherDivisor = N / divisor;
			long perimeter  = 2*(divisor + otherDivisor);
			if (perimeter < minPerimeter) {
				minPerimeter = perimeter;
			}
		}

		return (int) minPerimeter;
	}

	private List<Integer> getDivisors(int N) {
		List<Integer> result = new ArrayList<>();
		int i = 1;
		while (i*i < N) {
			if (N % i == 0) {
				result.add(i);
			}
			i++;
		}
		if (i*i == N) {
			result.add(i);
		}

		return result;
	}
}
