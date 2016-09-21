package com.biancama.codility.linkedlist;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 14/09/16.
 */
public class LinkedListLengthTest {
	@Test
	public void test01() {
		LinkedListLength solution = new LinkedListLength();
		IntList d = new IntList('D', null);
		IntList c = new IntList('C', d);
		IntList b = new IntList('B', c);
		IntList a = new IntList('A', b);

		assertThat(solution.solution(a)).isEqualTo(4);
	}
}
