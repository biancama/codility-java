package com.biancama.codility.countingelements;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class MaxCountersTest {

	@Test
	public void test01() {
		MaxCounters solution = new MaxCounters();
		int[] a = {3, 4, 4, 6, 1, 4, 4};
		int[] exp = {3, 2, 2, 4, 2};
		assertThat(solution.solution(5, a)).isEqualTo(exp);
	}


	@Test
	public void test02() {
		MaxCounters solution = new MaxCounters();
		int[] a = {2};
		int[] exp = {0, 1, 0, 0, 0};
		assertThat(solution.solution(5, a)).isEqualTo(exp);
	}

	@Test
	public void test03() {
		MaxCounters solution = new MaxCounters();
		int[] a = {6};
		int[] exp = {0, 0, 0, 0, 0};
		assertThat(solution.solution(5, a)).isEqualTo(exp);
	}

	@Test
	public void test04() {
		MaxCounters solution = new MaxCounters();
		int[] a = {1, 6};
		int[] exp = {1, 1, 1, 1, 1};
		assertThat(solution.solution(5, a)).isEqualTo(exp);
	}

	@Test
	public void test05() {
		MaxCounters solution = new MaxCounters();
		int[] a = {3, 4, 4, 6, 1, 4, 4, 6, 6};
		int[] exp = {4, 4, 4, 4, 4};
		assertThat(solution.solution(5, a)).isEqualTo(exp);
	}
}
