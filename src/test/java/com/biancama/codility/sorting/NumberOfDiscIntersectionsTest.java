package com.biancama.codility.sorting;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class NumberOfDiscIntersectionsTest {
	@Test
	public void test01() {
		NumberOfDiscIntersections solution = new NumberOfDiscIntersections();
		int[] a = {1, 5, 2, 1, 4, 0};
		assertThat(solution.solution(a)).isEqualTo(11);
	}
}
