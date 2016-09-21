package com.biancama.codility.leader;

import java.util.Stack;

/**
 * Created by massimo on 13/09/16.
 */
public class Dominator {

	public int solution(int[] A) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < A.length; i++) {
			if (stack.empty() || stack.peek() == A[i]) {
				stack.push(A[i]);
			} else {
				stack.pop();
			}
		}
		if (stack.empty() ) {
			return -1;
		} else {
			int candidate = stack.peek();
			int counterForCandidate = 0;
			int indexOfCandidate = -1;
			for (int i = 0; i < A.length; i++) {
				if (A[i] == candidate) {
					counterForCandidate++;
					if (indexOfCandidate == -1) {
						indexOfCandidate = i;
					}
				}

			}
			if (counterForCandidate > A.length/2) {
				return indexOfCandidate;
			}
		}
		return -1;
	}
}
