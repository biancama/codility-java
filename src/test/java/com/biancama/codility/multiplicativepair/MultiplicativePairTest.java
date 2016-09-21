package com.biancama.codility.multiplicativepair;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 14/09/16.
 */
public class MultiplicativePairTest {

	@Test
	public void test01() {
		MultiplicativePair solution = new MultiplicativePair();
		int[] A ={0, 1, 2, 2, 3, 5};
		int[] B ={500000, 500000, 0, 0, 0, 20000};
		assertThat(solution.solution(A, B)).isEqualTo(8);
	}
}
