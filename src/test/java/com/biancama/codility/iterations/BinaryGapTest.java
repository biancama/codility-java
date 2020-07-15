package com.biancama.codility.iterations;


import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class BinaryGapTest {
	@Test
	public void test01() {
		BinaryGap binaryGap = new BinaryGap();
		assertThat(binaryGap.solution(9)).isEqualTo(2);
		assertThat(binaryGap.solution(529)).isEqualTo(4);
		assertThat(binaryGap.solution(20)).isEqualTo(1);
		assertThat(binaryGap.solution(15)).isEqualTo(0);

		assertThat(binaryGap.solution(10)).isEqualTo(1);
		assertThat(binaryGap.solution(32)).isEqualTo(0);
		assertThat(binaryGap.solution(1041)).isEqualTo(5);

	}
}
