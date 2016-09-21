package com.biancama.codility.prefixsums;

import org.junit.Test;

import java.util.Arrays;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class PassingCarsTest {

	@Test
	public void test01() {
		PassingCars solution = new PassingCars();
		int[] a = {0, 1, 0, 1, 1};
		assertThat(solution.solution(a)).isEqualTo(5);
	}

	@Test
	public void test02() {
		PassingCars solution = new PassingCars();
		int[] a = {0, 0, 0, 0, 1};
		assertThat(solution.solution(a)).isEqualTo(4);
	}

	@Test
	public void test03() {
		PassingCars solution = new PassingCars();
		int[] a = {1, 1, 0, 0, 0, 0, 1};
		assertThat(solution.solution(a)).isEqualTo(4);
	}
	@Test
	public void test04() {
		PassingCars solution = new PassingCars();
		int[] a = {1, 1, 1, 1, 1, 1, 1};
		assertThat(solution.solution(a)).isEqualTo(0);
	}
	@Test
	public void test05() {
		PassingCars solution = new PassingCars();
		int[] a = {0,0,0,0,0,0};
		assertThat(solution.solution(a)).isEqualTo(0);
	}

	@Test
	public void test06() {
		PassingCars solution = new PassingCars();
		int[] a = {1,0,1,0,1,0, 1};
		assertThat(solution.solution(a)).isEqualTo(6);
	}

	@Test
	public void test07() {
		PassingCars solution = new PassingCars();
		int[] a = new int[100000];
		a[0]= 0;
		Arrays.fill(a, 1, a.length , 1);
		assertThat(solution.solution(a)).isEqualTo(99999);
	}
	@Test
	public void test08() {
		PassingCars solution = new PassingCars();
		int[] a = new int[100000];
		Arrays.fill(a, a.length/2, a.length , 1);
		assertThat(solution.solution(a)).isEqualTo(-1);
	}

}
