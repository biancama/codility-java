package com.biancama.codility.stacksandqueues;

import java.util.Stack;

/**
 * Created by massimo on 13/09/16.
 */
public class Nesting {

	public int solution(String S) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if (!stack.empty() && S.charAt(i) == ')') {
				Character character = stack.peek();
				if (character.equals('(')) {
					stack.pop();
				}
			} else {
				stack.push(S.charAt(i));
			}
		}
		return stack.empty() ? 1: 0;
	}
}
