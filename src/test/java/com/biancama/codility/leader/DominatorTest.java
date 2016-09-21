package com.biancama.codility.leader;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class DominatorTest {
	@Test
	public void test01() {
		Dominator solution = new Dominator();
		int[] input = {3, 4, 3, 2, 3, -1, 3, 3};
		assertThat(solution.solution(input)).isEqualTo(0);
	}


	@Test
	public void test02() {
		Dominator solution = new Dominator();
		int[] input = {1, 2, 3, 4, 5, 6};
		assertThat(solution.solution(input)).isEqualTo(-1);
	}


	@Test
	public void test03() {
		Dominator solution = new Dominator();
		int[] input = {3, 4, 3, 2, 3, -1, 3, 3, 2};
		assertThat(solution.solution(input)).isEqualTo(0);
	}

	@Test
	public void test04() {
		Dominator solution = new Dominator();
		int[] input = {3, 4, 3, 2, 3, -1, 3, 3, 2, 1};
		assertThat(solution.solution(input)).isEqualTo(-1);
	}

	@Test
	public void test05() {
		Dominator solution = new Dominator();
		int[] input = {};
		assertThat(solution.solution(input)).isEqualTo(-1);
	}

	@Test
	public void test06() {
		Dominator solution = new Dominator();
		int[] input = {1};
		assertThat(solution.solution(input)).isEqualTo(0);
	}

	@Test
	public void test07() {
		Dominator solution = new Dominator();
		int[] input = {1, 2, 3};
		assertThat(solution.solution(input)).isEqualTo(-1);
	}
}
