// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.math.BigInteger;

class Solution {
	private static int LEAST_SIGNIFICANT_DIGITS = 1000000;
	public int solution(int N) {
		BigInteger fibonacci = getFibonacciNumber(N);
		int leastDigits =  fibonacci.remainder(BigInteger.valueOf(LEAST_SIGNIFICANT_DIGITS)).intValue() ;
		return leastDigits;
	}

	public static BigInteger getFibonacciNumber(int n) {

		if (n <= 1) return BigInteger.valueOf(n);

		BigInteger[][] result = {{BigInteger.valueOf(1), BigInteger.valueOf(0)}, {BigInteger.valueOf(0), BigInteger.valueOf(1)}}; // identity matrix.
		BigInteger[][] fiboM = {{BigInteger.valueOf(1), BigInteger.valueOf(1)}, {BigInteger.valueOf(1), BigInteger.valueOf(0)}};

		while (n > 0) {
			if (n%2 == 1) {
				fibonacciMatrix(result, fiboM);
			}
			n = n / 2;
			fibonacciMatrix(fiboM, fiboM);
		}

		return result[1][0];
	}

	private static void fibonacciMatrix(BigInteger[][] m, BigInteger [][] n) {
		BigInteger a = m[0][0].multiply(n[0][0]).add(m[0][1].multiply(n[1][0]));
		BigInteger b = m[0][0].multiply(n[0][1]).add(m[0][1].multiply(n[1][1]));
		BigInteger c = m[1][0].multiply(n[0][0]).add(m[1][1].multiply(n[0][1]));
		BigInteger d = m[1][0].multiply(n[0][1]).add(m[1][1].multiply(n[1][1]));

		m[0][0] = a;
		m[0][1] = b;
		m[1][0] = c;
		m[1][1] = d;
	}
}