package com.biancama.codility.stacksandqueues;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class NestingTest {

	@Test
	public void test01() {
		Nesting solution = new Nesting();
		String input = "(()(())())";
		assertThat(solution.solution(input)).isEqualTo(1);
	}


	@Test
	public void test02() {
		Nesting solution = new Nesting();
		String input = "())";
		assertThat(solution.solution(input)).isEqualTo(0);
	}

	@Test
	public void test03() {
		Nesting solution = new Nesting();
		String input = "(()(())())()";
		assertThat(solution.solution(input)).isEqualTo(1);
	}

	@Test
	public void test04() {
		Nesting solution = new Nesting();
		String input = ")(()(())())()";
		assertThat(solution.solution(input)).isEqualTo(0);
	}

	@Test
	public void test05() {
		Nesting solution = new Nesting();
		String input = "(()(())()))";
		assertThat(solution.solution(input)).isEqualTo(0);
	}
	@Test
	public void test06() {
		Nesting solution = new Nesting();
		String input = "";
		assertThat(solution.solution(input)).isEqualTo(1);
	}

}
