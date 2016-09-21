package com.biancama.codility.countingelements;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class PermCheckTest {

	@Test
	public void test01() {
		PermCheck solution = new PermCheck();
		int[] a = {4, 1, 3, 2};
		assertThat(solution.solution(a)).isEqualTo(1);
	}

	@Test
	public void test02() {
		PermCheck solution = new PermCheck();
		int[] a = {4, 1, 3};
		assertThat(solution.solution(a)).isEqualTo(0);
	}

	@Test
	public void test03() {
		PermCheck solution = new PermCheck();
		int[] a = {4, 1, 3, 2, 4};
		assertThat(solution.solution(a)).isEqualTo(0);
	}

	@Test
	public void test04() {
		PermCheck solution = new PermCheck();
		int[] a = {4, 1, 3, 2, 4};
		assertThat(solution.solution(a)).isEqualTo(0);
	}
}
