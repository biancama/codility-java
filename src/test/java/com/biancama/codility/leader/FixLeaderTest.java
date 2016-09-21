package com.biancama.codility.leader;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 14/09/16.
 */
public class FixLeaderTest {
	@Test
	public void test01() {
		FixLeader solution = new FixLeader();
		int[] input = {2, 2, 2, 2, 2, 3, 4, 4, 4, 6};
		assertThat(solution.solution(input)).isEqualTo(-1);
	}

	@Test
	public void test02() {
		FixLeader solution = new FixLeader();
		int[] input = {1, 1, 1, 1, 50};
		assertThat(solution.solution(input)).isEqualTo(1);
	}

	@Test
	public void test03() {
		FixLeader solution = new FixLeader();
		int[] input = {1};
		assertThat(solution.solution(input)).isEqualTo(1);
	}

	@Test
	public void test04() {
		FixLeader solution = new FixLeader();
		int[] input = {1, 1, 1, 10, 50};
		assertThat(solution.solution(input)).isEqualTo(1);
	}

	@Test
	public void test05() {
		FixLeader solution = new FixLeader();
		int[] input = {1, 1, 2, 2, 2, 2, 2, 10, 50};
		assertThat(solution.solution(input)).isEqualTo(2);
	}


	@Test
	public void test06() {
		FixLeader solution = new FixLeader();
		int[] input = {2, 2, 2, 2, 2, 2, 4, 4, 4, 6};
		assertThat(solution.solution(input)).isEqualTo(2);
	}
	@Test
	public void test07() {
		FixLeader solution = new FixLeader();
		int[] input = {1, 2, 2, 2, 2, 2, 2, 4, 4, 6};
		assertThat(solution.solution(input)).isEqualTo(2);
	}
}
