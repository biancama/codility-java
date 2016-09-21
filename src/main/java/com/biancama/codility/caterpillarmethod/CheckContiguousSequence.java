package com.biancama.codility.caterpillarmethod;

/**
 * Created by massimo on 14/09/16.
 */
public class CheckContiguousSequence {
	public boolean solution(int[] a, int s) {
		int n = a.length;
		int front = 0, total = 0;
		for (int back = 0; back < n; back++) {
			while (front < n && total + a[front] <= s) {
				total += a[front];
				front++;
			}
			if (total == s) {
				return true;
			}
			total -= a[back];
		}
		return false;
	}
}
