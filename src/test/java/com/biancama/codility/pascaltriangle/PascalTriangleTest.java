package com.biancama.codility.pascaltriangle;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by massimo on 13/09/16.
 */
public class PascalTriangleTest {

	@Test
	public void test01() {
		PascalTriangle solution = new PascalTriangle();
		boolean[] input = {true, false, false, true, false};
		assertThat(solution.solution(input)).isEqualTo(11);
	}

	@Test
	public void test02() {
		PascalTriangle solution = new PascalTriangle();
		boolean[] input = {true, false, false, true};
		assertThat(solution.solution(input)).isEqualTo(7);
	}

	@Test
	public void test03() {
		PascalTriangle solution = new PascalTriangle();
		boolean[] input = {false, false, false, false};
		assertThat(solution.solution(input)).isEqualTo(0);
	}

	@Test
	public void test04() {
		PascalTriangle solution = new PascalTriangle();
		boolean[] input = {true, true, true, true};
		assertThat(solution.solution(input)).isEqualTo(10);
	}

	@Test
	public void test05() {
		PascalTriangle solution = new PascalTriangle();
		boolean[] input = {true, false, true, false};
		assertThat(solution.solution(input)).isEqualTo(8);
	}

	@Test
	public void test06() {
		PascalTriangle solution = new PascalTriangle();
		boolean[] input = new boolean[100000];
		Arrays.fill(input, true);
		assertThat(solution.solution(input)).isEqualTo(100000 * 100001 /2);
	}

	@Test
	public void test07() {
		PascalTriangle solution = new PascalTriangle();
		boolean[] input = new boolean[44721];
		Arrays.fill(input, true);
		assertThat(solution.solution(input)).isEqualTo(44721 * 44722 /2);
	}

	@Test
	public void test08() {
		PascalTriangle solution = new PascalTriangle();
		boolean[] input = new boolean[100000];
		Arrays.fill(input, false);
		assertThat(solution.solution(input)).isEqualTo(0);
	}
}
