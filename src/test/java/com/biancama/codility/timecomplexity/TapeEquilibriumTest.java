package com.biancama.codility.timecomplexity;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 12/09/16.
 */
public class TapeEquilibriumTest {

	@Test
	public void test01() {
		TapeEquilibrium solution = new TapeEquilibrium();
		int[] a = {3, 1, 2, 4, 3};
		assertThat(solution.solution(a)).isEqualTo(1);
	}

	@Test
	public void test02() {
		TapeEquilibrium solution = new TapeEquilibrium();
		int[] a = {3, 1};
		assertThat(solution.solution(a)).isEqualTo(2);
	}

	@Test
	public void test03() {
		TapeEquilibrium solution = new TapeEquilibrium();
		int[] a = {-3, 1};
		assertThat(solution.solution(a)).isEqualTo(4);
	}

	@Test
	public void test04() {
		TapeEquilibrium solution = new TapeEquilibrium();
		int[] a = {1, 1};
		assertThat(solution.solution(a)).isEqualTo(0);
	}

	@Test
	public void test05() {
		TapeEquilibrium solution = new TapeEquilibrium();
		int[] a = {3, 3, 4, 2, 1};
		assertThat(solution.solution(a)).isEqualTo(1);
	}

	@Test
	public void test06() {
		TapeEquilibrium solution = new TapeEquilibrium();
		int[] a = {3, 4, 6, -1, -1, 11};
		assertThat(solution.solution(a)).isEqualTo(0);
	}

	/**
	 * Created by massimo on 12/09/16.
	 */
	public static class FrogJmpTest {

		@Test
		public void test01() {
			FrogJmp solution = new FrogJmp();
			assertThat(solution.solution(10, 85, 30)).isEqualTo(3);
		}

		@Test
		public void test02() {
			FrogJmp solution = new FrogJmp();
			assertThat(solution.solution(1, 1, 1)).isEqualTo(0);
		}

		@Test
		public void test03() {
			FrogJmp solution = new FrogJmp();
			assertThat(solution.solution(1, 2, 100)).isEqualTo(1);
		}


		@Test
		public void test04() {
			FrogJmp solution = new FrogJmp();
			assertThat(solution.solution(10, 100, 30)).isEqualTo(3);
		}


		@Test
		public void test05() {
			FrogJmp solution = new FrogJmp();
			assertThat(solution.solution(10, 101, 30)).isEqualTo(4);
		}

		@Test
		public void test06() {
			FrogJmp solution = new FrogJmp();
			assertThat(solution.solution(1, 1000000000, 1)).isEqualTo(999999999);
		}



	}
}
