package com.biancama.codility.maximumsliceproblem;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class MaxDoubleSliceSumTest {

	@Test
	public void test01() {
		MaxDoubleSliceSum solution = new MaxDoubleSliceSum();
		int[] input = {3, 2, 6, -1, 4, 5, -1, 2};
		assertThat(solution.solution(input)).isEqualTo(17);
	}

	@Test
	public void test02() {
		MaxDoubleSliceSum solution = new MaxDoubleSliceSum();
		int[] input = {5, -7, 3, 5, -2, 4, -1};
		assertThat(solution.solution(input)).isEqualTo(17);
	}

	@Test
	public void test03() {
		MaxDoubleSliceSum solution = new MaxDoubleSliceSum();
		int[] input = {1, 5, -7, 3, 5};
		assertThat(solution.solution(input)).isEqualTo(17);
	}
}
