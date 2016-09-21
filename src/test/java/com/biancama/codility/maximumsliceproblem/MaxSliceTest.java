package com.biancama.codility.maximumsliceproblem;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 15/09/16.
 */
public class MaxSliceTest {
	@Test
	public void test01() {
		MaxSlice solution = new MaxSlice();
		int[] a = {5, -7, 3, 5, -2, 4, -1};
		assertThat(solution.solution(a)).isEqualTo(10);
	}
}
