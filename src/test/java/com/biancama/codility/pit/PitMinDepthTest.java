package com.biancama.codility.pit;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 14/09/16.
 */
public class PitMinDepthTest {

	@Test
	public void test01() {
		PitMinDepth solution = new PitMinDepth();
		int[] input = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3};
		assertThat(solution.solution(input)).isEqualTo(4);
	}
}
