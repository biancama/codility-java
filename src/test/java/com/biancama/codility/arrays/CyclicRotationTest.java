package com.biancama.codility.arrays;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 12/09/16.
 */
public class CyclicRotationTest {

	@Test
	public void test01() {
		CyclicRotation solution = new CyclicRotation();
		int[] a = {3, 8, 9, 7, 6};
		int[] exp = {6, 3, 8, 9, 7};
		assertThat(solution.solution(a, 1)).isEqualTo(exp);
	}


	@Test
	public void test02() {
		CyclicRotation solution = new CyclicRotation();
		int[] a = {3, 8, 9, 7, 6};
		int[] exp = {7, 6, 3, 8, 9};
		assertThat(solution.solution(a, 2)).isEqualTo(exp);
	}


	@Test
	public void test03() {
		CyclicRotation solution = new CyclicRotation();
		int[] a = {3, 8, 9, 7, 6};
		int[] exp = {9, 7, 6, 3, 8};
		assertThat(solution.solution(a, 3)).isEqualTo(exp);
	}


	@Test
	public void test04() {
		CyclicRotation solution = new CyclicRotation();
		int[] a = {3, 8, 9, 7, 6};
		int[] exp = {3, 8, 9, 7, 6};
		assertThat(solution.solution(a, 5)).isEqualTo(exp);
	}

	@Test
	public void test05() {
		CyclicRotation solution = new CyclicRotation();
		int[] a = {};
		int[] exp = {};
		assertThat(solution.solution(a, 1)).isEqualTo(exp);
	}

	@Test
	public void test06() {
		CyclicRotation solution = new CyclicRotation();
		int[] a = {3, 8, 9, 7, 6};
		int[] exp = {3, 8, 9, 7, 6};
		assertThat(solution.solution(a, 0)).isEqualTo(exp);
	}

	@Test
	public void test07() {
		CyclicRotation solution = new CyclicRotation();
		int[] a = {3, 8, 9, 7, 6};
		int[] exp = {3, 8, 9, 7, 6};
		assertThat(solution.solution(a, 10)).isEqualTo(exp);
	}

	@Test
	public void test08() {
		CyclicRotation solution = new CyclicRotation();
		int[] a = {3, 8, 9, 7, 6};
		int[] exp = {6, 3, 8, 9, 7};
		assertThat(solution.solution(a, 11)).isEqualTo(exp);
	}
}
