package com.biancama.codility.euclideanalgorithm;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 14/09/16.
 */
public class ChocolatesByNumbersTest {

	@Test
	public void test01() {
		ChocolatesByNumbers solution = new ChocolatesByNumbers();
		assertThat(solution.solution(10, 4)).isEqualTo(5);
	}

	@Test
	public void test02() {
		ChocolatesByNumbers solution = new ChocolatesByNumbers();
		assertThat(solution.solution(11, 4)).isEqualTo(11);
	}


}
