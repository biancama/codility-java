package com.biancama.codility;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 12/09/16.
 */
public class EquiTest {

	@Test
	public void test01() {
		Equi solution = new Equi();
		int[] a = {-1, 3, -4, 5, 1, -6, 2, 1};
		assertThat(solution.solution(a)).isEqualTo(1);
	}


	@Test
	public void test02() {
		Equi solution = new Equi();
		int[] a = {-1};
		assertThat(solution.solution(a)).isEqualTo(0);
	}


	@Test
	public void test03() {
		Equi solution = new Equi();
		int[] a = {-1, 2};
		assertThat(solution.solution(a)).isEqualTo(-1);
	}
	@Test
	public void test04() {
		Equi solution = new Equi();
		int[] a = {-1, 1, 3};
		assertThat(solution.solution(a)).isEqualTo(2);
	}

	@Test
	public void test05() {
		Equi solution = new Equi();
		int[] a = {};
		assertThat(solution.solution(a)).isEqualTo(-1);
	}
}
