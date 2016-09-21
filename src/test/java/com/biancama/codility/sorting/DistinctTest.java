package com.biancama.codility.sorting;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class DistinctTest {
	@Test
	public void test01() {
		Distinct solution = new Distinct();
		int[] a = {2, 1, 1, 2, 3, 1};
		assertThat(solution.solution(a)).isEqualTo(3);
	}

	@Test
	public void test02() {
		Distinct solution = new Distinct();
		int[] a = {};
		assertThat(solution.solution(a)).isEqualTo(0);
	}


	@Test
	public void test03() {
		Distinct solution = new Distinct();
		int[] a = {100};
		assertThat(solution.solution(a)).isEqualTo(1);
	}

	@Test
	public void test04() {
		Distinct solution = new Distinct();
		int[] a = {100, -100};
		assertThat(solution.solution(a)).isEqualTo(2);
	}


	@Test
	public void test05() {
		Distinct solution = new Distinct();
		int[] a = {100, 100, 100, 100};
		assertThat(solution.solution(a)).isEqualTo(1);
	}

}
