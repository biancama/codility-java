package com.biancama.codility.maximumsliceproblem;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 14/09/16.
 */
public class MinAbsSliceTest {
	@Test
	public void test01() {
		MinAbsSlice solution = new MinAbsSlice();
		int[] input = {2, -4, 6, -3, 9};
		assertThat(solution.solution(input)).isEqualTo(1);
	}
}
