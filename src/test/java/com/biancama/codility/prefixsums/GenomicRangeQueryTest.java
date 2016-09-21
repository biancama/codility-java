package com.biancama.codility.prefixsums;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by massimo on 13/09/16.
 */
public class GenomicRangeQueryTest {
	@Test
	public void test01() {
		GenomicRangeQuery solution = new GenomicRangeQuery();
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		String S = "CAGCCTA";
		int[] exp = {2, 4, 1};
		assertThat(solution.solution(S, P, Q)).isEqualTo(exp);
	}

	@Test
	public void test02() {
		GenomicRangeQuery solution = new GenomicRangeQuery();
		int[] P = {0, 0, 0};
		int[] Q = {0, 0, 0};
		String S = "C";
		int[] exp = {2, 2, 2};
		assertThat(solution.solution(S, P, Q)).isEqualTo(exp);
	}


	@Test
	public void test03() {
		GenomicRangeQuery solution = new GenomicRangeQuery();
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		String S = "CAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTA";
		int[] exp = {2, 4, 1};
		assertThat(solution.solution(S, P, Q)).isEqualTo(exp);
	}

	@Test
	public void test04() {
		GenomicRangeQuery solution = new GenomicRangeQuery();
		int[] P = {0, 5, 0};
		int[] Q = {13, 5, 6};
		String S = "CAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTA";
		int[] exp = {1, 4, 1};
		assertThat(solution.solution(S, P, Q)).isEqualTo(exp);
	}

	@Test
	public void test05() {
		GenomicRangeQuery solution = new GenomicRangeQuery();
		int[] P = {0, 5, 0};
		int[] Q = {13, 5, 6};
		String S = RandomStringUtils.random(100000, new char[] {'G'});
		int[] exp = {3, 3, 3};
		assertThat(solution.solution(S, P, Q)).isEqualTo(exp);
	}

	@Test
	public void test06() {
		GenomicRangeQuery solution = new GenomicRangeQuery();
		int[] P = {0, 0, 0};
		int[] Q = {1300, 5000, 6000};
		String S = RandomStringUtils.random(100000, new char[] {'C', 'A', 'G', 'T'});
		int[] exp = {1, 1, 1};
		assertThat(solution.solution(S, P, Q)).isEqualTo(exp);
	}
}
