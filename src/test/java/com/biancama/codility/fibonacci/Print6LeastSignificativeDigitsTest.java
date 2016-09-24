package com.biancama.codility.fibonacci;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 21/09/16.
 */
public class Print6LeastSignificativeDigitsTest {
	@Test
	public void test01() {
		Print6LeastSignificativeDigits solution = new Print6LeastSignificativeDigits();
		int N = 8;
		assertThat(solution.solution(N)).isEqualTo(21);
	}

	@Test
	public void test02() {
		Print6LeastSignificativeDigits solution = new Print6LeastSignificativeDigits();
		int N = 36;
		assertThat(solution.solution(N)).isEqualTo(930352);
	}


	@Test
	public void test03() {
		Print6LeastSignificativeDigits solution = new Print6LeastSignificativeDigits();
		int N = 0;
		assertThat(solution.solution(N)).isEqualTo(0);
	}

	@Test
	public void test04() {
		Print6LeastSignificativeDigits solution = new Print6LeastSignificativeDigits();
		int N = 100000;
		assertThat(solution.solution(N)).isEqualTo(876091);
	}

	@Test
	public void test05() {
		Print6LeastSignificativeDigits solution = new Print6LeastSignificativeDigits();
		int N = 10000000;
		assertThat(solution.solution(N)).isEqualTo(876091);
	}
}
