package com.biancama.codility.timecomplexity;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class PermMissingElemTest {

	@Test
	public void test01() {
		PermMissingElem solution = new PermMissingElem();
		int[] a = {2, 3, 1, 5};
		assertThat(solution.solution(a)).isEqualTo(4);
	}


	@Test
	public void test02() {
		PermMissingElem solution = new PermMissingElem();
		int[] a = {};
		assertThat(solution.solution(a)).isEqualTo(1);
	}


	@Test
	public void test03() {
		PermMissingElem solution = new PermMissingElem();
		int[] a = {8, 7, 6, 5, 4, 3, 2};
		assertThat(solution.solution(a)).isEqualTo(1);
	}

	@Test
	public void test04() {
		PermMissingElem solution = new PermMissingElem();
		int[] a = {8, 7, 1, 5, 4, 3, 2};
		assertThat(solution.solution(a)).isEqualTo(6);
	}
	@Test
	public void test05() {
		PermMissingElem solution = new PermMissingElem();
		int[] a = {6, 7, 1, 5, 4, 3, 2};
		assertThat(solution.solution(a)).isEqualTo(8);
	}
}
