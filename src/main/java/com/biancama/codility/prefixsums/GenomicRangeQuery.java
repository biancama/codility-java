package com.biancama.codility.prefixsums;

/**
 * Created by massimo on 13/09/16.
 */
public class GenomicRangeQuery {

	public int[] solution(String S, int[] P, int[] Q) {
		int [][] genomes = computeGenome(S);

		int[] result = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			int fromIndex = P[i];
			int toIndex = Q[i] + 1;
			if (genomes[0][toIndex] - genomes[0][fromIndex] > 0 ) {
				result[i] = 1;
			} else if (genomes[1][toIndex] - genomes[1][fromIndex] > 0 ) {
				result[i] = 2;
			} else if (genomes[2][toIndex] - genomes[2][fromIndex] > 0 ) {
				result[i] = 3;
			} else {
				result[i] = 4;
			}
		}
		return result;
	}

	private int[][] computeGenome(String s) {
		int[][] result = new int[3][s.length() + 1];
		for (int i = 0; i < s.length(); i++) {
			int a = 0, c = 0, g = 0;
			if (s.charAt(i) == 'A') {
				a = 1;
			} else if (s.charAt(i) == 'C') {
				c = 1;
			} else if (s.charAt(i) == 'G') {
				g = 1;
			}
			result[0][i+1] = result[0][i] + a;
			result[1][i+1] = result[1][i] + c;
			result[2][i+1] = result[2][i] + g;
		}
		return result;
	}

}
