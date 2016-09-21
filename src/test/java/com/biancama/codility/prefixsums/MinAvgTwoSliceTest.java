package com.biancama.codility.prefixsums;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class MinAvgTwoSliceTest {

	@Test
	public void test01() {
		MinAvgTwoSlice solution = new MinAvgTwoSlice();
		int[] a = {4, 2, 2, 5, 1, 5, 8};
		assertThat(solution.solution(a)).isEqualTo(1);
	}
}
