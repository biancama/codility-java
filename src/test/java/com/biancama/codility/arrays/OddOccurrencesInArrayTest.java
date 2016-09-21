package com.biancama.codility.arrays;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 12/09/16.
 */
public class OddOccurrencesInArrayTest {

	@Test
	public void test01() {
		OddOccurrencesInArray solution = new OddOccurrencesInArray();
		int[] a = {9, 3, 9, 3, 9,  7, 9};
		assertThat(solution.solution(a)).isEqualTo(7);
	}

	@Test
	public void test02() {
		OddOccurrencesInArray solution = new OddOccurrencesInArray();
		int[] a = {9, 9,9, 9, 5};
		assertThat(solution.solution(a)).isEqualTo(5);
	}



}
