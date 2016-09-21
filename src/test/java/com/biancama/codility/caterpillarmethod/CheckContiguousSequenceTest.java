package com.biancama.codility.caterpillarmethod;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 14/09/16.
 */
public class CheckContiguousSequenceTest {

	@Test
	public void test01() {
		CheckContiguousSequence solution = new CheckContiguousSequence();
		int input[] = {6, 2, 7, 4, 1, 3, 6};

		assertThat(solution.solution(input, 12)).isEqualTo(true);
	}
}
